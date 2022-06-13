package day23.arraydemo;

public class ArrayDemo8 {

	public static void main(String[] args) {
	double [][] d =  new double [][]{{1.2 , 2.3, 3.4}, {2.1, 2.2, 2.3}, {4.1, 4.2, 4.3} };
	for (int i = 0; i<d.length; i++) {
		 for (int j=0; j<d[i].length; j++) {
			 System.out.print(d[i][j] + " ");
		 }
		 System.out.println();

	}

}
}
