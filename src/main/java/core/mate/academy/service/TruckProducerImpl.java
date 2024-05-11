package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> machines = new ArrayList<>();
        machines.add(new Truck());
        machines.add(new Truck());

        return machines;
    }
}
