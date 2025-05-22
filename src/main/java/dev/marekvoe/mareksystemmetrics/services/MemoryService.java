package dev.marekvoe.mareksystemmetrics.services;

import com.sun.management.OperatingSystemMXBean;
import dev.marekvoe.mareksystemmetrics.models.MemoryInfo;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;

@Service
public class MemoryService {

    public MemoryInfo getMemoryInfo() {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        long totalMemory = osBean.getTotalMemorySize() / (1024 * 1024 * 1024); // v GB
        long freeMemory = osBean.getFreeMemorySize() / (1024 * 1024 * 1024); // v GB
        long usedMemory = totalMemory - freeMemory;
        float usagePercent = totalMemory > 0 ? ((float) usedMemory / totalMemory) * 100 : 0.0f;

        return new MemoryInfo(totalMemory, freeMemory, usedMemory, usagePercent);
    }
}
