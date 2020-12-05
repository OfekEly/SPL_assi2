package bgu.spl.mics;

import bgu.spl.mics.application.passiveObjects.Ewok;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageBusImplTest {
    private  MessageBusImpl Massage;

    @BeforeEach
    void setUp() {
        MessageBusImpl Message = new MessageBusImpl();
    }

    @Test
    void sendBroadcast() {

    }

    @Test
    void sendEvent() {
    }

    @Test
    void awaitMessage() {
    }
}