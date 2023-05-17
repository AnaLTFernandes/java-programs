public class TrianguloIV implements IProgram {

	public String getName() {
		return "Triângulo IV";
	}

	public void run() {
		int blankSpaces = 9;
		int symbol = 1;

		for (int line = 1; line <= 10; line++) {
			for (int column = 1; column <= blankSpaces; column++) {
				System.out.print(" ");
			}

			for (int column = 1; column <= symbol; column++) {
				System.out.print('#');
			}

			System.out.println();

			blankSpaces--;
			symbol++;
		}
	}
}
