import java.io.*;

public class RateCalc {
    public static int calcInsurance(String birth) throws Exception {
        final int year = 2000;
        int age = 0;
        int birthYear;
        try {
            birthYear = Integer.parseInt(birth);
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input. Birth year should be a valid number.");
        }
        age = year - birthYear;
        if (age < 16) {
            throw new Exception("Too young for insurance!");
        } else {
            int drivenYears = age - 16;
            if (drivenYears < 4) {
                return 1000;
            } else {
                return 600;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData = null;
        System.out.println("Enter Birth Year : ");
        inData = stdin.readLine();
        try {
            System.out.println("Your insurance is: " + calcInsurance(inData));
        } catch (Exception oops) {
            System.out.println(oops.getMessage());
        }
    }
}
