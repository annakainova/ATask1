package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void sumLessThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void sumEqualThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void sumMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        org.testng.Assert.assertEquals(actual, expected);
    }
}
