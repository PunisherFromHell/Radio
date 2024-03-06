package ru.netology.smarthome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();
        rad.setStationNum(10);
        int expected = 0;
        int actual = rad.stationNum;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStation() {
        Radio rad = new Radio();
        rad.setStationNum(-1);
        int expected = 0;
        int actual = rad.stationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio rad = new Radio();
        rad.setStationNum(0);
        rad.next();
        int expected = 1;
        int actual = rad.stationNum;

        Assertions.assertEquals(actual, expected);


    }

    @Test
    public void noNext() {
        Radio rad = new Radio();
        rad.setStationNum(9);
        rad.next();
        int expected = 0;
        int actual = rad.stationNum;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prev() {
        Radio rad = new Radio();
        rad.setStationNum(4);
        rad.prev();
        int expected = 3;
        int actual = rad.stationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NoPrev() {
        Radio rad = new Radio();
        rad.setStationNum(0);
        rad.prev();
        int expected = 9;
        int actual = rad.stationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotIncreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 100;
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 33;
        rad.increaseVolume();
        int expected = 34;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void ShoulDecreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 5;
        rad.decreaseVolume();
        int expected = 4;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void ShouldNotDecreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = -1;
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);


    }
}