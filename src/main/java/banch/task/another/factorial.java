package banch.task.another;

import java.math.BigInteger;

public class factorial {

    public static void main(String[] args) {

        int x = 9;
        System.out.println(getFactorial(x));
        System.out.println(getAnagramm(x));
        System.out.println(factorialBigInt(x));
    }

    public static int getFactorial(int x) {

        if (x<=1) {
            return 1;
        }

        return x+(getFactorial(x-1));
    }

    static int res = 0;
    public static int getAnagramm(int init) {
        if (init == 1){
            return res+1;
        }

        res += getFactorial(init);
        return getAnagramm(init-1);
    }

    public static BigInteger factorialBigInt(int value) {
        if (value == 1) {
            return BigInteger.valueOf(value);
        }

        return BigInteger.valueOf(value).multiply(factorialBigInt(--value));
    }
}

/*
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
        }
        return result;
 */
