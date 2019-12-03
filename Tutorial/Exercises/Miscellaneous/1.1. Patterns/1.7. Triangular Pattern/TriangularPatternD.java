package exercises.tutorial.programmingWithJava;

public class TriangularPatternD {
	public static void main(String[] args) {
		for (int row=1;row<=8;row++) {
			for (int column=1;column<=8;column++) {
				if (column>=9-row) {
					System.out.print("# ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
