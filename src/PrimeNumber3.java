import java.util.ArrayList;

public class PrimeNumber3 {
    int pNumAdd=0;
    ArrayList<Integer> arr =new ArrayList<>(10);


    public void primeMethod1(ArrayList<Integer> arr) {
        arr.add(1);
        arr.add(3);
        arr.add(13);
        arr.add(21);
        arr.add(24);
        arr.add(45);
        arr.add(17);
        for (int pNum:arr) {
            if (pNum<2) System.out.println(pNum+" is not a prime number.");
            else if (pNum%2==0) System.out.println(pNum+" is not a prime number.");
            for (int i = 2; i < Math.sqrt(pNum); i+=arr.size()) {
                if (pNum % i == 0) System.out.println(pNum+" is not a prime number.");
                else pMethod2(pNum);
            }
        }

        }

    private void pMethod2(int pNum) {
        System.out.println(pNum + " is a prime number.");
        pNumAdd+= pNum;
        System.out.printf("%d is the sum of prime numbers.%n", pNumAdd);
    }


    public static void main(String [] args) {
        PrimeNumber3 primeNumber3 = new PrimeNumber3();
        primeNumber3.primeMethod1(primeNumber3.arr);
    }
}
