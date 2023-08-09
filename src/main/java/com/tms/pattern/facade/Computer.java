package com.tms.pattern.facade;

import lombok.Getter;

@Getter
public class Computer {
    private final Power power = new Power();
    private final CdRom cdRom = new CdRom();
    private final HardDisk hardDisk = new HardDisk();
    void copyInfoFromCdDiskToHardDisk(){
        power.on();
        cdRom.open();
        cdRom.close();
        hardDisk.copy();
        hardDisk.showInfo();
        power.off();
    }
}
