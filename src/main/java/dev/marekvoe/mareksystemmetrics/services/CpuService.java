package dev.marekvoe.mareksystemmetrics.services;

import com.sun.management.OperatingSystemMXBean;
import dev.marekvoe.mareksystemmetrics.models.CpuInfo;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;

@Service
public class CpuService {

    public CpuInfo getCpuInfo() {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        float cpuLoad = (float) (osBean.getSystemCpuLoad() * 100);
        int cpuCores = osBean.getAvailableProcessors();
        return new CpuInfo(cpuLoad, cpuCores);
    }
}