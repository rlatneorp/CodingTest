package specialClass.week5.게임_맵_최단거리;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};
    int rowLength;
    int colLength;

    public int solution(int[][] maps) {
        rowLength = maps.length;
        colLength = maps[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[rowLength][colLength];
        queue.add(new int[] {0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];

            if (r == rowLength - 1 && c == colLength - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];


                if (0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && maps[nr][nc] == 1 && !visited[nr][nc]) {
                    queue.add(new int[] {nr, nc, dist + 1});
                    visited[nr][nc] = true;
                }
            }
        }
        return -1;
    }
}