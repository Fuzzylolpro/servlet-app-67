package com.tms.pattern.abbstraktFabric.factors;

import com.tms.pattern.abbstraktFabric.domain.Bed;
import com.tms.pattern.abbstraktFabric.domain.Chair;
import com.tms.pattern.abbstraktFabric.domain.Table;
import com.tms.pattern.abbstraktFabric.domain.WoodBed;
import com.tms.pattern.abbstraktFabric.domain.WoodChair;
import com.tms.pattern.abbstraktFabric.domain.WoodTable;

public class WoodFactory implements FurnitureFactory{
    @Override
    public Chair gatChair() {
        return new WoodChair();
    }

    @Override
    public Bed gatBed() {
        return new WoodBed();
    }

    @Override
    public Table gatTable() {
        return new WoodTable();
    }
}
