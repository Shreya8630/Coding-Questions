class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2,
                           int bx1, int by1, int bx2, int by2) {

        // Area of first rectangle
        long area1 = (long) (ax2 - ax1) * (ay2 - ay1);

        // Area of second rectangle
        long area2 = (long) (bx2 - bx1) * (by2 - by1);

        // Calculate overlapping width
        long overlapWidth = Math.max(
            0,
            Math.min(ax2, bx2) - Math.max(ax1, bx1)
        );

        // Calculate overlapping height
        long overlapHeight = Math.max(
            0,
            Math.min(ay2, by2) - Math.max(ay1, by1)
        );

        // Overlapping area
        long overlapArea = overlapWidth * overlapHeight;

        // Total area
        return (int) (area1 + area2 - overlapArea);
    }
}