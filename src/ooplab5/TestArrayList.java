package ooplab5;

import java.util.ArrayList;

public interface TestArrayList {
    public static void main(String[] args) {
    //ArrayList
        ArrayList list = new ArrayList();
        list.add("SAM");
        list.add("DAY");
        list.add("MIT");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1,"YaYa");
        System.out.println(list);
        //  print with for loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }//for




    }//main

}//class
