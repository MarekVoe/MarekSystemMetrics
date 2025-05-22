package dev.marekvoe.mareksystemmetrics.controllers;

import dev.marekvoe.mareksystemmetrics.models.DiskInfo;
import dev.marekvoe.mareksystemmetrics.services.DiskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiskController {

    private final DiskService diskService;

    public DiskController(DiskService diskService) {
        this.diskService = diskService;
    }

    @GetMapping("/api/disks")
    public List<DiskInfo> getDisks() {
        return diskService.getDisksInfo();
    }
}