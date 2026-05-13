class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows=new HashSet[9];
         HashSet<Character>[] columns=new HashSet[9];
          HashSet<Character>[] grid=new HashSet[9];

          for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            columns[i]=new HashSet<>();
            grid[i]=new HashSet<>();
          }

          for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char cel=board[i][j];
                if(cel=='.'){
                    continue;
                }

                int g=(i/3)*3+(j/3);

                if(rows[i].contains(cel) || columns[j].contains(cel) || grid[g].contains(cel)){
                    return false;
                }

                rows[i].add(cel);
                columns[j].add(cel);
                grid[g].add(cel);
            }
          }

          return true;
        
    }
}
