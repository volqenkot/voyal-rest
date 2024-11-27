package io.volqe;


import io.volqe.database.Mongo;
import io.volqe.services.SocketService;

public class APILoader {

    public static void startServices() {
        Mongo mongo = new Mongo("mongodb://localhost:27017", "voyal");
        new SocketService(2303).start();

    }



    public static void stopServices(){
    }
}
