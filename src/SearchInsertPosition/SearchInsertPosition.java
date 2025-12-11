package SearchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(searchInsert(nums, 8)); // should print 5
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        // if target is bigger than all elements, insert at the end
        return nums.length;
    }
}
