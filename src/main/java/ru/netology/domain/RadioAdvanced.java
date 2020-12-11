package ru.netology.domain;

public class RadioAdvanced {



    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > getMaxVolume()) {
            return;
        }
        if (soundVolume <  getMinVolume()){
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void getCurrentStationNumber() {
        this.currentStationNumber = currentStationNumber;
    }


       public void setCurrentStationNumber(int currentStationNumber) {

        if(currentStationNumber < getNumberOfChannels()) {

            this.currentStationNumber = currentStationNumber + 1;

        } else {

            this.currentStationNumber = 0;
        }

    }

    private int currentStationNumber;
    private int soundVolume;
    private int maxVolume;

    public int getNumberOfChannels() {
        return numberOfChannels;
    }

    public void setNumberOfChannels(int numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    private int numberOfChannels;

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    private int minVolume;




    }