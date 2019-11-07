package dsalgo.interviewbits;

/**
 * Created by ngupta on 8/11/2019 AD.
 */
public class BinaryRepresentation {
    public String findDigitsInBinary(int A) {
        if (A == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (A > 0) {
            if (A % 2 == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            A = A / 2;
        }

        return sb.reverse().toString();
    }
}
