// Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

// Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

// You are given code in the editor. Complete the code so that it prints the following lines:

// 1
// 2
// 3
// Hello
// World
// Do not use method overloading because your answer will not be accepted.

import java.lang.reflect.Method;

class Printer {
    public static <E> void printArray(E[] inputArray) {
        for(E element : inputArray){
            System.out.println(element);
        }
    }
}
public class Generics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] nums = {1,2,3};
        String[] string = {"Hello" , "World"};
        myPrinter.printArray(nums);
        myPrinter.printArray(string);
        int count = 0;

        for(Method method : Printer.class.getDeclaredMethods()){
            String name = method.getName();
            if (name.equals("PrintArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Methos overloading is not allowd!");
        }
    }
}
