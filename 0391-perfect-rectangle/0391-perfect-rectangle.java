class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        Set<String> corners = new HashSet<>();

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        long area = 0;

        for (int[] r : rectangles) {
            int x1 = r[0];
            int y1 = r[1];
            int x2 = r[2];
            int y2 = r[3];

            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);

            area += (long) (x2 - x1) * (y2 - y1);

            toggle(corners, x1, y1);
            toggle(corners, x1, y2);
            toggle(corners, x2, y1);
            toggle(corners, x2, y2);
        }

        long boundingArea = (long) (maxX - minX) * (maxY - minY);

        if (area != boundingArea) {
            return false;
        }

        if (corners.size() != 4) {
            return false;
        }

        return corners.contains(minX + "," + minY)
            && corners.contains(minX + "," + maxY)
            && corners.contains(maxX + "," + minY)
            && corners.contains(maxX + "," + maxY);
    }

    private void toggle(Set<String> set, int x, int y) {
        String point = x + "," + y;

        if (set.contains(point)) {
            set.remove(point);
        } else {
            set.add(point);
        }
    }
}