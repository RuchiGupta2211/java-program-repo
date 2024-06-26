package org.example;

public class IslandNumbers {

    public int noOfIslands(char[][] grid) {
        int count  = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i<0 || j<0 || i>= grid.length || j >= grid[i].length || grid[i][j] == '0' || grid[i][j] == '2') return;

        grid[i][j] = '2'; // visited

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);

    }

}
