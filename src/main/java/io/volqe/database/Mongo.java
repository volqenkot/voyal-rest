package io.volqe.database;

import com.mongodb.ConnectionString;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import io.volqe.utils.StringUtil;

import java.util.concurrent.ScheduledExecutorService;

public class Mongo {
    private final MongoClient mongoClient;
    private final MongoDatabase database;

    public Mongo(String uri, String dbName) {
        this.mongoClient = MongoClients.create(new ConnectionString(uri));
        this.database = mongoClient.getDatabase(dbName);
    }



    public MongoDatabase getDatabase() {
        return database;
    }

    public void close() {
        mongoClient.close();
    }

}
