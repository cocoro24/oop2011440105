
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10 ������ ȭ�鿡 ���
		int i;	//i�� ��������
		i = 1;  //�������� �ʱ�ȭ

		while(i<=10) { //���� ���ǽ�
			
			System.out.print(i); //������
			i++; //�������� ��ȭ
		}
		System.out.println("");

		System.out.println("=====================���α׷� ����=====================");

	//1~10���� ���ϱ�
		
	 int k, sum = 0;
	 k = 1;
	 
	 while(k<=10) {
		 sum = sum+k;
		 System.out.println("���� k���� "+k+" sum�� ���� " +sum);
		 k++;
	 }
		System.out.println("=====================���α׷� ����=====================");

	 // 1~10���� ���ϱ� for�� ���
		int sum2 = 0;
		for(int j=1; j<=10; j++) {
			 sum2 = sum2+j;
			 System.out.println("���� j���� "+j+" sum2�� ���� " +sum2);
		}
		System.out.println("=====================���α׷� ����=====================");

		
		String s = "no news is good news";
		int n_count = 0;
		
		for(int nn = 0; nn < s.length(); nn++) {
			//n�� ������ ȸ���� ����.
			
			if(s.charAt(nn) != 'n')
				continue;
			
			//n�� ������ �ϳ� �����Ѵ�.
			n_count++;
			
		}
		System.out.println("���忡�� �߰ߵ� n�� ���� " + n_count);
	}

}
