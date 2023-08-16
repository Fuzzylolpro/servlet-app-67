package homework.time.uf.pattern.abbstraktFabric.factors;

import homework.time.uf.pattern.abbstraktFabric.domain.Bed;
import homework.time.uf.pattern.abbstraktFabric.domain.Chair;
import homework.time.uf.pattern.abbstraktFabric.domain.MetalBed;
import homework.time.uf.pattern.abbstraktFabric.domain.MetalChair;
import homework.time.uf.pattern.abbstraktFabric.domain.MetalTable;
import homework.time.uf.pattern.abbstraktFabric.domain.Table;

public class MetalFactory implements FurnitureFactory{
    @Override
    public Chair gatChair() {
        return new MetalChair();
    }

    @Override
    public Bed gatBed() {
        return new MetalBed();
    }

    @Override
    public Table gatTable() {
        return new MetalTable();
    }
}
