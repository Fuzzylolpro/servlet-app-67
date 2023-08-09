package com.tms.pattern.abbstraktFabric.factors;

import com.tms.pattern.abbstraktFabric.domain.Bed;
import com.tms.pattern.abbstraktFabric.domain.Chair;
import com.tms.pattern.abbstraktFabric.domain.Table;

public interface FurnitureFactory {
    Chair gatChair();
    Bed gatBed();
    Table gatTable();
}
