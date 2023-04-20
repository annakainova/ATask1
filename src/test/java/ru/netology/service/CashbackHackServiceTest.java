package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void sumLessThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sumEqualThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sumMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumLessThanThousandJupiter() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumEqualThousandJupiter() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumMoreThanThousandJupiter() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        Assertions.assertEquals(expected, actual);
    }
}