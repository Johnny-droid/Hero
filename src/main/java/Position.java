public class Position {
    private int x;
    private int y;
    public Position(int row, int col) {
        x = row;
        y = col;
    }

    public void setRow(int row) {x = row;}
    public void setCol(int col) {y = col;}
    public int getRow() {return x;}
    public int getCol() {return y;}
}
