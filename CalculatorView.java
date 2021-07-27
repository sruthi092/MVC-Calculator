package MVCsamp;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	private JTextField firstNumber2  = new JTextField(10);
	private JLabel subtractionLabel = new JLabel("-");
	private JTextField secondNumber2 = new JTextField(10);
	private JButton calculateButton2 = new JButton("Calculate");
	private JTextField calcSolution2 = new JTextField(10);
	
	private JTextField firstNumber3  = new JTextField(10);
	private JLabel multiplicationLabel = new JLabel("*");
	private JTextField secondNumber3 = new JTextField(10);
	private JButton calculateButton3 = new JButton("Calculate");
	private JTextField calcSolution3 = new JTextField(10);
	
	private JTextField firstNumber4  = new JTextField(10);
	private JLabel divideLabel = new JLabel("/");
	private JTextField secondNumber4 = new JTextField(10);
	private JButton calculateButton4 = new JButton("Calculate");
	private JTextField calcSolution4 = new JTextField(10);
	
	

	CalculatorView(){

		// Sets up the view and adds the components

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 200);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		calcPanel.add(firstNumber2);
		calcPanel.add(subtractionLabel);
		calcPanel.add(secondNumber2);
		calcPanel.add(calculateButton2);
		calcPanel.add(calcSolution2);
		
		calcPanel.add(firstNumber3);
		calcPanel.add(multiplicationLabel);
		calcPanel.add(secondNumber3);
		calcPanel.add(calculateButton3);
		calcPanel.add(calcSolution3);
		
		calcPanel.add(firstNumber4);
		calcPanel.add(divideLabel);
		calcPanel.add(secondNumber4);
		calcPanel.add(calculateButton4);
		calcPanel.add(calcSolution4);
		
		this.add(calcPanel);


		// End of setting up the components --------

	}

	public int getFirstNumber(){

		return Integer.parseInt(firstNumber.getText());

	}

	public int getSecondNumber(){

		return Integer.parseInt(secondNumber.getText());

	}

	public int getCalcSolution(){

		return Integer.parseInt(calcSolution.getText());

	}

	public void setCalcSolution(int solution){

		calcSolution.setText(Integer.toString(solution));

	}

	public int getFirstNumber2(){
		

		return Integer.parseInt(firstNumber2.getText());

	}

	public int getSecondNumber2(){

		return Integer.parseInt(secondNumber2.getText());

	}

	public int getCalcSolution2(){

		return Integer.parseInt(calcSolution2.getText());

	}

	public void setCalcSolution2(int solution){

		calcSolution2.setText(Integer.toString(solution));

	}
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	public int getFirstNumber3(){
		

		return Integer.parseInt(firstNumber3.getText());

	}

	public int getSecondNumber3(){

		return Integer.parseInt(secondNumber3.getText());

	}

	public int getCalcSolution3(){

		return Integer.parseInt(calcSolution3.getText());

	}

	public void setCalcSolution3(int solution){

		calcSolution3.setText(Integer.toString(solution));

	}

	public int getFirstNumber4(){
		

		return Integer.parseInt(firstNumber4.getText());

	}

	public int getSecondNumber4(){

		return Integer.parseInt(secondNumber4.getText());

	}

	public int getCalcSolution4(){

		return Integer.parseInt(calcSolution4.getText());

	}

	public void setCalcSolution4(int solution){

		calcSolution4.setText(Integer.toString(solution));

	}
	void addCalculateListener(ActionListener listenForCalcButton){

		calculateButton.addActionListener(listenForCalcButton);

	}

	void subCalculateListener(ActionListener listenForCalcButton){

		calculateButton2.addActionListener(listenForCalcButton);

	}
	
	void mulCalculateListener(ActionListener listenForCalcButton){

		calculateButton3.addActionListener(listenForCalcButton);

	}

	void divideCalculateListener(ActionListener listenForCalcButton){

		calculateButton4.addActionListener(listenForCalcButton);

	}
	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}