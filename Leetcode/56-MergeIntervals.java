class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int idx = -1;
        for (int[] i : intervals) {
            if (idx == -1 || i[0] > list.get(idx)[1]) {
                list.add(i);
                idx++;
            } else
                list.get(idx)[1] = Math.max(i[1], list.get(idx)[1]);
        }
        return list.toArray(new int[idx + 1][2]);
    }
}

Author: Abhay Kumar Verma
