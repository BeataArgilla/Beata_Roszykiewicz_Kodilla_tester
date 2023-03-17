package com.kodilla.homework;
import com.kodilla.homework.User;
import com.kodilla.homework.Notifications;
import com.kodilla.homework.LocationNotification;
import com.kodilla.homework.Locations;

import javax.xml.stream.Location;
import java.util.HashSet;
import java.util.Set;

public class ServiceSendingMessages {

    private User user;
    private String location;

    private Set<User> users = new HashSet<>();
    private Set<Location> locations = new HashSet<>();

    public void addUser(User user){

        this.users.add(user);
    }
    public void sendNotificationToUser(Notifications notifications){
        this.users.forEach(x->user.receive(notifications));
        this.locations.forEach(y -> user.receive(notifications));
    }
    public void addLocations (String location){

        this.location = location;
    }
    public void removeUser (User user){

        this.users.remove(user);
    }
    public void removeLocation(String location){

        this.locations.remove(location);
    }

}
