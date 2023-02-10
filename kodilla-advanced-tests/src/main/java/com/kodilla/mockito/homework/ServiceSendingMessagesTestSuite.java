package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;

public class ServiceSendingMessagesTestSuite {

    ServiceSendingMessages serviceSendingMessages = new ServiceSendingMessages();
    User user = new User();


    @Test
    public void shouldTestSigningToLocation() {
        serviceSendingMessages.subscribe(user, "location1");
        assertTrue(serviceSendingMessages.getLocation(user).contains("location1");


    }

    @Test
    public void shouldTestRemovingSubscriptionFromLocation() {
        serviceSendingMessages.unsubscribe(user, "location1");
        assertFalse(serviceSendingMessages.getLocation(user).contains("location1");
    }

    @Test
    public void shouldTestRemovingSubscriptionFromAllLocations() {
        serviceSendingMessages.subscribe(user, "location1");
        serviceSendingMessages.subscribe(user, "location2");
        serviceSendingMessages.removeAll(user, "");
        assertTrue(serviceSendingMessages.getLocation(user).isEmpty)
    }

    @Test
    public void shouldTestReceivingMessageBySpecifiedGroupOfUsers() {
        User user1 = new User();
        User user2 = new User();
        serviceSendingMessages.subscribe(user1, "location1");
        serviceSendingMessages.subscribe(user2, "location2");
    }

    @Test
    public void shouldTestSendingMessageToAllUsers() {

    }

    @Test
    public void shouldTestRemovingLocation() {

    }

}
