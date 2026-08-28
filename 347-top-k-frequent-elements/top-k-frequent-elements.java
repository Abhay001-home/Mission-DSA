class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // it is method of HashMap
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i = nums.length - 1; i >= 0; i--) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // System.out.println(map);
        
        int key = 1;
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            // here we sorted the stack
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > value) {
                    key = entry.getKey();
                    value = entry.getValue();
                }
            }
            res[i] = key;
            // removed the top element from min-heap
            map.remove(key);
            value = Integer.MIN_VALUE;

        }
        return res;
    }
}