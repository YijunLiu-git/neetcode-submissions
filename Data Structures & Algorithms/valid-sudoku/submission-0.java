class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rows = new HashMap<>();
        Map<Integer,Set<Character>> cols = new HashMap<>();
        Map<String,Set<Character>> s = new HashMap<>();

        for(int r = 0; r<9;r++){
            for(int c = 0; c<9;c++){
                if(board[r][c]=='.')continue;

                String sk = (r/3)+","+(c/3);

                if(rows.computeIfAbsent(r,k->new HashSet<>()).contains(board[r][c])||
                cols.computeIfAbsent(c,k->new HashSet<>()).contains(board[r][c])||
                s.computeIfAbsent(sk,k->new HashSet<>()).contains(board[r][c])){
                    return false;
                }

                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                s.get(sk).add(board[r][c]);
            }
        }
        return true;
    }
}
