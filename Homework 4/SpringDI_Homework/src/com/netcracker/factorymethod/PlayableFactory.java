package com.netcracker.factorymethod;

public class PlayableFactory {

    public Playable getPlayable() {
        return new JacksonGuitar();
    }
}
