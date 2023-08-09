package com.tms.pattern.abbstraktFabric.domain;

public class WoodChair implements Chair{
    @Override
    public String getMaterial() {
        return "wood";
    }
}
