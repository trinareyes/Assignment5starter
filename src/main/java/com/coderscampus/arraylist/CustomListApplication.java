package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplication {


    public  static void main(String[] args) {

      CustomList<String> myList = new CustomArrayList<>();

      myList.add("Rice");
      myList.add("Chicken");
      myList.add("Carrots");
      myList.add("Zucchini");
      myList.add("Sprouts");
      myList.add("Corn");
      myList.add("Apple");
      myList.add("Grapes");
      myList.add("Banana");
      myList.add("Black Beans");
      myList.add("Lettuce");

      System.out.println("Size of the list: " + myList.getSize());


      for (int i = 0; i <myList.getSize(); i++) {


        System.out.println("Index" + i + ": " + myList.get(i));
      }

      System.out.println(myList);

    }
}
