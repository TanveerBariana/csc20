//lab09
//tanveer bariana
//section 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab9 implements ActionListener  {
	static JButton [] digitButton= new JButton[10];//declare everything!!!!!
	static JButton  addButton, subButton,multiButton, divButton, eqButton; //declare everything!!!!!
	static double opnd1, opnd2, res;//declare everything!!!!!
	static char operator;//declare everything!!!!!
	static boolean newNumber= true;//declare everything!!!!!
	static JTextField text = new JTextField("0",28);//make text field global
	static void addDigit(int i){
		if(newNumber){
			text.setText("" + i);
			newNumber= false;
		} else {
			text.setText(text.getText()+i);
		}
	}
	public void actionPerformed(ActionEvent e) { 
	
		for (int i=0; i<=9; ++i) { 
			 if (e.getSource() == digitButton[i]) { 
			 addDigit(i); return; 
			 } 
		} 
		if (e.getSource() == addButton){ 
			opnd1 = Double.parseDouble(text.getText()); 
			 newNumber = true; 
			 operator = '+'; return; 
		} 
		if (e.getSource() == subButton){ 
			opnd1 = Double.parseDouble(text.getText()); 
			 newNumber = true; 
			 operator = '-'; return; 
		}
		if (e.getSource() == multiButton){ 
			opnd1 = Double.parseDouble(text.getText()); 
			 newNumber = true; 
			 operator = '*'; return; 
		}if (e.getSource() == divButton){ 
		
			opnd1 = Double.parseDouble(text.getText()); 
			 newNumber = true; 
			 operator = '/'; return; 
		}
		if (e.getSource() == eqButton) { 
			 opnd2 = Double.parseDouble(text.getText()); 
			 switch (operator) { 
				 case '/': res = opnd1 / opnd2; break; 
				 case '*': res = opnd1 * opnd2; break; 
				 case '-': res = opnd1 - opnd2; break; 
				 case '+': res = opnd1 + opnd2; break; 
			 } 
		 display(""+res); 
		 newNumber = true; 
		 return; 
		 } 
	} 
	 
	static void display (String s){
		text.setText(s);;
	}
	public static void main(String[] args) {
		ActionListener AL = new Lab9();
		JFrame frm = new JFrame("Instructor's Calculator");
		
		text.setHorizontalAlignment(JTextField.RIGHT);
		JLabel name = new JLabel("CSc 20 Lab 08");
		frm.setLayout(new FlowLayout());
        frm.add(name);
		frm.add(text);
		
		JPanel fnc = new JPanel();
		fnc.setLayout(new GridLayout(1, 3));
		fnc.add(new JButton("Back Space "));
		fnc.add(new JButton("CE"));
		fnc.add(new JButton("E"));
		frm.add(fnc);
		
		JPanel pannelnum = new JPanel();
		pannelnum.setLayout(new GridLayout(4, 5));
		pannelnum.add(digitButton[7]= new JButton("7"));	
		pannelnum.add(digitButton[8]= new JButton("8")); 
		pannelnum.add(digitButton[9]= new JButton("9"));
		pannelnum.add(divButton=new JButton("/"));
		pannelnum.add(new JButton(" sqrt "));
		pannelnum.add(digitButton[4]= new JButton("4"));
		pannelnum.add(digitButton[5]= new JButton("5"));
		pannelnum.add(digitButton[6]= new JButton("6"));
		pannelnum.add(multiButton=new JButton("*"));
		pannelnum.add(new JButton("%"));
		pannelnum.add(digitButton[1]= new JButton("1"));
		pannelnum.add(digitButton[2]= new JButton("2"));
		pannelnum.add(digitButton[3]= new JButton("3"));
		pannelnum.add(subButton=new JButton("-"));
		pannelnum.add(new JButton("1/x"));
		pannelnum.add(digitButton[0]= new JButton("0"));
		pannelnum.add(new JButton("+/-"));
		pannelnum.add(new JButton("."));
		pannelnum.add(addButton=new JButton("+"));
		pannelnum.add(eqButton=new JButton("="));
		for (int i=0; i<=9; ++i) { 
			 digitButton[i].addActionListener(AL); 
		}
		addButton.addActionListener(AL);
		subButton.addActionListener(AL);
		multiButton.addActionListener(AL);
		divButton.addActionListener(AL);
		eqButton.addActionListener(AL);	
		frm.add(pannelnum);
		frm.pack();
		frm.setSize(330,220);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
}
