package io.volqe.players;

import java.util.UUID;

public class PlayerManager {
    private final UUID uuid;

    // System player data structure:
    private int ban_reason;
    private long ban_time;
    private int coins;
    private double playTime;

    // Hunger games player data structure:
    private int hg_kills;
    private int hg_deaths;
    private int hg_rounds;
    private int hg_breaks;

    // Bedwars player data structure:
    private int bw_kills;
    private int bw_deaths;
    private int bw_rounds;
    private int bw_beds;

    // Skyblock player data structure:
    private int sb_deaths;
    private int sb_level;
    private int sb_vera;

    // Freeland player data structure:
    private int lumen;
    private int fl_kills;
    private int fl_deaths;
    private int fl_boss;


    // Vollständiger Konstruktor
    public PlayerManager(UUID uuid, int ban_reason, long ban_time, int coins, int hg_kills, int hg_deaths,
                         int hg_rounds, int hg_breaks, int bw_kills, int bw_deaths, int bw_rounds, int bw_beds,
                         int sb_deaths, int sb_level, int sb_vera, int lumen, int fl_kills, int fl_deaths,
                         int fl_boss, double playTime) {
        this.uuid = uuid;
        this.ban_reason = ban_reason;
        this.ban_time = ban_time;
        this.coins = coins;
        this.hg_kills = hg_kills;
        this.hg_deaths = hg_deaths;
        this.hg_rounds = hg_rounds;
        this.hg_breaks = hg_breaks;
        this.bw_kills = bw_kills;
        this.bw_deaths = bw_deaths;
        this.bw_rounds = bw_rounds;
        this.bw_beds = bw_beds;
        this.sb_deaths = sb_deaths;
        this.sb_level = sb_level;
        this.sb_vera = sb_vera;
        this.lumen = lumen;
        this.fl_kills = fl_kills;
        this.fl_deaths = fl_deaths;
        this.fl_boss = fl_boss;
        this.playTime = playTime;
    }

    // Getter und Setter für private Felder
    public UUID getUuid() {
        return uuid;
    }

    public int getBanReason() {
        return ban_reason;
    }

    public long getBanTime() {
        return ban_time;
    }

    public int getCoins() {
        return coins;
    }

    public int getHgKills() {
        return hg_kills;
    }

    public int getHgDeaths() {
        return hg_deaths;
    }

    public int getHgRounds() {
        return hg_rounds;
    }

    public int getHgBreaks() {
        return hg_breaks;
    }

    public int getBwKills() {
        return bw_kills;
    }

    public int getBwDeaths() {
        return bw_deaths;
    }

    public int getBwRounds() {
        return bw_rounds;
    }

    public int getBwBeds() {
        return bw_beds;
    }

    public int getSbDeaths() {
        return sb_deaths;
    }

    public int getSbLevel() {
        return sb_level;
    }

    public int getSbVera() {
        return sb_vera;
    }

    public int getLumen() {
        return lumen;
    }

    public int getFlKills() {
        return fl_kills;
    }

    public int getFlDeaths() {
        return fl_deaths;
    }

    public int getFlBoss() {
        return fl_boss;
    }

    public double getPlayTime() {
        return playTime;
    }


    // Korrekte Setter-Methoden:
    public void setCoins(int coins) {
        this.coins = coins; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBanReason(int ban_reason) {
        this.ban_reason = ban_reason; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBanTime(long ban_time) {
        this.ban_time = ban_time; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setHgKills(int hg_kills) {
        this.hg_kills = hg_kills; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setHgDeaths(int hg_deaths) {
        this.hg_deaths = hg_deaths; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setHgRounds(int hg_rounds) {
        this.hg_rounds = hg_rounds; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setHgBreaks(int hg_breaks) {
        this.hg_breaks = hg_breaks; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBwKills(int bw_kills) {
        this.bw_kills = bw_kills; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBwDeaths(int bw_deaths) {
        this.bw_deaths = bw_deaths; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBwRounds(int bw_rounds) {
        this.bw_rounds = bw_rounds; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setBwBeds(int bw_beds) {
        this.bw_beds = bw_beds; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setSbDeaths(int sb_deaths) {
        this.sb_deaths = sb_deaths; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setSbLevel(int sb_level) {
        this.sb_level = sb_level; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setSbVera(int sb_vera) {
        this.sb_vera = sb_vera; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setLumen(int lumen) {
        this.lumen = lumen; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setFlKills(int fl_kills) {
        this.fl_kills = fl_kills; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setFlDeaths(int fl_deaths) {
        this.fl_deaths = fl_deaths; // Die Instanzvariable wird korrekt gesetzt
    }

    public void setFlBoss(int fl_boss) {
        this.fl_boss = fl_boss; // Die Instanzvariable wird korrekt gesetzt
    }
}
