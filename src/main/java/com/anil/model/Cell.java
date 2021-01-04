package com.anil.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cell {
  private int x;
  private int y;

  @Setter
  private char cellChar; //denotes a to h

  @Setter
  private Color color;

  @Setter
  private Piece piece;

  public boolean isEmptyCell(){
    return null == piece;
  }


}
