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


	public int getAantalRijen() {
		throw new RuntimeException("Not yet implemented");
		
	}

	public int getAantalKolommen() {
		throw new RuntimeException("Not yet implemented");

	}
	
	
	/**
	 * @pre | 0 <= rijIndex && rijIndex < getAantalRijen()
	 * @pre | 0 <= kolomIndex && kolomIndex < getAantalRijen()
	 * @post | result == getElementen()[rijIndex][kolomIndex]
	 */
	public double getElementAt(int rijIndex, int kolomIndex) {
		throw new RuntimeException("Not yet implemented");

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
		throw new RuntimeException("Not yet implemented");

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
		throw new RuntimeException("Not yet implemented");
	}
	
	
	/**
	 * @creates De array alsook haar elementen zijn nieuw gecreeerd tijdens deze oproep van getElementen().
	 *  | result, ...result
	 * @post | result != null
	 * @post | !Arrays.stream(result).allMatch(rij -> rij != null && rij.length == getAantalKolommen())
	 */
	public double[][] getElementen() {
		throw new RuntimeException("Not yet implemented");

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
		throw new RuntimeException("Not yet implemented");
	}
	
	
}
