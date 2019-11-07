package dsalgo.interviewbits;

/**
 * Created by ngupta on 8/11/2019 AD.
 */
public class VerifyPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(39601));
    }

    public static boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
