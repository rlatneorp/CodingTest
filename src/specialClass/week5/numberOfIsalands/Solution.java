package specialClass.week5.numberOfIsalands;

//https://leetcode.com/problems/number-of-islands/description/
import java.util.*;

public class Solution {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int numberOfIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    int id = i * cols + j;
                    graph.put(id, new ArrayList<>());
                    visited.put(id, false);

                    if (i > 0 && grid[i - 1][j] == '1') {
                        graph.get(id).add((i - 1) * cols + j);
                    }
                    if (i < rows - 1 && grid[i + 1][j] == '1') {
                        graph.get(id).add((i + 1) * cols + j);
                    }
                    if (j > 0 && grid[i][j - 1] == '1') {
                        graph.get(id).add(i * cols + (j - 1));
                    }
                    if (j < cols - 1 && grid[i][j + 1] == '1') {
                        graph.get(id).add(i * cols + (j + 1));
                    }
                }
            }
        }
        for (int id : graph.keySet()) {
            if (!visited.get(id)) {
                bfs(id);
                numberOfIslands++;
            }
        }
        return numberOfIslands;
    }

    public static void bfs(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startVertex);
        visited.put(startVertex, true);

        while (!queue.isEmpty()) {
            int curVertex = queue.poll();
            for (int nextVertex : graph.get(curVertex)) {
                if (!visited.get(nextVertex)) {
                    queue.offer(nextVertex);
                    visited.put(nextVertex, true);
                }
            }
        }
    }
}