package Mathematics;

public class ComputingPower {
    public static int recursivePow(int n,int pow){
        if(pow==0)
            return 1;
        int temp = recursivePow(n,pow/2);
        temp = temp * temp;
        if(pow%2==0)
            return temp;
        else
            return temp*n;
    }
    public static int iterativePow(int num, int pow){
        int res = 1;
        while (pow>0){
            if(pow%2!=0)
                res = res * num;
            num = num * num;
            pow = pow/2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(iterativePow(3,4));
    }
}
