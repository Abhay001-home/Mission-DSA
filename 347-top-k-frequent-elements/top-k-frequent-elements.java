class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        
        // index = frequency
        // Value will be elements
        // bucket[i] = elements occurring i-th time
        List<List<Integer>> bucket = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            bucket.add(new ArrayList<>());
        }
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            
            bucket.get(freq).add(element);
        }
        
        // Pick from right to left to find max frequency elements
        List<Integer> resultList = new ArrayList<>();
        for (int i = n; i >= 0; i--) {
            if (bucket.get(i).isEmpty()) continue;
            
            List<Integer> currentBucket = bucket.get(i);
            while (!currentBucket.isEmpty() && k > 0) {
                resultList.add(currentBucket.remove(currentBucket.size() - 1));
                k--;
            }
        }
        
        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}