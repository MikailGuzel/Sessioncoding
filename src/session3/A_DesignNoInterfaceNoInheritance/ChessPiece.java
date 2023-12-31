package session3.A_DesignNoInterfaceNoInheritance;

/**
 * Exercise:
 *  * a) A Chess piece has a type (e.g., "King", "Queen", "Bishop", etc.), a color, a position in the chessboard
 *      and a reference to the ChessBoard where it is placed.
 *  * b) Define the class, the constructor and the getter and setter methods.
 *  * c) Implement the method "isLegalTheMovement"
 **/

public class ChessPiece {

    private String type;

    private String color;

    private int x; //position X in the chess board
    private int y; //position Y in the chess board

    private ChessBoard chessBoard;

    public ChessPiece(String type, String color, int x, int y, ChessBoard chessBoard) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
        this.chessBoard = chessBoard;
    }

    public String getColor(){
        return this.color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color){
        if (color=="White" || color == "Black"){
            this.color=color;
        }
    }
    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isLegalTheMovement(int newX, int newY){

        return true;
    }

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session3_A_ChessPiece", I_did_finish, I_did_understand, comment);

    }

}
