package za.ac.cput.projects.Assignment6.repository.implementations;

import za.ac.cput.projects.Assignment6.domain.Fare;
import za.ac.cput.projects.Assignment6.domain.Platform;

import java.util.HashSet;
import java.util.Set;

public class PlatformReposiroty {

    private static PlatformReposiroty reposiroty = null;
    private Set<Platform> platforms;

    private PlatformReposiroty()
    {
        this.platforms = new HashSet<>();
    }

    public static PlatformReposiroty getRepository(){
        if (reposiroty == null) reposiroty = new PlatformReposiroty();
        return reposiroty;
    }
}
