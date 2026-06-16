package boardGame;

public class Position {
	
	private Integer column;
	private Integer row;
	
	public Position() {
	}

	public Position(Integer column, Integer row) {
	
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

	@Override
	public String toString() {
		return "Position [column= " + column + ", row= " + row + "]";
	}
	
	
}
