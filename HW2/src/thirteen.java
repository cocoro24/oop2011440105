import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
	//	month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. 
	//	(switch문 사용) 
	//	1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
        int month = 0;
        int day = 0;
        int mday = 0;
        int difday = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("month를 입력하세요 :");
        month = scan.nextInt();
        
        switch (month) {
            case 1:  mday = 31;
            		 System.out.println("day를 1~31 사이로 입력하세요 :");
            		 day = scan.nextInt();
            		 if(day<0 || day>31) {
            			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
            		 }else {
            			 difday = day;
            		 }
                     break;
            case 2:  mday = 28;
			   		 System.out.println("day를 1~28 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>28) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31;
			   		 }
                     break;
            case 3:  mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28;
			   		 }
                     break;
            case 4:  mday = 30;
			   		 System.out.println("day를 1~30 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>30) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31;
			   		 }
			            
                     break;
            case 5:  mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31+30;
			   		 }
                     break;
            case 6:  mday = 30;
	   		 System.out.println("day를 1~30 사이로 입력하세요 :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
	   		 }else {
	   			 difday = day+31+28+31+30+31;
	   		 }
                     break;
            case 7:  mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30;
			   		 }
	                     break;
            case 8:  mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31;
			   		 }
                     break;
            case 9:  mday = 30;
	   		 System.out.println("day를 1~30 사이로 입력하세요 :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
	   		 }else {
	   			 difday = day+31+28+31+30+31+30+31+31;
	   		 }
                     break;
	            case 10: mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31+31+30;
			   		 }
                     break;
            case 11: mday = 30;
	   		 System.out.println("day를 1~30 사이로 입력하세요 :");
	   		 day = scan.nextInt();
	   		 if(day<0 || day>30) {
	   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
	   		 }else {
	   			 difday = day+31+28+31+30+31+30+31+31+30+31;
	   		 }
                     break;
            case 12: mday = 31;
			   		 System.out.println("day를 1~31 사이로 입력하세요 :");
			   		 day = scan.nextInt();
			   		 if(day<0 || day>31) {
			   			 System.out.println("잘못입력하셨습니다. 프로그램 종료.");
			   		 }else {
			   			 difday = day+31+28+31+30+31+30+31+31+30+31+30;
			   		 }
                     break;
            default: mday = 31;
                     break;
        }
        System.out.println("1월 1일과의 날짜 차는 " + difday +"일 입니다.");
    }
}
