package io.volqe.database;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.concurrent.ScheduledExecutorService;

public class MongoDb {
    private final MongoDatabase mongoClient;
    private MongoCollection<PlayerData> playerData;
    private ScheduledExecutorService executorService;

    public MongoDb(String uri, String dbName) {
        this.mongoClient = MongoClients.create(new ConnectionString(uri));
        this.database = mongoClient.getDatabase(dbName);
    }

    public com.mongodb.client.MongoDatabase getDatabase() {
        return database;
    }

    public void close() {
        mongoClient.close();
    }

}
