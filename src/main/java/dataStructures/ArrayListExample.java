package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> immutableColors = List.of(
                "blue",
                "red",
                "yellow"
        );

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        System.out.println("colors: " + colors);
        System.out.println("size: " + colors.size());
        System.out.println("contains yellow: " + colors.contains("yellow"));
        System.out.println("contains green: " + colors.contains("green"));

        System.out.println("Iterating: ");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
