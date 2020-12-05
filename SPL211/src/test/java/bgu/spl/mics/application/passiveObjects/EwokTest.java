package bgu.spl.mics.application.passiveObjects;

import bgu.spl.mics.Future;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EwokTest {

    private Ewok ewok;

    @BeforeEach
    public void setUp() {
        Ewok ewok = new Ewok();
    }

    @Test
    public void acquire() {
        assertTrue(ewok.getAvailable());
        ewok.acquire();
        assertFalse(ewok.getAvailable());
    }

    @Test
    public void release() {
        assertFalse(ewok.getAvailable());
        ewok.acquire();
        assertTrue(ewok.getAvailable());
    }


}