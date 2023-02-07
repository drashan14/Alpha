class Sort {
    public static int[] sortArrayByParityII(int[] nums) {
        int count1 = 1;
        int arr[] = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                arr[count] = nums[i];
                count = count + 2;

            } else {
                arr[count1] = nums[i];
                count1 += 2;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 2, 5, 7 };
        sortArrayByParityII(nums);
    }
}