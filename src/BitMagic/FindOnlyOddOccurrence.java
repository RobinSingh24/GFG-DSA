package BitMagic;


public class FindOnlyOddOccurrence {
    //works for only single digit no.
    public static int countOddOccurrence(int[] arr){
        int[] count = new int[10];
        for (int j : arr) {
            count[j]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]%2!=0) return i;
        }
    return 0;
    }
    public static int countOddOccurrenceUsingXOR(int[] arr){
        int res=0;
        for (int j : arr) {
            res = res ^ j;
        }
    return res;
    }
    public static void main(String[] args) {
        System.out.println(countOddOccurrence(new int[]{4,3,4,4,4,5,5}));
        System.out.println(countOddOccurrenceUsingXOR(new int[]{4,3,4,4,4,5,5,3,3}));
    }
}
