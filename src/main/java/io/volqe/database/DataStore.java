package io.volqe.database;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

public class DataStore {
    private static DataStore instance;

    private ExecutorService executor;

    public static DataStore getInstance() {
        return instance;
    }

    private static HashMap<String, Object> dataStore = new HashMap<>();

    public void setPlayer(String key, Object value) {
        dataStore.put(key, value);
    }

    public Object getPlayer(String key) {
        return dataStore.get(key);
    }

    private void sendDatabase(String key, Object value) {

    }

    private void updatePlayer() {

    }

}
