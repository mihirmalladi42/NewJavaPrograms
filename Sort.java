import java.util.ArrayList;
import java.util.Scanner;
public class Sort 
{
 public static void main(String[] args) 
 {
     ArrayList<Integer> arr = new ArrayList<Integer>();
     Scanner howMany = new Scanner(System.in);
     System.out.println("How many numbers do you want to sort?");
     int intHowMany = howMany.nextInt();
     for (int i = 1; i <= intHowMany; i++) {
        Scanner num = new Scanner(System.in);
        System.out.println("What is number " + i + "?");
        int intNum = num.nextInt();
        arr.add(intNum);
     }
  //int arr[] = {60,10,23,40,55};
 
  for (int i = 0; i < arr.size(); i++) {
   int min = i;
     for (int j = i+1; j < arr.size(); j++) {
    //finding the minimum value
         if(arr.get(j) < arr.get(min)){
            min = j;
         }
 
     }
   //Swapping
   int temp = arr.get(min);
   arr.set(min, i);
   arr.set(i, temp);
  }
  for (int j = 0; j < arr.size(); j++) 
  {
   System.out.print(arr.get(j) +" ");
  }
 }
}