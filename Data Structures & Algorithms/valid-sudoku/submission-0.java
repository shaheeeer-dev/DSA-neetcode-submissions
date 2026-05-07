class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();
        Set<Character> square = new HashSet<>();
        
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j<board[i].length; j++){
                if (board[i][j] == '.') {
                    continue;
                }
                if (row.contains(board[i][j])){
                    return false;
                }else{
                    row.add(board[i][j]);
                }
            }
            row.clear();
        }

        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (col.contains(board[i][j])) {
                    return false;
                } else {
                    col.add(board[i][j]);
                }
            }
            col.clear();
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (c == '.') continue;
                        if (!square.add(c)) {
                            return false;
                        }
                    }
                }
                square.clear();
            }
        }
        return true;
    }
}
