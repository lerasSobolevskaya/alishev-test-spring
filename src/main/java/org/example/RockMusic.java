package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> list;

    {
        list = new ArrayList<>();
        list.add("Alice CooperVince Gill - I Gotta Get Outta Here");
        list.add("Aerosmith - Dream On");
        list.add("Bad Company - Bad Company");
    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
