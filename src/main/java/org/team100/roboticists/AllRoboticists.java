package org.team100.roboticists;

import java.util.ArrayList;
import java.util.List;

public class AllRoboticists {
    private final List<Roboticist> all;

    public AllRoboticists() {
        all = new ArrayList<>();
        all.add(new Joel());
    }

    public List<Roboticist> getAll() {
        return all;
    }

}