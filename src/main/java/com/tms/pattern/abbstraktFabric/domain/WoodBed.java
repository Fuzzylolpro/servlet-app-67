package com.tms.pattern.abbstraktFabric.domain;

public class WoodBed implements Bed{

    @Override
    public String getMaterial() {
        return "wood";
    }
}
