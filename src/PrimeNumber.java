import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        boolean pNumTrue=true;
        int i,pNum,pNumCheck=0,pNumDivisor;
        Scanner sca = new Scanner(System.in);
        pNum=sca.nextInt();
        pNumDivisor=pNum/2;

            if (pNum == 1 || pNum == 0) System.out.println(pNum + " is not a prime number.");
            else if (pNum > 2) {
                for (i = 2; i <= pNumDivisor; i++)
                    if (pNum % i == 0) System.out.println(pNum + " is not a prime number.");
                pNumCheck = 1;
            } else System.out.println(pNum + " is a prime number.");

    }
}
