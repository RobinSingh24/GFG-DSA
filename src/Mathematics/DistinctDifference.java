package Mathematics;

import java.util.*;

public class DistinctDifference {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        HashMap<Integer, Integer> leftMap = new HashMap<>();
        HashMap<Integer, Integer> rightMap = new HashMap<>();

        // Stores the frequency of array
        // element in the map rightMap
        for (int i = 0; i < N; i++) {
            if (rightMap.containsKey(A[i]))
                rightMap.put(A[i],
                        rightMap.get(A[i]) + 1);
            else
                rightMap.put(A[i], 1);
        }

        // Stores the resultant differences
        ArrayList<Integer> res = new ArrayList<>();

        // Traverse the array
        for (int i = 0; i < N; i++) {

            // Find the count in the left
            int countLeft = leftMap.size();

            // Decrement the frequency
            if (rightMap.get(A[i]) > 1) {
                rightMap.put(A[i],
                        rightMap.get(A[i]) - 1);
            }
            else {
                rightMap.remove(A[i]);
            }

            // Find the count in the right
            int countRight = rightMap.size();

            // Insert the resultant difference
            res.add(countLeft - countRight);

            // Increment the frequency
            if (leftMap.containsKey(A[i]))
                leftMap.put(A[i],
                        leftMap.get(A[i]) + 1);
            else
                leftMap.put(A[i], 1);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = getDistinctDifference(3,new int[]{4,3,3});
        System.out.println(Arrays.toString(res.toArray()));
    }
}
