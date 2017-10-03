package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	 // List<String> list = new ArrayList<>(100);
      List<String> list = new LinkedList<>();
	  list.add("Hello");
        Collections.addAll(list,"A","R","Hello","foo");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 0, 3); // move elements for example 0 and 3 elemnt change their places
        System.out.println(list);
        Collections.shuffle(list);  // mix elements in random order
        System.out.println(list);
        list.add(2, "xxxxxxxxxxxxxxx");
        System.out.println(list);
    }
}
