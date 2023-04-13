package Recursion;

public class subsetsOfAString {
    public static void subsets(String input,String current,int index){
        int n = input.length();
        if(index==n){
            System.out.println(current);
            return;
        }
        subsets(input,current + input.charAt(index),index+1);
        subsets(input,current,index+1);
    }
    public static void main(String[] args) {
        subsets("abc","",0);
    }
}
