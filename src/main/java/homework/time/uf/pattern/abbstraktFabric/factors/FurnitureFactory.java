package homework.time.uf.pattern.abbstraktFabric.factors;

import homework.time.uf.pattern.abbstraktFabric.domain.Bed;
import homework.time.uf.pattern.abbstraktFabric.domain.Chair;
import homework.time.uf.pattern.abbstraktFabric.domain.Table;

public interface FurnitureFactory {
    Chair gatChair();
    Bed gatBed();
    Table gatTable();
}
