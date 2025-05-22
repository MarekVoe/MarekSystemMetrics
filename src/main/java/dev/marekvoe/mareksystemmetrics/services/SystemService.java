package dev.marekvoe.mareksystemmetrics.services;

import dev.marekvoe.mareksystemmetrics.models.SystemInfo;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.time.Duration;

@Service
public class SystemService {

    public SystemInfo getSystemInfo() {
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        int cpuCores = Runtime.getRuntime().availableProcessors();

        long uptimeMs = ManagementFactory.getRuntimeMXBean().getUptime();
        String uptime = formatDuration(uptimeMs);

        return new SystemInfo(os, architecture, cpuCores, uptime);
    }

    private String formatDuration(long millis) {
        Duration dur = Duration.ofMillis(millis);
        long hours = dur.toHours();
        long minutes = dur.minusHours(hours).toMinutes();
        long seconds = dur.minusSeconds(hours).minusMinutes(minutes).toSeconds();
        return hours + "h " + minutes + "m " + seconds + "s";
    }


}
