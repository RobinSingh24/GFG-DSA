package BitMagic;

public class PowerSet {
    public static void powerSet(String input){
        int setCount = (int)Math.pow(2,input.length());
        // 0 1 2 3 4 5 6 7 and input= abc
        // 000 -> ""
        // 001 -> "a"
        // 010 -> "b"
        // 011 -> "ab"
        // 100 -> "c"
        // 101 -> "ac"
        // 110 -> "bc"
        // 111 -> "abc"
        for(int i=0;i<setCount;i++){

            for(int j=0;j<input.length();j++){
                if((i & (1<<j)) !=0)
                    System.out.print(input.charAt(j));
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
            powerSet("abc");
    }
}
