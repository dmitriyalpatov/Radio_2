package domain;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;





class RadioTest {
    @Test

    public void shouldSetStation() {
        Radio service = new Radio();

        service.setCurrentStation(8);

        int expected = 8;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverLimit() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderLimit() {
        Radio service = new Radio();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio service = new Radio();

        service.setCurrentStation(1);
        service.nextStation();

        int expected = 2;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToNextStationWhenCurrentStation9() {
        Radio service = new Radio();

        service.setCurrentStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStation() {
        Radio service = new Radio();

        service.setCurrentStation(4);
        service.prevStation();

        int expected = 3;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStationWhenCurrentStation0() {
        Radio service = new Radio();

        service.setCurrentStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(7);

        int expected = 7;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverLimit() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderLimit() {
        Radio service = new Radio();

        service.setCurrentVolume(-5);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(5);
        service.increaseVolume();

        int expected = 6;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOver10() {
        Radio service = new Radio();

        service.setCurrentVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(5);
        service.decreaseVolume();

        int expected = 4;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnder0() {
        Radio service = new Radio();

        service.setCurrentVolume(0);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }
}