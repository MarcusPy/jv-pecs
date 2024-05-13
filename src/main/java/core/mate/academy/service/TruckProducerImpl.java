package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> machines = new ArrayList<>();
        machines.add(new Truck("truck1","green","brand1", "model1", 100));
        machines.add(new Truck("truck2","yellow","brand2", "model2", 200));
        machines.add(new Truck("truck3","red","brand3", "model3", 300));
        return machines;
    }
}
