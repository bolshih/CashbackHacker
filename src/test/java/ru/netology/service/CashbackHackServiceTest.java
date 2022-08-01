package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemain800(){
        CashbackHackService chashback = new CashbackHackService();
        int expected = 300;
        int actual = chashback.remain(700);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemain1000(){
        CashbackHackService chashback = new CashbackHackService();
        int expected = 0;
        int actual = chashback.remain(1000);

        assertEquals(expected, actual);
    }
}