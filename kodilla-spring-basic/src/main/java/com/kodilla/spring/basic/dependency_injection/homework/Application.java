package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

        public static void main(String[] args) {
            DeliveryService deliveryService = new DeliverySystemImpl();
            NotificationService notificationService = new NotificationServiceImpl();
            ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
            shippingCenter.sendPackage("Andersa 35, Warszawa", 18.2);
        }
}
//ShippingCenter nie jest już zależny od konkretnych klas, ale od interfejsów, co umożliwia bardziej elastyczne zarządzanie zależnościami w przyszłości.