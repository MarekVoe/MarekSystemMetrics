package dev.marekvoe.mareksystemmetrics.models;

public class SystemInfo {

    private String os;
    private String architecture;
    private int cpuCores;
    private String uptime;

    public SystemInfo(String os, String architecture, int cpuCores, String uptime) {
        this.os = os;
        this.architecture = architecture;
        this.cpuCores = cpuCores;
        this.uptime = uptime;
    }

    public String getOs() {
        return os;
    }

    public String getArchitecture() {
        return architecture;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public String getUptime() {
        return uptime;
    }
}
