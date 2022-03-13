import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RacingSimulation {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String CYAN = "\u001B[36m";
    public static double worldRecord = 9.58;
    public static String worldRecordCountry = BLACK + "Ja" + YELLOW + "mai" + GREEN + "ca";

    public static int Races (int year) {
        double[][] raceTimes = new double[5][5];
        String[] countries = {RED + "Unit" + WHITE + "ed St" + BLUE + "ates" + RESET, BLACK + "Ge" + RED + "rma" + YELLOW + "ny" + RESET, BLACK + "Ja" + YELLOW + "mai" + GREEN + "ca" + RESET, YELLOW + "Ch" + RED + "ina" + RESET, BLUE + "Fr" + WHITE + "an" + RED + "ce" + RESET};
        System.out.println(GREEN + year + " International Racing Competition (The world record is " + worldRecord + " and is held by " + worldRecordCountry + GREEN + ")" + RESET);
        System.out.println(GREEN + "----------------------------------------" + RESET);
        for (int i = 0; i < raceTimes.length; i++) {
            System.out.println(countries[i] + " Times:");
            int sum = 0;
            for (int j = 0; j < raceTimes[i].length; j++) {
                Random rand = new Random();
                double randInt = rand.nextDouble(15);
                DecimalFormat rounded = new DecimalFormat("#.##");
                String time = rounded.format(randInt);
                double doubleTime = Double.parseDouble(time) + 9;
                if (doubleTime < worldRecord) {
                    System.out.println();
                    System.out.println("| " + countries[i] + " has set the new world record of " + doubleTime + ". |");
                    worldRecordCountry = countries[i];
                    System.out.println();
                    worldRecord = doubleTime;
                } else {
                    Random randColor = new Random();
                    int intRandColor = randColor.nextInt(6);
                    if (intRandColor == 0) {
                        System.out.println(CYAN + doubleTime + " seconds" + RESET);
                    } else if (intRandColor == 1) {
                        System.out.println(RED + doubleTime + " seconds" + RESET);
                    } else if (intRandColor == 2) {
                        System.out.println(GREEN + doubleTime + " seconds" + RESET);
                    } else if (intRandColor == 3) {
                        System.out.println(YELLOW + doubleTime + " seconds" + RESET);
                    } else if (intRandColor == 4) {
                        System.out.println(BLUE + doubleTime + " seconds" + RESET);
                    } else {
                        System.out.println(WHITE + doubleTime + " seconds" + RESET);
                    }
                }
            }
            System.out.println();
        }
        year++;
        RacingSimulation doAgain = new RacingSimulation(year);
        return year;
    }
    public RacingSimulation (int year) {
        Scanner doAgain = new Scanner(System.in);
        System.out.println(GREEN + "Do you want to see the " + year + " International Racing Competition? (yes or no): " + RESET);
        String ans = doAgain.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            int race = Races(year);
        } else if (ans.equalsIgnoreCase("no")){
            System.out.println(CYAN + "Thank you for watching the International Racing Competition." + RESET);
        } else {
            System.out.println(RED + "Enter a valid response." + RESET);
            RacingSimulation repeat = new RacingSimulation(year);
        }
    }
    public static void main(String[] args) {
        int yearBegin = Integer.parseInt(args[0]);
        int newYear;
        newYear = Races(yearBegin);
    }
}
