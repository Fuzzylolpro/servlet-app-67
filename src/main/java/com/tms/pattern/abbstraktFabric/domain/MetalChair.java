package com.tms.pattern.abbstraktFabric.domain;

public class MetalChair implements Chair{
    @Override
    public String getMaterial() {
        return "metal";
    }
}
