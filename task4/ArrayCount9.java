/*
Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class ArrayCount9 {
    public static void main(String[] args) {
        ArrayCount9 result = new ArrayCount9();
        System.out.println(result.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }
}
