package day23.arraydemo;

public class ArrayDemo7 {

	public static void main(String[] args) {
		final int ROWS =3;
		final int COLUMNS=3;
		 String [][] nameList = {{" ram "," shyam "}, {" Hari "," Gopal "}, {" Sita ", " Rita "} };
		 for (int i = 0; i<nameList.length; i++) {
			 for (int j=0; j<nameList[i].length; j++) {
				 System.out.print(nameList[i][j] + " ");
			 }
			 System.out.println();
		 }
	}

}
