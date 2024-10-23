package com.coderscampus.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {



    @Test
    void add() {
        CustomList<String> customList = new CustomArrayList<>();

        //Arrange
        customList.add("item1");
        customList.add("item2");
        customList.add("item3");


       assertEquals("item1",customList.get(0));

        //Assert


    }

    @Test
    void testAdd() {
        CustomList<String> customList = new CustomArrayList<>();

        //Arrange
        customList.add("item1");
        customList.add("item2");
        customList.add("item3");
        customList.add(3,"item4");

        assertEquals("item4",customList.get(3));
        assertEquals(4,customList.getSize());

    }

    @Test
    void getSize() {
        CustomList<String> customList = new CustomArrayList<>();

        //Arrange
        customList.add(0,"item1");
        customList.add(1,"item2");
        customList.add(2,"item3");

        //Assert
        assertEquals(3,customList.getSize());
    }

    @Test
    void should_Get() {
        CustomList<String> customList = new CustomArrayList<>();
        //Act
        customList.add(0,"item1");
        customList.add(1,"item2");
        customList.add(2,"item3");
        //Assert
        assertEquals("item1", customList.get(0));
        assertEquals("item2", customList.get(1));
        assertEquals("item3", customList.get(2));
    }

    @Test
    void remove() {
        CustomList<String> customList = new CustomArrayList<>();

        customList.add("item1");
        customList.add("item2");
        customList.add("item3");

        String removedItem = customList.remove(0);
         assertEquals("item1", removedItem);

         assertEquals(2, customList.getSize());

    }
}