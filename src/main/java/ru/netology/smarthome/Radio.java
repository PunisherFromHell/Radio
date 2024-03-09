package ru.netology.smarthome;

public class Radio {
    private int stationNum;
    private int currentVolume;

    public int getStationNum() {
        return stationNum;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setStationNum(int newStationNum) {
        if (newStationNum > 9) {
            return;
        }
        if (newStationNum < 0) {
            return;
        }
        stationNum = newStationNum;


    }

    public void next() {
        if (stationNum == 9) {
            stationNum = 0;
        } else {
            stationNum++;
        }
    }

    public void prev() {
        if (stationNum == 0) {
            stationNum = 9;
        } else {
            stationNum = stationNum - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }

    }


    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }


}


