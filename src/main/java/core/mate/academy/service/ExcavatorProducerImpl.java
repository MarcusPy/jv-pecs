package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> machines = new ArrayList<>();
        machines.add(new Excavator());
        machines.add(new Excavator());

        return machines;
    }
}
