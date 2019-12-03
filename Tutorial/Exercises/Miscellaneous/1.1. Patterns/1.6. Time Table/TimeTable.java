package exercises.tutorial.programmingWithJava;

public class TimeTable {
	public static void main(String[] args) {
		//Define variables for the pipe and star sign
		String pipe = "|";
		String star = "*";
		
		//Print the first row
		for (int row=1;row<=1;row++) {
			for (int column=1;column<=10;column++) {
				
				//size of each cell is %4d
				// - sign signifies elements are aligned from the left side
				if (column==1) {
					System.out.printf("%4s%4s",star,pipe);
				}
				System.out.printf("%4d",row*column);
			}
			System.out.println();
		}
		
		//Print the second row
		for (int row=1;row<=1;row++) {
			for (int column=1;column<=10;column++) {
				if (column==1) {
					System.out.print("   ");
				}
				if (column<=5) {
				    System.out.print("----");
				}
				else {
					System.out.print("-----");
				}
			}
			System.out.println();
		}
		
		//Print row number 3 to the last row
		for (int row=1;row<=10;row++) {
			for (int column=1;column<=10;column++) {
				if (column==1) {
					System.out.printf("%4d",row);
					System.out.printf("%4s",pipe);
				}
				System.out.printf("%4d",row*column);
			}
			System.out.println();
		}
	}

}
