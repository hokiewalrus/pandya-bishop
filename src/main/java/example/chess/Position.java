package example.chess;

/**
 * This class represents a Position on a chess board
 */
class Position {
    public static final char MIN_COLUMN = 'a';
    public static final char MAX_COLUMN = 'h';

    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;

    private int row;
    private char column;

    public static boolean isValid(char column, int row) {
        return column >= MIN_COLUMN && column <= MAX_COLUMN && row >= MIN_ROW && row <= MAX_ROW;
    }

    public Position(char column, int row) {
        this.row = row;
        this.column = column;

        if (!isValid(column, row)) {
            throw new RuntimeException(String.format("Invalid position: %s%d", column, row));
        }
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return String.valueOf(column + row);
    }
}
