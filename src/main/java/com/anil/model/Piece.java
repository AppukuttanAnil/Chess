package com.anil.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Piece {

  private Color color;
  private PieceType pieceType;
  private int numOfMoves;

  @Setter
  private Cell cell;

  public Piece (Color color, PieceType pieceType ){
    this.color = color;
    this.pieceType = pieceType;
    this.numOfMoves = 0;
  }

  public Piece (Color color, PieceType pieceType, Cell cell ){
    this.color = color;
    this.pieceType = pieceType;
    this.numOfMoves = 0;
    this.cell = cell;
  }
}
