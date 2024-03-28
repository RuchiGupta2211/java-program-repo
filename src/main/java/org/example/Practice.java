package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
        Iterator<String> iterator = list.iterator();
        list.add("item3"); // this will not cause a ConcurrentModificationException
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
