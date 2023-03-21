package BitMagic;

public class FindMissingInArray {
    // Given an array of size n (containing values in the range [1,n+1]), find the missing no. in the array
    public static int findMissing(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        for(int i=1;i<=arr.length+1;i++){
            res = res ^ i;
        }
    return res;
    }
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1,4,5,2}));
    }
}
