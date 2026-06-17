package boardGame;

public class Position {
	
	private Integer row;
	private Integer column;
	
	public Position() {
	}

	public Position(Integer row, Integer column) {
	
		this.column = column;
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}
	
	public void setvalues(Integer row, Integer column) {
		this.column = column;
		this.row = row;
	}
	@Override
	public String toString() {
		return "posição [row= " + row + ", column= " + column + "]";
	}

	
	
	
}
