package BitMagic;


// Given an array the task is two find the only two odd occurring elements in the array. Rest of the
// elements in the array are even occurring elements.
public class FindTwoOddOccurrence {
    public static void findTwoOddOccurrence(int[] arr){
        int xor=0,res1=0,res2=0;
        for(int i : arr){
            xor = xor ^ i;
        }
        // find the least set bit in the xor
        int sb = xor & (~(xor-1));
        for(int i: arr){
            if((i & sb) !=0)
                res1 = res1 ^ i;
            else
                res2 = res2 ^ i;
        }
    System.out.println(res1 + " " + res2);
    }
    public static void main(String[] args) {
        findTwoOddOccurrence(new int[]{3,4,3,4,5,7,4,4,7,6});
    }
}
