package matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void test() {
		double[] elementenRowMajor = {10, 20, 30, 40, 50, 60};
		Matrix myMatrix = new Matrix(2, 3, elementenRowMajor);
		assertEquals(2, myMatrix.getAantalRijen());
		assertEquals(3, myMatrix.getAantalKolommen());
		assertArrayEquals(new double[] {10, 20, 30, 40, 50, 60}, myMatrix.getElementenRowMajor());
		assertArrayEquals(new double[] {10, 40, 20, 50, 30, 60}, myMatrix.getElementenColumnMajor());

		assertArrayEquals(new double[][] {{10, 20, 30}, {40, 50, 60}}, myMatrix.getElementen());
	}

}
