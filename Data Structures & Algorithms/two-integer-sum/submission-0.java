class Solution {

    //nums = [3,4,5,6], target = 7
    //Input: nums = [5,5], target = 10
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complimentaryMap = new HashMap<Integer, Integer>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (complimentaryMap.get(nums[i]) != null) {
                result[0] = Math.min(complimentaryMap.get(nums[i]), i);
                result[1] = Math.max(complimentaryMap.get(nums[i]), i);
                
                break;
            }

            complimentaryMap.put(target-nums[i], i);
        }

        return result;
    }
}
