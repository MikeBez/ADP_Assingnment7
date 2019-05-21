package za.ac.cput.projects.Assignment6.repository.implementations;

import za.ac.cput.projects.Assignment6.domain.Fare;

import java.util.HashSet;
import java.util.Set;

public class FareRepository implements za.ac.cput.projects.Assignment6.repository.FareRepository {

    private static FareRepository repository = null;
    private Set<Fare> fares;

    private FareRepository()
    {
        this.fares = new HashSet<>();
    }

    public static FareRepository getRepository(){
        if (repository == null) repository = new FareRepository();
        return repository;
    }
    
    public  Fare create(Fare fare){
        this.fares.add(fare);
        return fare;
    }

    public Fare read(String fareType){
        return null;
    }

    public void delete(String fareType) {

    }

    public Fare update(Fare fare){
        return fare;
    }


    public Set<Fare> getAll(){
        return this.fares;
    }

}
