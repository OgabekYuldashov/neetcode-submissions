class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (mySet.contains(val))
                return true;

            mySet.add(val);
        }

        return false;
    }
}