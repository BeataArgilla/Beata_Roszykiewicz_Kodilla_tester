package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.ShippingCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldSendPackage() {
        String result = shippingCenter.sendPackage("Kraków", 20.5);
        Assertions.assertEquals("Package delivered to: Kraków", result);
    }

    @Test
    public void shouldNotSendPackage() {
        String result = shippingCenter.sendPackage("Kraków", 31);
        Assertions.assertEquals("Package not delivered to: Kraków", result);
    }
}