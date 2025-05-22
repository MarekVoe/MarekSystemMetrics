package dev.marekvoe.mareksystemmetrics.models;

public class DiskInfo {
    private String path;
    private long totalSpaceMB;
    private long freeSpaceMB;
    private long usedSpaceMB;

    public DiskInfo(String path, long totalSpaceMB, long freeSpaceMB, long usedSpaceMB) {
        this.path = path;
        this.totalSpaceMB = totalSpaceMB;
        this.freeSpaceMB = freeSpaceMB;
        this.usedSpaceMB = usedSpaceMB;
    }

    public String getPath() {
        return path;
    }

    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }

    public long getFreeSpaceMB() {
        return freeSpaceMB;
    }

    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }
}