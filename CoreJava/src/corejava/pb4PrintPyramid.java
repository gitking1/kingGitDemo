package corejava;

public class pb4PrintPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	3
 *  6		9
 *  12		15		18
 *  21		24		27		30
 */
		int k = 3;
		for(int i=0;i<4;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
	}

}
