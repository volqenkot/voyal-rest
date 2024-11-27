package io.volqe.services;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class SocketService extends WebSocketServer {

    public SocketService(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("Neue Verbindung geöffnet: " + webSocket.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println("Verbindung geschlossen: " + webSocket.getRemoteSocketAddress());
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
