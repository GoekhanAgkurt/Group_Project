package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    void testAddition() {
        // Given
        int number1 = 2;
        int number2 = 3;

        //When
        int actual = Main.add(number1, number2);


        // Then
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void isbiggerThenHundret(){
        int number = 98;

        boolean actual = Main.isBiggerThenHundret(number);

        boolean expected = false;

        Assertions.assertEquals( expected, actual);
    }

    @Test
    void smallerThenZero(){
        int number = 2;

        boolean actual = Main.smallerThenZero(2);

        boolean expected = false;

        Assertions.assertEquals( expected, actual);
// Test
    }

    @Test
    void fizzbuzz(){
        //Given
        int number = 3;

        //when
        String actual = Main.fizzbuzz(number);

        //then
        String expected = "fizz";

        Assertions.assertEquals(expected, actual);


    }



}
