package BitMagic;

public class CheckKthBitSetOrNot {
    public static boolean naivecheckBit(int n, int k){
        //assuming k<= no. of bits in binary representation of n
        while(k>1){
            n/=2;
            k--;
        }
        return n % 2 != 0;
    }
    public static boolean leftShiftCheck(int n, int k){
        int leftShift = 1<<(k-1);
        return (n & leftShift) != 0;
    }
    public static boolean rightShiftCheck(int n, int k){
        return (n >> (k - 1) & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(naivecheckBit(5,3));
        System.out.println(leftShiftCheck(5,2));
        System.out.println(rightShiftCheck(5,2));
    }
}
