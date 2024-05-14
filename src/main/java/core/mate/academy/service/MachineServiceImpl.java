package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER = "Bulldozer";
    private static final String EXCAVATOR = "Excavator";
    private static final String TRUCK = "Truck";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        switch (type.getSimpleName()) {
            case BULLDOZER:
                machines.addAll(new BulldozerProducerImpl().get());
                break;
            case EXCAVATOR:
                machines.addAll(new ExcavatorProducerImpl().get());
                break;
            case TRUCK:
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
