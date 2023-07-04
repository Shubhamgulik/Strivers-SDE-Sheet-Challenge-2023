class Pair{
    int x,y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int orangesRotting(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        Queue<int[]> q=new LinkedList<>();
        int totalOranges = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(a[i][j] != 0){
                    totalOranges++;
                }
            }
        }

        if(totalOranges == 0) return 0;

        int count = 0;
        int minutes = 0;

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};

        while(!q.isEmpty()){
            int size = q.size();
            count = count + size;

            for(int i=0; i<size; i++){
                int[] point = q.poll();
                for(int k = 0; k<4; k++){
                    int x = point[0] + dx[k];
                    int y = point[1] + dy[k];

                    if(x < 0 || y<0 || x>=m || y>=n || a[x][y] == 0 || a[x][y] == 2)  continue;

                    a[x][y] = 2;
                    q.offer(new int[]{x,y});
                }
            }

            if(q.size() != 0) minutes += 1;

        }

        return totalOranges == count ? minutes : -1;













    }
}