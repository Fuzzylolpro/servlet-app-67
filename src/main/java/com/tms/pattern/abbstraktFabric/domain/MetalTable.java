package com.tms.pattern.abbstraktFabric.domain;

public class MetalTable implements Table{
    @Override
    public String getMaterial() {
        return "metal";
    }
}
