package dataStructures;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ArraysExample {
    public static void main(String[] args) {
        String[] colors = new String[5]; //it starts a 5 index empty array
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "yellow";

        System.out.println("Arrays.toString(colors): " + Arrays.toString(colors));

        int[] numbers = {100, 200, 300, 50}; //initialize the array with values

        // Iteration
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors)
                .forEach(System.out::println);

        //Sorting
        System.out.println("numbers before sort:" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("numbers after sort:" + Arrays.toString(numbers));


    }
}
