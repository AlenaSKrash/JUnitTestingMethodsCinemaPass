package com.sparta.alena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @Test
    @DisplayName("My first test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @ParameterizedTest
    @DisplayName("Given a time grater than 18, greeting returns Good evening")
    @ValueSource(ints = {19, 21, 23})
    public void givenATimeOf21_Greeting_ReturnsGoodEvening(int time) {
        // Arrange test conditions
        var expectedGreeting = "Good evening!";
        //Act
        var result = Program.greeting(time);
        //Assert
        Assertions.assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName(("Given a time of 21, greeting returns Good Evening - short version"))
    public void givenATimeOf21_Greeting_ReturnsGoodEvening_ShortVersion() {
        // Assert
        Assertions.assertEquals("Good evening!", Program.greeting(21));
    }

    @Test
    @DisplayName(("Given a time of 15, greeting returns Good afternoon - short version"))
    public void givenATimeOf15_Greeting_ReturnsGoodAfternoon_ShortVersion() {
        // Assert
        Assertions.assertEquals("Good afternoon!", Program.greeting(15));
    }

    @Test
    @DisplayName(("Given a time of 8, greeting returns Good Morning - short version"))
    public void givenATimeOf8_Greeting_ReturnsGoodMorning_ShortVersion() {
        // Assert
        Assertions.assertEquals("Good morning!", Program.greeting(8));
    }

    @Test
    @DisplayName(("Given a time of 2, greeting returns Good Evening - short version"))
    public void givenATimeOf2_Greeting_ReturnsGoodEvening_ShortVersion() {
        // Assert
        Assertions.assertEquals("Good evening!", Program.greeting(2));
    }

    @ParameterizedTest
    @DisplayName("Given a time between 0 and 4 , greeting returns Good evening")
    @ValueSource(ints = {0, 2, 4})
    public void givenATimeBetween0and4_Greeting_ReturnsGoodEvening(int time) {
        // Arrange test conditions
        var expectedGreeting = "Good evening!";
        //Act
        var result = Program.greeting(time);
        //Assert
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @DisplayName("Given a time between 13 and 18, greeting returns Good evening")
    @ValueSource(ints = {13, 15, 18})
    public void givenATimeBetween13And18_Greeting_ReturnsGoodEvening(int time) {
        // Arrange test conditions
        var expectedGreeting = "Good afternoon!";
        //Act
        var result = Program.greeting(time);
        //Assert
        Assertions.assertEquals(expectedGreeting, result);
    }
}

