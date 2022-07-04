package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> list;

    {
        list = new ArrayList<>();
        list.add("Chopin - Ballade No. 1 in G Minor, Op. 23");
        list.add("Liszt  - Liebestraum No. 3 (Love Dream)");
        list.add("Edvard Grieg - Op.54  March of the Dwarfs.");
    }

    @Override
    public List<String> getSong() {
        return list;

    }
}
