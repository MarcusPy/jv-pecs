package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        switch (type.getSimpleName()) {
            case "Bulldozer":
                machines.addAll(new BulldozerProducerImpl().get());
                break;
            case "Excavator":
                machines.addAll(new ExcavatorProducerImpl().get());
                break;
            case "Truck":
                machines.addAll(new TruckProducerImpl().get());
                break;
            default:
                return Collections.emptyList();
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
