package dev.marekvoe.mareksystemmetrics.models;

public class NetworkInfo {

    private long ping;

    public NetworkInfo(long ping) {
        this.ping = ping;
    }


    public long getPing() {
        return ping;
    }
}
