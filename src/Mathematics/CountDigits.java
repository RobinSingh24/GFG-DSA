package Mathematics;

public class CountDigits {

    public static void main(String [] args){
        int n = 123;
        int count=0;
        while(n!=0){
            n/=10;
            ++count;
        }
        System.out.println(count);
    }

}
