public class TrianguloI implements IProgram {

	public String getName() {
		return "Triângulo I";
	}

	public void run() {
		for (int line = 1; line <= 10; line++) {
			for (int column = 1; column <= line; column++) {
				System.out.print('*');
			}

			System.out.println();
		}
	}
}
