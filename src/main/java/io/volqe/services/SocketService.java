package io.volqe.services;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

public class SocketService extends WebSocketServer {

    // Set zum Verfolgen der offenen WebSocket-Verbindungen
    private Set<WebSocket> activeConnections;

    public SocketService(int port) {
        super(new InetSocketAddress(port));
        activeConnections = new HashSet<>(); // Initialisiere das Set
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("Neue Verbindung geöffnet: " + webSocket.getRemoteSocketAddress());
        activeConnections.add(webSocket); // Füge die WebSocket-Verbindung zur aktiven Liste hinzu
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println("Verbindung geschlossen: " + webSocket.getRemoteSocketAddress());
        activeConnections.remove(webSocket); // Entferne die WebSocket-Verbindung aus der aktiven Liste
    }

    @Override
    public void onMessage(WebSocket webSocket, String message) {
        // Zeigt die empfangene Nachricht des Clients an
        System.out.println("Nachricht vom Client: " + message);

        // Antwort an den Client senden
        webSocket.send("Antwort von der API: " + message);
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {
        System.out.println("Fehler beim Erzeugen der Client: " + e.getMessage());
    }

    @Override
    public void onStart() {
        System.out.println("WebSocket-Server gestartet!");
    }
}
