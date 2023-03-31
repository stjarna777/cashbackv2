package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainOver1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}