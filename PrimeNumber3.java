import java.text.MessageFormat;
import java.util.Scanner;

public class PrimeNumber3 {
    int vic=0; int pNum2=0;
    boolean ade=false;
    Scanner scn = new Scanner(System.in);
    public int  vic1() {
        System.out.println("Enter your input: ");
        int pNum;
        try (Scanner sca = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                pNum = sca.nextInt();
                if (pNum <= 1 || pNum % 2 == 0)
                    System.out.println(MessageFormat.format("{0} is not a prime number.", pNum));
                    for (int j = 2; j < Math.sqrt(pNum); j++) {
                        if (pNum % j != 0) {
                            System.out.println(pNum + " is a prime number.");
                            vic+=pNum;
                        }
                    }
                    System.out.printf("%d is the sum of prime numbers.%n", vic);
                }
            }
            return vic;
        }


    public static void main(String [] args) {
        PrimeNumber3 primeNumber3 = new PrimeNumber3();
        primeNumber3.vic1();
    }
}