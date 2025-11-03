package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCorrectRemainderForSmallAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected); // actual, expected
    }

    @Test
    public void shouldReturnCorrectRemainderForAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected); // actual, expected
    }

    @Test
    public void shouldReturnCorrectRemainderForLargeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000001;
        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected); // actual, expected
    }
}
