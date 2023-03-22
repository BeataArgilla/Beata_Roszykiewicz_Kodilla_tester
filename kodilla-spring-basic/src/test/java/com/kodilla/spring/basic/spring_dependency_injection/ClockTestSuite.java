package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_scopes.homework.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ClockTestSuite {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void shouldHaveDifferentTimeInDifferentBeans() {
        Clock clock1 = applicationContext.getBean(Clock.class);
        Clock clock2 = applicationContext.getBean(Clock.class);

        clock1.setTime(LocalTime.of(10, 0));
        clock2.setTime(LocalTime.of(12, 0));

        assertNotEquals(clock1.getTime(), clock2.getTime());
    }
}