package io.volqe;


import io.volqe.services.SocketService;

public class APILoader {
    public static void startServices() {
        new SocketService(2303).start();
    }



    public static void stopServices(){
    }
}
