/**name:janice
id:U10216045
design a bmi and let player input
*/
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class Testbmi extends JFrame{
//creat jtextfield,jlabel,jbutton
	    JTextField height;
		JTextField weight;
		private JLabel BMI;
		private JButton calculate;


		public static void main(String[] args)	{
			Testbmi frame = new Testbmi();
		//creat bmi frame and detail it	
			frame.addContainerListener(null);		
			frame.setSize(450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		}
		

	public Testbmi(){
//bmi body
	calculate = new JButton("go");	
	setLayout(new FlowLayout(FlowLayout.LEFT,35,40));
//let player input number		
	add(new JLabel("Your name"));
	add(new JTextField(8));
	add(new JLabel("Your age"));
	add(new JTextField(3));
	add(new JLabel("your weight and height"));
	weight = new JTextField(3);	
	height = new JTextField(3);	
	calculate.addActionListener(new Button_ActionListener());

	BMI = new JLabel();

	setTitle("your BMI.");

	Container contentPane = getContentPane();
//add things to frame
	contentPane.add(height);

	contentPane.add(weight);

	contentPane.add(BMI);

	contentPane.add(calculate);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
 class Button_ActionListener implements ActionListener {
	 public void actionPerformed(ActionEvent e) {
//button event
		String bmi = calBMI(Double.parseDouble(height.getText()), 
Double.parseDouble(weight.getText()));
//output the result
		BMI.setText("<html><font size = 5 color = #0233ff><b>" 
+ bmi + "</b></font></html>");

	} // actionPerformed

public String calBMI(double height, double weight) {
//calculate bmi
			double bmi = weight / ((height/100)*(height/100));

			if(bmi < 19)

				return "Underweight";

			else if(bmi >= 19 && bmi < 24.9)

				return "Normal";

			else if(bmi >= 24.9 && bmi < 29.9)

				return "Overweight";

			else

				return "Obese";

		} // BMI
	
 }
		 }
