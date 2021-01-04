package com.anil.move;

import com.anil.model.Cell;
import com.anil.model.Piece;

public class PawnMoveValidator implements Validator {
  @Override
  public boolean isValidMove(Piece piece, Cell cell) {
    Piece current = cell.getPiece();

   return current.getColor() == piece.getColor() ? false : validateInDetail(piece, cell);
  }

  private boolean validateInDetail(Piece piece, Cell cell) {

  }
}
