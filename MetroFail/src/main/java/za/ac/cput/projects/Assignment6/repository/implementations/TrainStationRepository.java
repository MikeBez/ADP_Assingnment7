package za.ac.cput.projects.Assignment6.repository.implementations;

import za.ac.cput.projects.Assignment6.domain.TrainStaion;

import java.util.HashSet;
import java.util.Set;

public class TrainStationRepository {
    private static TrainStationRepository reposiroty = null;
    private Set<TrainStaion> staions;

    private TrainStationRepository()
    {
        this.staions = new HashSet<>();
    }

    public static TrainStationRepository getRepository(){
        if (reposiroty == null) reposiroty = new TrainStationRepository();
        return reposiroty;
    }
}
