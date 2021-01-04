package com.anil.move;

import com.anil.exception.InvalidMoveException;
import com.anil.model.Cell;
import com.anil.model.Piece;

public interface ChessMove {
  void move(Piece pieceToMove, Cell cell) throws InvalidMoveException;
}
