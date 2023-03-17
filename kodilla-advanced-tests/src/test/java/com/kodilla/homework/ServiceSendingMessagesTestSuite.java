package com.kodilla.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceSendingMessagesTestSuite {

    ServiceSendingMessages serviceSendingMessages = new ServiceSendingMessages();
    User user = Mockito.mock(User.class);
    Notifications notifications = Mockito.mock(Notifications.class);


    @Test
    public void shouldTestSigningToLocation() {
        ServiceSendingMessages serviceSendingMessages = new ServiceSendingMessages();
        User user1 = Mockito.mock(User.class);
        serviceSendingMessages.addUser(user1);
        serviceSendingMessages.addLocations("location1");
        Notifications notifications = Mockito.mock(Notifications.class);
        serviceSendingMessages.sendNotificationToUser(notifications);
        Mockito.verify(user1,Mockito.times(1)).receive(notifications);

    }

    @Test
    public void shouldTestRemovingSubscriptionFromLocation() {
        serviceSendingMessages.addUser(user);
        User user = Mockito.mock(User.class);
        Mockito.verify(user,Mockito.times(1)).receive(notifications);
        serviceSendingMessages.removeUser(user);
        serviceSendingMessages.sendNotificationToUser(notifications);
        Mockito.verify(user,Mockito.never()).receive(notifications);

    }

    @Test
    public void shouldTestRemovingSubscriptionFromAllLocations() {
        User user = Mockito.mock(User.class);
        serviceSendingMessages.addUser(user);
        serviceSendingMessages.addLocations("location1");
        serviceSendingMessages.addLocations("location2");
        serviceSendingMessages.addLocations("location3");

        serviceSendingMessages.sendNotificationToUser(notifications);
        Mockito.verify(user,Mockito.never()).receive(notifications);

    }

    @Test
    public void shouldTestReceivingMessageByUsersInAllLocations() {
        User userlocation1 = Mockito.mock(User.class);
        User userlocation2 = Mockito.mock(User.class);
        User userlocation3 = Mockito.mock(User.class);
        serviceSendingMessages.addLocations("userlocation1");
        serviceSendingMessages.addLocations("userlocation2");
        serviceSendingMessages.addLocations("userlocation3");
        Notifications notifications = Mockito.mock(Notifications.class);

        serviceSendingMessages.sendNotificationToUser(notifications);
        Mockito.verify(userlocation1,Mockito.times(1)).receive(notifications);
        Mockito.verify(userlocation2,Mockito.times(1)).receive(notifications);
        Mockito.verify(userlocation3,Mockito.times(1)).receive(notifications);



    }

    @Test
    public void shouldTestSendingOneMessageToAllUsers() {
        User user = Mockito.mock(User.class);
        serviceSendingMessages.addUser(user);
        serviceSendingMessages.addUser(user);
        serviceSendingMessages.addUser(user);
        Notifications notifications = Mockito.mock(Notifications.class);

        serviceSendingMessages.sendNotificationToUser(notifications);
        Mockito.verify(user,Mockito.times(1)).receive(notifications);

    }


}
