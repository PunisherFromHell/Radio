package ru.netology.smarthome;

public class Radio {
    public int stationNum;
    public int currentVolume;

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
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}


