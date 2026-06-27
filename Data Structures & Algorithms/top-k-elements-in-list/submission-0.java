class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer count = myMap.get(nums[i]);
            if (count != null) {
                myMap.put(nums[i], ++count);
            } else {
                myMap.put(nums[i], 1);
            }
        }

        // Create Entry list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(myMap.entrySet());

        // sort descending
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            output[i] = entry.getKey();
        }

        return output;
    }
}
