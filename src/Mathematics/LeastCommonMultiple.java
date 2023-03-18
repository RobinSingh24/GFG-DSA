package Mathematics;

public class LeastCommonMultiple {
    public static int naiveLcm(int a, int b){
        int res = Math.max(a,b);
        while (true){
            if(res%a==0 && res%b==0)
                return res;
            res++;
        }
    }
    public static int optimisedLcm(int a, int b){
        int gcd = GreatestCommonDivisor.optimisedEuclidean(a,b);
        return (a*b)/gcd;
    }

    public static void main(String[] args) {
        System.out.println(optimisedLcm(2,6));
    }
}
