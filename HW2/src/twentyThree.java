
public class twentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	23.
	// 	***** *
	//	*** ***
	//	* *****

	//	�� ����Ͻÿ�(�ݺ��� �Ἥ!)
		

		//1~7 �����, 1������ ������ 6��°�� ����, 2������������ 4��°�� ����, 3������������ 2��°�� ����.
		//
		for(int k = 1; k <=3; k++) {

			for(int i = 1; i<=7; i++) {
				if(i+2*k==8) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}