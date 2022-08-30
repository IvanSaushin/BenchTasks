package banch.task.leetcode.secondTen;


// medium
public class Power_xn {

    public static void main(String[] args) {

//        System.out.println(myPow(2, 2));
//        System.out.println(myPow(2, 3));
//        System.out.println(myPow(2, 4));
//        System.out.println(myPow(2, -3));
//        System.out.println(myPow(2, 10));
        System.out.println(myPow(2.00000, 10));
//        System.out.println(myPow(2, -2));
//        System.out.println(myPow(0.00001, 2147483647));
    }


    // 1
    public static double myPowMy(double x, int n) {
        if (n == 1 || n ==-1) {
            return n>0 ? x : 1/x;
        }
        return (n > 0) ? x*math(x, n-1) : 1/x*math(x, n+1);
    }


    //3
    public static double myPow(double x, int n) {
        double res = x;
        long nn = n;
        if (n<0) nn = -1*nn;

//        while (nn != 1) {
        while (nn > 0) {
            if((nn&1) == 1){
                res = res * x;
                nn--;
            }
            else{
                x = x * x;
                nn >>= 1;
            }
//            res = x * res;
//            nn--;
        }

        if (n < 0) {
            res = 1/ res;
        }

//        while (n == 1 || n== -1) {
//            if (n > 0) {
//                res = res *res;
//                n--;
//            } else {
//                res = 1/ (res * res);
//                n++;
//            }
//        }

        return res;
    }

    // 2
        public static double myPow_1(double x, int n) {

        double val =x;
        if(n == Integer.MIN_VALUE && Math.abs(x) == 1){
            return Math.abs(x);
        }
        if(n == Integer.MIN_VALUE){
            return 0;
        }
        if(n<0){
            val = 1/val;
        }

        return math(val, (long) Math.abs(n));
    }
    public static double math(double x, long n) {
        if(n==0){
            return 1;
        }

        if(n%2==0){
            double r = math(x,n/2);
            return r*r;
        }else{
            return x * math(x,n-1);
        }
    }
}
