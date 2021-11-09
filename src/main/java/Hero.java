import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Position position;

    public Hero(int row, int col) {
        Position pos = new Position(row, col);
        position = pos;
    }
    public int getRow() {return position.getRow();}
    public int getCol() {return position.getCol();}
    public void setPosition(Position position) {this.position = position;}
    public Position moveUp() {return new Position(position.getRow(), position.getCol() - 1);}
    public Position moveDown() {return new Position(position.getRow(), position.getCol() + 1);}
    public Position moveLeft() {return new Position(position.getRow() - 1, position.getCol());}
    public Position moveRight() {return new Position(position.getRow() + 1, position.getCol());}
    public void draw(Screen screen) {
        screen.setCharacter(position.getRow(), position.getCol(), TextCharacter.fromCharacter('X')[0]);
    }
}
