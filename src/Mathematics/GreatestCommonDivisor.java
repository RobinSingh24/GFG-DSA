package Mathematics;

public class GreatestCommonDivisor {

    public static int naiveHcf(int a, int b){
        int small = Math.min(a, b);
        int large = Math.max(a, b);

        // return smaller no. if it divides the larger no.
        if(large%small==0) return small;

        // iterate small-1 to 1 to find hcf
        int result=0;
        for(int i=small-1;i>=1;i--)
        {
            if(small%i==0 && large%i==0)
            {
                result = i;
                break;
            }
        }
    return result;
    }

    public static int euclideanHcf(int a, int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b = b-a;
        }
        return a;
    }
    public static int optimisedEuclidean(int a, int b){
        if(b==0)
            return a;
        return optimisedEuclidean(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(optimisedEuclidean(4,6));
    }
}
