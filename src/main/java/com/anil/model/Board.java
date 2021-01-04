package com.anil.model;

import lombok.Getter;

@Getter
public class Board {
  int boardSize ;
  Player player1;
  Player player2;

  Cell [][] cells;

  public Board() {
    this.boardSize = 8;
    cells = new Cell[boardSize][boardSize];

    for (int i = 0 ; i <boardSize; i++){
      for (int j = 0 ; j <cells[i].length; j++){
        cells[i][j] = generateCell(i, j);
      }
    }
  }

  private Cell generateCell(int i, int j) {
    Cell newCell = new Cell();
    if (i %2 ==0 && j % 2 == 0){
      newCell.setColor(Color.BLACK);
    }
    if (i %2 ==0 && j % 2 == 1){
      newCell.setColor(Color.WHITE);
    }
    if (i %2 ==1 && j % 2 == 0){
      newCell.setColor(Color.WHITE);
    }
    if (i %2 ==1 && j % 2 == 1){
      newCell.setColor(Color.BLACK);
    }
    newCell.setCellChar((char) (97 + i));
    return newCell;
  }
}
