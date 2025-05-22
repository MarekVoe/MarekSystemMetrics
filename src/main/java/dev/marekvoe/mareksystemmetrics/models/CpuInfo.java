package dev.marekvoe.mareksystemmetrics.models;

public class CpuInfo {

    private float cpuLoad;
    private int cpuCores;

    public CpuInfo(float cpuLoad, int cpuCores) {
        this.cpuLoad = cpuLoad;
        this.cpuCores = cpuCores;
    }

    public float getCpuLoad() {
        return cpuLoad;
    }

    public int getCpuCores() {
        return cpuCores;
    }
}
