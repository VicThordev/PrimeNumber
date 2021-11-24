import java.util.Scanner;

public class PrimeNumber1 {
    public static boolean isPrime(int pNum) {
        if (pNum<=1) return false;
        for (int i=2;i<Math.sqrt(pNum);i++)
            if (pNum%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sca = new Scanner(System.in);
        int pNum =sca.nextInt();
        if (isPrime(pNum)) System.out.println(pNum+" is a prime number");
        else System.out.println(pNum+" is not a prime number");
    }
}
