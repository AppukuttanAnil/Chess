package com.anil.model;

import com.anil.exception.InvalidMoveException;
import com.anil.move.ChessMove;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

  private String playerName;
  private List<Piece> pieces;
  private Color color;
  private Board board;


  public Player(String name, Color color){
    this.color = color;
    playerName = name;
    this.board = board;
    setupPieces();
  }

  private void setupPieces() {
    final List<Piece> pieces = new ArrayList<>();

    for (int i = 0; i < 8; i++){
      Piece pawn  = new Piece(color, PieceType.PAWN);
      if (color == Color.WHITE){
        pawn.setCell(board.getCells()[1][i]);
      }else{
        pawn.setCell(board.getCells()[6][i]);

      }
      pieces.add(pawn) ;
    }
    Piece leftRook  = new Piece(color, PieceType.ROOK,
        color == Color.WHITE ? board.getCells()[0][0] : board.getCells()[7][0]);
    Piece rightRook  = new Piece(color, PieceType.ROOK,
        color == Color.WHITE ? board.getCells()[0][7] : board.getCells()[7][7]);

    Piece leftKnight  = new Piece(color, PieceType.KNIGHT,
        color == Color.WHITE ? board.getCells()[0][1] : board.getCells()[7][1]);
    Piece rightKnight = new Piece(color, PieceType.KNIGHT,
        color == Color.WHITE ? board.getCells()[0][6] : board.getCells()[7][6]);

    Piece leftBishop = new Piece(color, PieceType.BISHOP,
        color == Color.WHITE ? board.getCells()[0][2] : board.getCells()[7][2]);
    Piece rightBishop  = new Piece(color, PieceType.BISHOP,
        color == Color.WHITE ? board.getCells()[0][5] : board.getCells()[7][5]);

    Piece king = new Piece(color, PieceType.KING,
        color == Color.WHITE ? board.getCells()[0][4] : board.getCells()[7][4]);
    Piece queen  = new Piece(color, PieceType.QUEEN,
        color == Color.WHITE ? board.getCells()[0][3] : board.getCells()[7][3]);

    pieces.add(leftRook);
    pieces.add(rightRook);
    pieces.add(leftKnight);
    pieces.add(rightKnight);
    pieces.add(leftBishop);
    pieces.add(rightBishop);
    pieces.add(king);
    pieces.add(queen);
  }

  public void playMove(Piece pieceToMove, Cell cell, ChessMove chessMove) throws InvalidMoveException {
    chessMove.move(pieceToMove, cell);
  }

}
