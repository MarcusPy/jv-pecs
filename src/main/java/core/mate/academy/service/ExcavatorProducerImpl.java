package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> machines = new ArrayList<>();
        machines.add(new Excavator("excavator1","green","brand1", "model1", 100));
        machines.add(new Excavator("excavator2","yellow","brand2", "model2", 200));
        machines.add(new Excavator("excavator3","red","brand3", "model3", 300));
        return machines;
    }
}
