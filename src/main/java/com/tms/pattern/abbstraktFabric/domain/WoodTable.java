package com.tms.pattern.abbstraktFabric.domain;

public class WoodTable implements Table{
    @Override
    public String getMaterial() {
        return "wood";
    }
}
