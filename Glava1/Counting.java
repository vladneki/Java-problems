package Glava1;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;


class Counting{

    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";

    public static void main(String[] args){

        System.out.println("Input text: \n" + TEXT + "\n");
        
        System.out.println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");
        
        System.out.println("HashMap based solution:");
        long startTimeV1 = System.nanoTime();
        
        Map<Character, Integer> duplicatesV1 = Strings.countDuplicator(TEXT);

        displayExecutionTime(System.nanoTime()-startTimeV1);
        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));
    }
        private static void displayExecutionTime(long time) {
            System.out.println("Execution time: " + time + " ns" + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
        
    }

}