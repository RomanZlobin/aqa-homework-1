package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenUpper1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
}