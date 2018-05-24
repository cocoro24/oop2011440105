/*
2018-1학기-객체지향프로그래밍
2011440105 이다교 계산기 과제

계산기 기본 설명!! 꼭 읽어주세요!!

현재까지 구현된것 : +,-,*,/,음수계산,clear
현재까지 구현 안된 것 : 괄호, 퍼센트, +/-, 소수점 계산, 키보드 입력

계산한 결과값은 붉은색으로 나타납니다. 다시 버튼을 누르면 숫자가 검정색으로!

이 코드 작성자는 무단배포 및 도용을 싫어합니다
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

   
class GUIBuilder extends JFrame {
	
	public static boolean doCalc = false;  //계산했어?
	public static boolean isFirst = true;  //첫번째 operand야?
	public static int operand0 = 0;		  //첫번째 operand
	public static int operand1 = 0;		  //두번째 operand
	public static int result = 0;		  //결과값
	public static int operator = 0;		  //operator
	public static boolean isClear = false;
	
	int calculate(int operand0, int operand1, int operator) {
		switch(operator) {
			case 0: {	//더하기
				return operand0 + operand1;
			}
			case 1: {	//빼기
				return operand0 - operand1;
			}
			case 2: {	//곱하기
				return operand0 * operand1;
			}
			case 3: {	//나누기
				return operand0 / operand1;
			}
			default: {	//default
				return operand0;
			}
		}
	}
	
	 public GUIBuilder() {
	   super("Dakyo's Calculator");
	   
	   setBounds(600 , 200 , 300 , 400);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   Container contentPane = this.getContentPane();
//	   JFrame frame = new JFrame();
	   
	   //----------------생성부-----------------//
	   JButton button[] = new JButton[10];	
	   
	   for(int i=0; i<10; i++) {	//버튼에 숫자넣어
		   button[i] = new JButton(""+i);
		   button[i].setFont(new Font("Dialog",Font.PLAIN,15));

	   }
	   
	   JButton buttonPlus = new JButton("+");
	   buttonPlus.setForeground(Color.blue);
	   buttonPlus.setFont(new Font("Dialog",Font.PLAIN,15));
	   
	   JButton buttonMinus = new JButton("-");
	   buttonMinus.setForeground(Color.blue);
	   buttonMinus.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonMultiply = new JButton("X");
	   buttonMultiply.setForeground(Color.blue);
	   buttonMultiply.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonDivide = new JButton("/");
	   buttonDivide.setForeground(Color.blue);
	   buttonDivide.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonEqual = new JButton("=");
	   buttonEqual.setForeground(Color.blue);
	   buttonEqual.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonClear = new JButton("C");
	   buttonClear.setForeground(Color.blue);
	   buttonClear.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonBrace = new JButton("()");
	   buttonBrace.setForeground(Color.blue);
	   buttonBrace.setBorder(null);	//기능구현 안한건 두께0처리
	   buttonBrace.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonPercent = new JButton("%");
	   buttonPercent.setForeground(Color.blue);
	   buttonPercent.setBorder(null);	//기능구현 안한건 두께0처리
	   buttonPercent.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonPlusMinus = new JButton("+/-");
//	   buttonPlusMinus.setForeground(Color.blue);
	   buttonPlusMinus.setBorder(null);	//기능구현 안한건 두께0처리
	   buttonPlusMinus.setFont(new Font("Dialog",Font.PLAIN,15));

	   JButton buttonDot = new JButton(".");
	   buttonDot.setBorder(null);	//기능구현 안한건 두께0처리
//	   buttonDot.setForeground(Color.blue);
	   buttonDot.setFont(new Font("Dialog",Font.PLAIN,15));

	   final JTextField text = new JTextField(15);
	   text.setFont(new Font("Dialog",Font.PLAIN,15));

	   //---------------패널부-------------------//
	   JPanel pane1 = new JPanel();	//+/-,0,.,=
	   pane1.setLayout(new GridLayout(1,4));
	   pane1.add(buttonPlusMinus);
	   pane1.add(button[0]);
	   pane1.add(buttonDot);
	   pane1.add(buttonEqual);

	   JPanel pane2 = new JPanel(); //1,2,3,+
	   pane2.setLayout(new GridLayout(1,4));

	   pane2.add(button[1]);
	   pane2.add(button[2]);
	   pane2.add(button[3]);
	   pane2.add(buttonPlus);
	   
	   JPanel pane3 = new JPanel();	//4,5,6,-
	   pane3.setLayout(new GridLayout(1,4));

	   pane3.add(button[4]);
	   pane3.add(button[5]);
	   pane3.add(button[6]);
	   pane3.add(buttonMinus);

	   JPanel pane4 = new JPanel(); //7,8,9,X 
	   pane4.setLayout(new GridLayout(1,4));

	   pane4.add(button[7]);
	   pane4.add(button[8]);
	   pane4.add(button[9]);
	   pane4.add(buttonMultiply);

	   JPanel pane5 = new JPanel();	//C,(),%,/
	   pane5.setLayout(new GridLayout(1,4));
	   pane5.add(buttonClear);
	   pane5.add(buttonBrace);
	   pane5.add(buttonPercent);
	   pane5.add(buttonDivide);

	   JPanel pane6 = new JPanel(); //label
	   pane6.setLayout(new GridLayout(1,4));

	   pane6.add(text);
	 
	   
      //---------------------각버튼당 엑션리스너------------------------------//
	   for(int i=0; i<10; i++) {
		   button[i].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource(); // inner class 내에서 자기자신(button)을 접근하기 위함
				String equation = text.getText();
				if(isFirst) { // operation 이후에 첫 숫자를 치는 경우 text field를 clear
					equation = "";
					isFirst = false;
					isClear = true;
				}
				equation += button.getText().trim();	//trim -> 문자열 양끝의 공백 제거
				text.setText(equation);
				text.setForeground(Color.black);

			}
		});
	   }
	   buttonClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource();
				String equation = text.getText();
				if(isClear) {
					doCalc = false;  
					isFirst = true;  
					operand0 = 0;
					operand1 = 0;
					result = 0;
					operator = 0;
					text.setText("");	//텍스트 ㅃㅃ2
				}
				isFirst = false;
				
			}
		});
	   
	   buttonPlus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton button = (JButton) e.getSource();
			String equation = text.getText();
			if(!doCalc) {
				operand0 = Integer.parseInt(equation);
//				System.out.println(operand0);
				operator = 0; // +
			} else {
				operand1 = Integer.parseInt(equation);
				doCalc = true;
				result = calculate(operand0, operand1, operator);
				operand0 = result; // 결과값은 다음 operation의 첫번째 operand로 정해줌
				equation = Integer.toString(result);
				operator = 0;
			}
//			equation += button.getText().trim();
			isFirst = true;
			text.setText(equation);
		}
	});
	   
	   buttonMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource();
				String equation = text.getText();
				if(!doCalc) {
					operand0 = Integer.parseInt(equation);
//					System.out.println(operand0);
					operator = 1;
				} else {
					operand1 = Integer.parseInt(equation);
					doCalc = true;
					result = calculate(operand0, operand1, operator);
					isFirst = true;
					operand0 = result;
					equation = Integer.toString(result);
					operator = 1;
				}
//				equation += button.getText().trim();
				isFirst = true;
				text.setText(equation);
			}
		});
		   
	   buttonMultiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource();
				String equation = text.getText();
				if(!doCalc) {
					operand0 = Integer.parseInt(equation);
//					System.out.println(operand0);
					operator = 2;
				} else {
					operand1 = Integer.parseInt(equation);
					doCalc = true;
					result = calculate(operand0, operand1, operator);
					isFirst = true;
					operand0 = result;
					equation = Integer.toString(result);
					operator = 2;
				}
//				equation += button.getText().trim();
				isFirst = true;
				text.setText(equation);
			}
		});
		   
	   buttonDivide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource();
				String equation = text.getText();
				if(!doCalc) {
					operand0 = Integer.parseInt(equation);
//					System.out.println(operand0);
					operator = 3;
				} else {
					operand1 = Integer.parseInt(equation);
					doCalc = true;
					result = calculate(operand0, operand1, operator);
					isFirst = true;
					operand0 = result;
					equation = Integer.toString(result);
					operator = 3;
				}
//				equation += button.getText().trim();
				isFirst = true;
				text.setText(equation);
			}
		});
	   
	   buttonEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String equation = text.getText();
				operand1 = Integer.parseInt(equation);
				doCalc = true;
				result = calculate(operand0, operand1, operator);
				isFirst = true;
				operand0 = result;
				operator = 100;
				equation = Integer.toString(result);

				isFirst = true;
				text.setText(equation);
				text.setForeground(Color.red);

			}
		});
	   
//	    JPanel memWindows = new JPanel();
//	    memWindows.setLayout(new GridLayout(1, 6));
//	    memWindows.add(pane6);
//	    memWindows.add(pane5);
//	    memWindows.add(pane4);
//	    memWindows.add(pane3);
//
//	   //---------------------패널을 컨테이너에------------------------//
	   getContentPane().setLayout(new GridLayout(6, 1));
	   getContentPane().add(pane6);
	   getContentPane().add(pane5);
	   getContentPane().add(pane4);
	   getContentPane().add(pane3);
	   getContentPane().add(pane2);
	   getContentPane().add(pane1);

	   setVisible(true);
	  }

}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIBuilder();
	}

}
