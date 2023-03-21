package BitMagic;

public class PowerOfTwo {
    public static boolean checkPowerOfTwo(int n){
        // return true when n!=0 and we have only one set bit
        return (n!=0) && ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(32));
    }
}
