package com.anil.move;

import com.anil.model.Cell;
import com.anil.model.Piece;

public interface Validator {
  boolean isValidMove(Piece piece, Cell cell);

}
