public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 1, 56, 32, 45, 89, 76 };

        showArray(nums);

        for (int i = 0; i < (nums.length - 1); i++) {
            int index = i;

            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }

            if (index != i) {
                swap(nums, i, index);
            }
        }

        showArray(nums);
    }

    private static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}