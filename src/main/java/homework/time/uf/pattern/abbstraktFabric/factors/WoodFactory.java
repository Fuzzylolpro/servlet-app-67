package homework.time.uf.pattern.abbstraktFabric.factors;

import homework.time.uf.pattern.abbstraktFabric.domain.Bed;
import homework.time.uf.pattern.abbstraktFabric.domain.Chair;
import homework.time.uf.pattern.abbstraktFabric.domain.Table;
import homework.time.uf.pattern.abbstraktFabric.domain.WoodBed;
import homework.time.uf.pattern.abbstraktFabric.domain.WoodChair;
import homework.time.uf.pattern.abbstraktFabric.domain.WoodTable;

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
