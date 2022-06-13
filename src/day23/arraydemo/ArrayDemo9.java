package day23.arraydemo;

public class ArrayDemo9 {

	public static void main(String[] args) {
		int [][] jarr = new int [3][];
		
		jarr[0]= new int[1];
		jarr[0][0]=10;
		
		jarr[1]= new int[2];
		jarr[1][0]=10;
		jarr[1][1]=20;
		
		jarr[2]= new int[3];
		jarr[2][0]=67;
		jarr[2][1]=21;
		jarr[2][2]=23;
		
		for (int i = 0; i<jarr.length; i++) {
			 for (int j=0; j<jarr[i].length; j++) {
				 System.out.print(jarr[i][j] + " ");
			 }
			 System.out.println();

		

	}

}
}
