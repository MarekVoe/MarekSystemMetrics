package dev.marekvoe.mareksystemmetrics.services;

import dev.marekvoe.mareksystemmetrics.models.DiskInfo;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiskService {
    public List<DiskInfo> getDisksInfo() {
        List<DiskInfo> disks = new ArrayList<>();
        for (File root : File.listRoots()) {
            long total = root.getTotalSpace() / (1024 * 1024);
            long free = root.getFreeSpace() / (1024 * 1024);
            long used = total - free;
            disks.add(new DiskInfo(root.getAbsolutePath(), total, free, used));
        }
        return disks;
    }
}