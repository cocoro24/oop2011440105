
public class twentyFive {

	public static void main(String[] args) {
	//	25.������ ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�.

	//	*********** 54321012345		(1) *��, (2) ���ڷ� ���
	//	********* 432101234
	//	******* 3210123
	//	***** 21012
	//	*** 101
	//	* 0
	//	*** 101 
	//	***** 21012 
	//	******* 3210123 
	//	********* 432101234 
	//	*********** 54321012345

		    for(int a = 5; a>=0; a--) {

		        for(int b=0 ; b < (a*2)+1;b++){

		            System.out.print("*");

		        }
		        System.out.print(" ");

	            System.out.println();

		    }

		    for(int a = 1; a<=5; a++) {

		        for(int b=0 ; b < (a*2)+1;b++){

		            System.out.print("*");
		            
		        }
		        System.out.print(" ");

	            System.out.println();

		    }
		
		    System.out.println("------------2�� ����");

		    
		    int column = 5;
		    int row = 5;
		    int j = 0;
		    
		    for(int a = 0; a<column; a++) {
			    
			    for(int b = column; b>=a; b--) {
		           
			    	System.out.print(b-a);
			    
			    }
  
			    for(int c = 1; c<=row; c++) {
			    	System.out.print(c);
			    }			   
		    	row = row -1;

			    System.out.println();  

		    }


		    for(int a = column; a>=0; a--) {
			    
			    for(int b = column; b>=a; b--) {
		           
			    	System.out.print(b-a);
			    
			    }
  
			    for(int c = 1; c<=j; c++) {
			    	System.out.print(c);
			    }			   
		    	j = j +1;

			    System.out.println();  

		    }


	}

	
}