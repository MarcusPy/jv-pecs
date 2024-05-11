package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machines = new BulldozerProducerImpl().get();
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducerImpl().get();
        } else if (type == Truck.class) {
            machines = new TruckProducerImpl().get();
        } else {
            return List.of();
        }

        return (List<Machine>) machines;
    }

    @Override
    public <T> void fill(List<T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            if (machine instanceof Bulldozer bulldozer) {
                bulldozer.doWork();
            } else if (machine instanceof Excavator excavator) {
                excavator.doWork();
            } else if (machine instanceof Truck truck) {
                truck.doWork();
            }
        }
    }
}
