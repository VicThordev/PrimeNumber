import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber2<vic> {
    public int prime() {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter your enter: ");
        int vic = 0;
        for (int i = 0; i < 10; i++) {
            Scanner sca = new Scanner(System.in);
            int pNum = sca.nextInt();
            arr.add(pNum);
            vic +=pNum;
            System.out.println("This is the sum "+ vic);
            if (pNum<=1) System.out.println(MessageFormat.format("{0} is not a prime number.", pNum));
            if (pNum%2==0) System.out.println(pNum+" is not prime");
            for (int j=2;j<Math.sqrt(pNum);j++)
                if (pNum%j==0) System.out.println(pNum+" is not a prime number.");
                else System.out.println(pNum+" is a prime number.");
        }
        return vic;
    }

    public static void main(String[] args) {
        PrimeNumber2 primeNumber2=new PrimeNumber2();
        primeNumber2.prime();
    }
}
