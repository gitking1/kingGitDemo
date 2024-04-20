package corejava;

public class InterviewMaxNoMinColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print minimum number from below matrix
/*	2		4		5
 *  3		0		7
 *  1		10		11
 */
		int abc[][] = {{2,4,5},{3,0,7},{1,10,11}};
		int min = abc[0][0];
		int minColumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if((abc[i][j])<min) {
					min = abc[i][j];
					minColumn = j;
				}
			}
		}
		System.out.println(min);
		System.out.println(minColumn);
		System.out.println("*******************");
		int k = 0;
		int max = abc[0][minColumn];
		while(k<3) {
			if(abc[k][minColumn]>max) {
				max = abc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
