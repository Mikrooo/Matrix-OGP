package matrix;

import java.util.stream.IntStream;

import java.util.Arrays;

/**
 * elke instantie van deze klasse stelt een matrix an double-waarden met een gegeven hoogte en breedte voor
 * @invar | 0 <= getAantalRijen()
 * @invar | 0 <= getAantalKolommen()
 * 
 * @immutable
 */

public class Matrix {
	
	/**
	 * @invar | 0 <= aantalRijen
	 * @invar | 0 <= aantalKolommen
	 * @invar | elementenColumnMajor != null
	 * @invar | elementenColumnMajor.length == aantalRijen * aantalKolommen
	 * 
	 */
	private int aantalRijen;
	private int aantalKolommen;
	
	/**\
	 * @representationObject
	 */
	private double[] elementenColumnMajor;
		

	public int getAantalRijen() {
		return aantalRijen;
	}

	public int getAantalKolommen() {
		return aantalKolommen;
	}
	
	
	/**
	 * @pre | 0 <= rijIndex && rijIndex < getAantalRijen()
	 * @pre | 0 <= kolomIndex && kolomIndex < getAantalRijen()
	 * @post | result == getElementen()[rijIndex][kolomIndex]
	 */
	public double getElementAt(int rijIndex, int kolomIndex) {
		return elementenColumnMajor[kolomIndex * aantalKolommen + rijIndex];

	}
	
	/**
	 * @creates | result
	 * @post | result != null
	 * @post | result.length == getAantalRijen() * getAantalKolommen()
	 * @post | IntStream.range(0, getAantalRijen()).allMatch(rijIndex ->
	 * 	     | 	 IntStream.range(0, getAantalKolommen()).allMatch(kolomIndex ->
	 * 		 |		result[rijIndex * getAantalKolommen() + kolomIndex] == getElementen()[rijIndex][kolomIndex]
	 * 		 |	 )
	 * 		 | )
	 */
	public double[] getElementenRowMajor() {
		double[] result = new double[elementenColumnMajor.length];
		for (int i = 0; i < aantalRijen; i++) {
			for (int j = 0; j < aantalKolommen; j++) {
				result[(i * aantalKolommen) + j] = elementenColumnMajor[(j * aantalRijen) + i];
			}
		}
		return result;
	}
	
	/**
	 * @creates | result
	 * @post | result != null
	 * @post | result.length == getAantalRijen() * getAantalKolommen()
	 * @post | IntStream.range(0, getAantalRijen()).allMatch(rijIndex ->
	 * 	     | 	 IntStream.range(0, getAantalKolommen()).allMatch(kolomIndex ->
	 * 		 |		result[kolomIndex * getAantalRijen() + rijIndex] == getElementen()[rijIndex][kolomIndex]
	 * 		 |	 )
	 * 		 | )
	 */
	public double[] getElementenColumnMajor() {
		return elementenColumnMajor.clone();
	}
	
	
	/**
	 * @creates De array alsook haar elementen zijn nieuw gecreeerd tijdens deze oproep van getElementen().
	 *  | result, ...result
	 * @post | result != null
	 * @post | Arrays.stream(result).allMatch(rij -> rij != null && rij.length == getAantalKolommen())
	 */
	public double[][] getElementen() {
		double[][] result = new double[aantalRijen][];
		for (int i = 0; i < aantalRijen; i++) {
			double[] rij = new double[aantalKolommen];
			result[i] = rij;
			for (int j = 0; j < aantalKolommen; j++) {
				rij[j] = elementenColumnMajor[j * aantalRijen + i];
			}
		}
		return result;
	}
	
	/**
	 * @pre | 0 <= aantalRijen
	 * @pre | 0 <= aantalKolommen
	 * @pre | elementenRowMajor != null
	 * @pre | elementenRowMajor.length == aantalRijen * aantalKolommen
	 * 
	 * @inspects
	 * 
	 * @post | getAantalRijen() == aantalRijen
	 * @post | getAantalKolommen() == aantalKolommen
	 * @post | Arrays.equals(getElementenRowMajor(), elementenRowMajor)
	 * 
	 */
	public Matrix(int aantalRijen, int aantalKolommen, double[] elementenRowMajor) {
		this.aantalRijen = aantalRijen;
		this.aantalKolommen = aantalKolommen;

		this.elementenColumnMajor  = new double[elementenRowMajor.length];
		for (int i = 0; i < aantalRijen; i++) {
			for (int j = 0; j < aantalKolommen; j++) {
				elementenColumnMajor[(j * aantalRijen) + i] = elementenRowMajor[(i * aantalKolommen) + j];
			}
		}
	}
	
	
}
