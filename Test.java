import java.util.Scanner;
public class Test {
    //this method is used to compare two scanner inputs
    /*public Test () {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Type your first input: ");
        String input = inputString.nextLine();

        Scanner inputString2 = new Scanner(System.in);
        System.out.println("Type your second input: ");
        String input2 = inputString2.nextLine();

        if (input.equalsIgnoreCase(input2)) {
            System.out.println("Your two inputs are the same.");
        } else {
            System.out.println("Your two inputs are not the same.");
        }
    }*/
    //This method converts base 10 to base 2
    public Test(int convertToBinary) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Type your base 10 number (Number can't be greater than 1023): ");
        String strinput = inputNum.nextLine();
        int intInputBinary = Integer.parseInt(strinput);
        int quotient = intInputBinary;
        int remainder;
        int binaryVal = 0;
        int multiplier = 1;
        
        while (quotient != 0) {
            remainder = quotient % 2;
            binaryVal += multiplier * remainder;
            quotient /= 2;
            multiplier*=10;
        }   
        System.out.println();
        System.out.println(intInputBinary + " converted to binary is: " + binaryVal);

    }

    public Test(double convertToInt) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Type your binary number (You can't enter a number with more than 10 digits): ");
        String strInput = inputNum.nextLine();
        int intBinaryInput = Integer.parseInt(strInput);
        int binary = intBinaryInput;

        int decimal = 0, power = 0;


        while (binary > 0) {
            int getNum = binary % 10;
            decimal += getNum * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        System.out.println(intBinaryInput + " in base 10 is: " + decimal);
        

    }
    public static void main(String[] args) {
       //Uncomment line 21 to run program
       //Test test = new Test();

       //Uncomment line 66 to convert decimal to binary and uncomment line 67 to convert binary to decimal
       //Test toBinary = new Test(5);
       Test toDecimal = new Test(5.5);
    }
}

