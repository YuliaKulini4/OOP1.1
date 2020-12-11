package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    private RadioAdvanced radio = new RadioAdvanced();


    @Test

    void shouldCheckSoundVolume() {

        int maxVolume = 10;
        int minVolume = 0;
        int soundVolume = 1;
        radio.setMaxVolume(maxVolume);
        radio.setMinVolume(minVolume);
        radio.setSoundVolume(soundVolume);
        assertEquals(1, radio.getSoundVolume());
    }

        @Test

            void shouldCheckCurrentStation() {

            int currentStationNumber = 5;
            int numberOfChannels = 10;
            radio.setNumberOfChannels(numberOfChannels);
           assertEquals( 6 , currentStationNumber);


    }

}