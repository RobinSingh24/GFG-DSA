package Recursion;

// given a set of pieces, find the maximum no of pieces that form the entire rope
public class maxPiecesOfARope {
    public static int maxPieces(int n,int a,int b,int c){
        if(n==0) return 0;
        else if(n<0) return -1;
        int res = Math.max(Math.max(maxPieces(n-a,a,b,c),
                           maxPieces(n-b,a,b,c)),
                           maxPieces(n-c,a,b,c));
        if(res==-1)
            return -1;
        else return res+1;
    }
    public static void main(String[] args) {
        System.out.println(maxPieces(9,2,1,3));
    }
}
