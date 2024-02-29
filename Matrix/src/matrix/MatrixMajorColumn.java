package matrix;

/**
 * in deze class kunnen we matrices ingeven in elke instantie
 * geen setters omdat de class immutable is
 * 
 * Deze class is dezelfde, maar ipv een rowmajororder te gebruiken, gebruiken we nu columnmajororder
 */

public class MatrixMajorColumn {
	
	
	/**
	 * 
	 * @invar de array elements kan niet nul zijn
	 * 	| elements != null
	 * @invar rows kan niet negatief zijn
	 * 	| rows > 0
	 * @invar columns kunnen niet negatief of nul zijn
	 * 	| columns > 0
	 * @invar amount of elements in de array elements is gelijk aan het aantal rows maal het aantal columns
	 * 	| elements.length == rows + columns - 1
	 * 
	 */
	private double[] elements;
	private int rows;
	private int columns;
	
	// constructor
	
	/**
	 * @pre initElements is initialized
	 * 	| initElements != null
	 * @pre initRows is positief
	 * 	| initRows > 0
	 * @pre initcolumns is positief
	 * 	| initColumns > 0
	 * 
	 * @post | initElements.equals(rowMajorOrder()) || initElements.equals(columnMajorOrder())
	 * @post | initRows == getAmountRows()
	 * @post | initColumns == getAmountColumns()
	 * 
	 */
	public MatrixMajorColumn(double[] initElements, int initRows, int initColumns) {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	// getters
	
	
	
	public int getAmountRows() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public int getAmountColumns() {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	/**
	 * @pre | row <= getAmountRows()
	 * @pre | column <= getAmountColumns()
	 * 
	 */
	public double getElementAt(int row, int column) {
		throw new RuntimeException("Not yet implemented");
	}
	
	public double[] rowMajorOrder() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public double[] columnMajorOrder() {
		throw new RuntimeException("Not yet implemented");
	}
	
	public double[] arrayOfRows() {
		throw new RuntimeException("Not yet implemented");
	}
}
