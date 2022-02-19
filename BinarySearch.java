import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class BinarySearch {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public BinarySearch (int low, int high, int key, ArrayList before, ArrayList after) {
        //int low = 0;
        //int high = before.size()-1;
        double answer = 7.8;
        while (low <= high) {
            int median = (low + high) / 2;
            if ((int)before.get(median) < key) {
                low = median + 1;
            } else if ((int)before.get(median) > key) {
                high = median - 1;
            } else {
                answer = median;
                break;
            }
        }
        if (answer == 7.8) {
            System.out.println(ANSI_YELLOW + "The key does not exist in the array." + ANSI_RESET);
        } else {
            System.out.println("The key exists in the array. It is in the #" + (after.indexOf(key) + 1) + " position. It could be in another position. To check if it is in another position, enter your array again but without the number in the #" + (after.indexOf(key) + 1) + " position.");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> before = new ArrayList<Integer>();
        ArrayList<Integer> after = new ArrayList<Integer>();
        
        Scanner howMany = new Scanner(System.in);
        System.out.println("How many numbers do you wish to use?");
        String ans = howMany.nextLine();
        int intAns = Integer.parseInt(ans);
        for (int i = 1; i <= intAns; i++) {
            Scanner newInput = new Scanner(System.in);
            System.out.println("What is number " + i + "?");
            String res = newInput.nextLine();
            int intRes = Integer.parseInt(res);
            before.add(intRes);
            after.add(intRes);
        }
        Scanner keyFind = new Scanner(System.in);
        System.out.println("What is the number you are trying to find?");
        String keyAns = howMany.nextLine();
        int intKeyAns = Integer.parseInt(keyAns);
        
        Collections.sort(before);

        BinarySearch run = new BinarySearch(0, before.size()-1, intKeyAns, before, after);
    }
}
