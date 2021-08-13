package com.alenalimkhanov;

public class SplitMethodTest {

    public static void main(String[] args) {

        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
        for (String i : road) {
            System.out.println(i);
        }
        System.out.println("road.length: " + road.length);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        String[] bldng = "You are inside a building, a well house for a small spring".split(", ");
        for (String i : bldng) {
            System.out.println(i);
        }
        System.out.println("bldng.length: " + bldng.length);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        String[] arrStr = "GeeksforforGeeksfor".split("for");
        for (String i : arrStr) {
            System.out.println(i);
        }
        System.out.println("arrStr.length: " + arrStr.length);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", 5);

        for (String a : arrOfStr)
            System.out.println(a);
        System.out.println("arrOfStr.length: " + arrStr.length);
    }
}
