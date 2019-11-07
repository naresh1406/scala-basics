package dsalgo.interviewbits;

import java.util.ArrayList;

/**
 * Created by ngupta on 6/11/2019 AD.
 */
public class PrimeNumbers {
    public ArrayList<Integer> sieve(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A < 2)
            return result;
        for (int a = 2; a <= A; a++) {
            if (isPrime(a))
                result.add(a);
        }
        return result;
    }

    private boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
