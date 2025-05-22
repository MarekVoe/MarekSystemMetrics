package dev.marekvoe.mareksystemmetrics.services;

import dev.marekvoe.mareksystemmetrics.models.NetworkInfo;
import org.springframework.stereotype.Service;

import java.net.InetAddress;

@Service
public class NetworkService {

    public NetworkInfo getNetworkInfo() {
        long ping = measurePing("8.8.8.8");

        return new NetworkInfo(ping);
    }

    private long measurePing(String host) {
        try {
            InetAddress inet = InetAddress.getByName(host);
            long start = System.currentTimeMillis();
            boolean reachable = inet.isReachable(2000);
            long end = System.currentTimeMillis();
            return reachable ? (end - start) : -1;
        } catch (Exception e) {
            return -1;
        }
    }
}