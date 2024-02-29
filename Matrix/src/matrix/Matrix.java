package matrix;

import java.util.Arrays;

/**
 * in deze class kunnen we matrices ingeven in elke instantie
 * geen setters omdat de class immutable is
 */

public class Matrix {
	
	
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
	public Matrix(double[] initElements, int initRows, int initColumns) {
		elements = initElements; //this should be copied due to a certain exposure, but it can be skipped in this program bc the elements can't be changed
		rows = initRows;
		columns = initColumns;
	}
	
	
	// getters
	
	
	
	public int getAmountRows() {
		return rows;
	}
	
	public int getAmountColumns() {
		return columns;
	}
	
	
	/**
	 * @pre | row <= getAmountRows()
	 * @pre | column <= getAmountColumns()
	 * 
	 */
	public double getElementAt(int row, int column) {
		return elements[row * 3 + column];
	}
	
	public double[] rowMajorOrder() {
		return elements;
	}
	
	public double[] columnMajorOrder() {
		double[] newArray = new double[elements.length];
		for (int col = 0; col < columns; col++) {
			for (int row = 0; row < columns; row++) {
				newArray[col * row + row] = elements[row * col + col];
			}
		}
		return newArray;
	}
	
	public double[] arrayOfRows() {
		double[][] newArray = new double[rows][columns];
		for (int col = 0; col < columns; col++) {
			for (int row = 0; row < rows; row++) {
			
				newArray[row][col] = elements[row * col + col];
			}
			
		}
		return elements;
	}
}
