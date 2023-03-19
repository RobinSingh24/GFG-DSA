package Mathematics;

import java.util.Arrays;

public class FindPrimeUptoN {
    public static void findPrimes(int n){
        for(int i=2;i<=n;i++){
            if(CheckForPrime.optimisedPrime(i))
                System.out.println(i);
        }
    }
    public static void sievePrime(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i])
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]) System.out.println(i);
        }
    }

    public static void optimisedSievePrime(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i)
                    isPrime[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        optimisedSievePrime(60);
    }
}
