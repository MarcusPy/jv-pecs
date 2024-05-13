package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> machines = new ArrayList<>();
        machines.add(new Bulldozer("bulldozer1","green","brand1", "model1", 100));
        machines.add(new Bulldozer("bulldozer2","yellow","brand2", "model2", 200));
        machines.add(new Bulldozer("bulldozer3","red","brand3", "model3", 300));
        return machines;
    }
}
