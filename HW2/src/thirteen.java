import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
	//	month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	//	(switch�� ���) 
	//	1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
        int month = 0;
        int day = 0;
        int mday = 0;
        int difday = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("month�� �Է��ϼ��� :");
        month = scan.nextInt();
        
        switch (month) {
            case 1:  mday = 31;
            		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
            		 day = scan.nextInt();
            		 if(day<0 || day>31) {
            			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
            		 }else {
            			 difday = day;
            		 }
                     break;
            case 2:  mday = 28;
			   		 System.out.println("day�� 1~28 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>28) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31;
			   		 }
                     break;
            case 3:  mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28;
			   		 }
                     break;
            case 4:  mday = 30;
			   		 System.out.println("day�� 1~30 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>30) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31;
			   		 }
			            
                     break;
            case 5:  mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31+30;
			   		 }
                     break;
            case 6:  mday = 30;
	   		 System.out.println("day�� 1~30 ���̷� �Է��ϼ��� :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
	   		 }else {
	   			 difday = day+31+28+31+30+31;
	   		 }
                     break;
            case 7:  mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30;
			   		 }
	                     break;
            case 8:  mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31;
			   		 }
                     break;
            case 9:  mday = 30;
	   		 System.out.println("day�� 1~30 ���̷� �Է��ϼ��� :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
	   		 }else {
	   			 difday = day+31+28+31+30+31+30+31+31;
	   		 }
                     break;
	            case 10: mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31+31+30;
			   		 }
                     break;
            case 11: mday = 30;
	   		 System.out.println("day�� 1~30 ���̷� �Է��ϼ��� :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
	   		 }else {
	   			 difday = day+31+28+31+30+31+30+31+31+30+31;
	   		 }
                     break;
            case 12: mday = 31;
			   		 System.out.println("day�� 1~31 ���̷� �Է��ϼ��� :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷� ����.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31+31+30+31+30;
			   		 }
                     break;
            default: mday = 31;
                     break;
        }
        System.out.println("1�� 1�ϰ��� ��¥ ���� " + difday +"�� �Դϴ�.");
    }
}
