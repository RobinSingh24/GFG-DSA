package BitMagic;

public class CountSetBits {
    public static int naivecountBits(int n){
        int count=0;
        while (n>0){
            if(n%2!=0)
                ++count;
            n/=2;
        }
    return count;
    }
    public static int countBits(int n){
        int res=0;
        while (n>0){
            n= (n&(n-1));
            ++res;
        }
    return res;
    }
    public static int optimisedCountBits(int n){
        int res=0;
        int[] table = new int[256];
        // populate the countbits table
        table[0] =0;
        for(int i=1;i<256;i++){
            table[i] = (i&1) + table[i/2];
        }
        res = res + table[n&0xff];
        n= n>>8;
        res = res + table[n&0xff];
        n= n>>8;
        res = res + table[n&0xff];
        n= n>>8;
        res = res + table[n&0xff];


        return res;
    }
    public static void main(String[] args) {
        System.out.println(optimisedCountBits(8));
        System.out.println(countBits(8));
        System.out.println(naivecountBits(8));
    }
}
