class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int i = 0,j = 0;
        int n = grid.length;
        int res[] = new int[2];
        boolean[][] v = new boolean[grid.length][grid[0].length];
        v[0][0] = true;
        while(true){
            int ni=i;
            int nj = j;
            if(grid[ni][nj] == 'R'){
                if(nj == grid[0].length-1){
                    break;
                }
                nj++;
            }
            else if(grid[ni][nj] == 'L'){
                if(nj<=0){
                    break;
                }
                nj--;
            }
            else if(grid[ni][nj] == 'D'){
                if(ni == n-1){
                    break;
                }
                ni++;
            }
            else if(grid[ni][nj] == 'U'){
                if(i<=0){
                    break;
                }
                ni--;
            }
            if(v[ni][nj]){
                break;
            }
            i = ni;
            j = nj;
            v[i][j] = true;
           
        }
        res[0] = i;
        res[1] = j;
        return res;
    }
}