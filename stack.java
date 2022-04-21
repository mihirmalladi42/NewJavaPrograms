import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class stack {
    public static void main(String[] args) {
        Scanner whatType = new Scanner(System.in);
        System.out.println("Enter the type of ordering and the number (Type a number for replace, 'remove' for removing, and 'add' to add): ");
        String type = whatType.next();
        String replace = whatType.next();
        ArrayList<Integer> numsStack = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        ArrayList<Integer> numsQueue = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        if (type.equalsIgnoreCase("stack") && !(replace.equalsIgnoreCase("remove")) && !(replace.equalsIgnoreCase("add"))) {
            System.out.println("Before: " + numsStack);
            numsStack.remove(numsStack.size() - 1);
            numsStack.add(Integer.parseInt(replace));
            System.out.println("After: " + numsStack);
        } else if (type.equalsIgnoreCase("queue") && !(replace.equalsIgnoreCase("remove")) && !(replace.equalsIgnoreCase("add"))) {
            System.out.println("Before: " + numsQueue);
            numsQueue.set(0, Integer.parseInt(replace));
            System.out.println("After: " + numsQueue);
        } else if (type.equalsIgnoreCase("stack") && replace.equalsIgnoreCase("remove")) {
            System.out.println("Before: " + numsStack);
            numsStack.remove(numsStack.size() - 1);
            System.out.println("After: " + numsStack);
        } else if (type.equalsIgnoreCase("queue") && replace.equalsIgnoreCase("remove")) {
            System.out.println("Before: " + numsQueue);
            numsQueue.remove(0);
            System.out.println("After: " + numsQueue);
        } else if (type.equalsIgnoreCase("stack") && replace.equalsIgnoreCase("add")) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the number you want to add: ");
            int inpNum = inp.nextInt();
            ArrayList<Integer> numsNewStack = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, inpNum));
            System.out.println("Before: " + numsStack);
            System.out.println("After: " + numsNewStack);
        } else if (type.equalsIgnoreCase("queue") && replace.equalsIgnoreCase("add")) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the number you want to add: ");
            int inpNum = inp.nextInt();
            ArrayList<Integer> numsNewQueue = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, inpNum));
            System.out.println("Before: " + numsQueue);
            System.out.println("After: " + numsNewQueue);
        }
    }
}
