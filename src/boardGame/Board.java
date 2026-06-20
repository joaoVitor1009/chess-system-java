package boardGame;

import boardGame.Exception.BoardException;

public class Board {

	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro, é necessario o tabuleiro ter 1 ou mais linhas e colunas");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public Piece piece(Integer row, Integer column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Erro, posição não esta no tabuleiro");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Erro, posição não esta no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Nesta posição ja existe uma peça: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Erro, posição não esta no tabuleiro");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece auxiliar = piece(position);
		auxiliar.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return auxiliar;
	}

	private boolean positionExists(Integer row, Integer column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Erro, posição não esta no tabuleiro");
		}
		return piece(position) != null;
	}
}
