package com.tms.pattern.abbstraktFabric.domain;

public class MetalBed implements Bed{
    @Override
    public String getMaterial() {
        return "metal";
    }
}
