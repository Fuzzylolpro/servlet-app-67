package com.tms.pattern.abbstraktFabric.factors;

import com.tms.pattern.abbstraktFabric.domain.Bed;
import com.tms.pattern.abbstraktFabric.domain.Chair;
import com.tms.pattern.abbstraktFabric.domain.MetalBed;
import com.tms.pattern.abbstraktFabric.domain.MetalChair;
import com.tms.pattern.abbstraktFabric.domain.MetalTable;
import com.tms.pattern.abbstraktFabric.domain.Table;

public class MetalFactory implements FurnitureFactory{
    @Override
    public Chair gatChair() {
        return new MetalChair();
    }

    @Override
    public Bed gatBed() {
        return new MetalBed();
    }

    @Override
    public Table gatTable() {
        return new MetalTable();
    }
}
