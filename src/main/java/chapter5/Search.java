package chapter5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {2,1,3,8,5,4,7,4};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println(" tiv gtnvav ");
        }
    }
}
