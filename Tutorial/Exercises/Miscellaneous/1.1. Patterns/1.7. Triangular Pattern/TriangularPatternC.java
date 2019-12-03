package exercises.tutorial.programmingWithJava;

public class TriangularPatternC {
	public static void main(String[] args) {
		for (int row=1;row<=8;row++) {
			for (int column=1;column<=8;column++) {
				if (row>column) {
					System.out.print(" "+" ");	//one for blank space;another for separating characters
				}
				else {
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
	}

}
