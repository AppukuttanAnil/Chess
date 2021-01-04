package com.anil.helper;

import com.anil.model.Board;
import com.anil.model.Cell;

public class BoardHelper {

  public static Cell getCell(Board board, int x, int y){
    if (isValidBounds(board, x, y)) {
      return null;
    }

    return board.getCells()[x][y];
  }

  public static Cell getLeftCell(Board board, int x, int y){
    if (isValidBounds(board, x, y-1)) {
      return null;
    }

    return board.getCells()[x][y-1];
  }

  public static Cell getRightCell(Board board, int x, int y){
    if (isValidBounds(board, x, y+1)) {
      return null;
    }

    return board.getCells()[x][y+1];
  }

  public static Cell getTopCell(Board board, int x, int y){
    if (isValidBounds(board, x-1, y)) {
      return null;
    }

    return board.getCells()[x-1][y];
  }

  public static Cell getBottomCell(Board board, int x, int y){
    if (isValidBounds(board, x+1, y)) {
      return null;
    }

    return board.getCells()[x][y+1];
  }

  private static boolean isValidBounds(Board board, int x, int y){
    if (x < 0 || x >= board.getBoardSize() || y < 0 || y >= board.getBoardSize()) {
      return false;
    }

    return true;
  }
}
