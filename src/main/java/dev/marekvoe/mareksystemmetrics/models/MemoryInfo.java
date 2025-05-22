package dev.marekvoe.mareksystemmetrics.models;

public class MemoryInfo {

    private long totalMemory;
    private long usedMemory;
    private long freeMemory;
    private float usagePercent;

    public MemoryInfo(long totalMemory, long usedMemory, long freeMemory, float usagePercent) {
        this.totalMemory = totalMemory;
        this.usedMemory = usedMemory;
        this.freeMemory = freeMemory;
        this.usagePercent = usagePercent;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public long getUsedMemory() {
        return usedMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public float getUsagePercent() {
        return usagePercent;
    }
}
