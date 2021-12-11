import java.util.ArrayList;

public class PrimeNumber3 {
    int pNumAdd = 0;
    ArrayList<Integer> arr = new ArrayList<>(10);


    public static boolean ifPrime(int prime) {
        if (prime <= 1) return false;
        else if (prime == 2) return true;
        else if (prime % 2 == 0) return false;
        for (int i = 2; i < Math.sqrt(prime); i++) {
            if (prime % i == 0) return false;
            else return true;
        }


return true;
}

public static int sumPrime(int [] arr) {
    int sum=0;

        for (int prime : arr) {
            if (ifPrime(prime)) sum+=prime;
        }
    System.out.println("The sum of the prime numbers are "+sum);
        return sum;
}
    public static void main(String [] args) {
        int [] arr = {2,4,5,43,4,5,3,54,32,23};

        System.out.print("The numbers are ");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        sumPrime(arr);
    }
}
