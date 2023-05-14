public class TrianguloII implements IProgram {

	public String getName() {
		return "Triângulo II";
	}

	public void run() {
		int maxPerLine = 10;

		for (int line = 1; line <= 10; line++) {
			for (int column = 1; column <= maxPerLine; column++) {
				System.out.print('#');
			}

			System.out.println();

			if (maxPerLine >= 1) {
				maxPerLine--;
			}
		}
	}
}
