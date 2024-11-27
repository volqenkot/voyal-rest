package io.volqe.database;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class PlayerData {
    private final MongoCollection<Document> playerData;
    private final ScheduledExecutorService executorService;

    public PlayerData(MongoCollection<Document> playerData, ScheduledExecutorService executorService) {
        this.playerData = playerData;
        this.executorService = executorService;
    }

    private Optional<Document> getPlayerData(UUID uuid) {
        return Optional.ofNullable(playerData.find(eq("_id", uuid)).first());
    }

    public void setPlayerData(UUID uuid, String key, Object value) {
        playerData.updateOne(eq("_id", uuid), set(key, value));
    }

    public void addPlayerData(UUID uuid, String key, Integer value) {
        Integer amount = getPlayerData(uuid).get().getInteger(key);
        playerData.updateOne(eq("_id", uuid), set(key, value+amount));
    }

    public void removePlayerData(UUID uuid, String key, Integer value) {
        Integer amount = getPlayerData(uuid).get().getInteger(key);
        playerData.updateOne(eq("_id", uuid), set(key, value-amount));
    }

}
