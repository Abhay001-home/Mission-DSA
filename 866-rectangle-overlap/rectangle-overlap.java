class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // overlap horizontally
        boolean xOverlap = rec1[2] > rec2[0] && rec2[2] > rec1[0];
        
        // overlap vertically
        boolean yOverlap = rec1[3] > rec2[1] && rec2[3] > rec1[1];
        
        // overlap only if both conditions are true
        return xOverlap && yOverlap;
    }
}