package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int classicalSong = random.nextInt(classicalMusic.getSong().size());
        int rockSong = random.nextInt(rockMusic.getSong().size());
        if (genre == Genre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(classicalSong));
        }
        if (genre == Genre.ROCK) {
            System.out.println(rockMusic.getSong().get(rockSong));
        }
    }
}
