package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    private final CustomArrayList<String> customList = new CustomArrayList<>();

    @Test
    void add() {
        //Arrange

        //Act

        //Assert


    }

    @Test
    void testAdd() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void getSize() {


        //Arrange

        //Act

        //Assert
    }

    @Test
    void should_Get() {

        //Act
        customList.add(0,"item1");
        customList.add(1,"item2");
        customList.add(2,"item3");
        //Assert
        assertEquals("item1", customList.get(0));

    }

    @Test
    void remove() {

        //Arrange

        //Act

        //Assert
    }
}