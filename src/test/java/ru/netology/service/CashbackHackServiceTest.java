package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain800() {
        CashbackHackService chashback = new CashbackHackService();
        int expected = 300;
        int actual = chashback.remain(700);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService chashback = new CashbackHackService();
        int expected = 0;
        int actual = chashback.remain(1000);

        assertEquals(actual, expected);
    }
}