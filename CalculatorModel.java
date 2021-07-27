package MVCsamp;


//The Model performs all the calculations needed
//and that is it. It doesn't know the View 
//exists
public class CalculatorModel {

	// Holds the value of the sum of the numbers
	// entered in the view

	private int calculationaddValue,calculationsubValue,calculationmulValue,calculationdivideValue;

	public void addTwoNumbers(int firstNumber, int secondNumber){

		calculationaddValue = firstNumber + secondNumber;

	}

	public void subTwoNumbers(int firstNumber, int secondNumber){

		calculationsubValue = firstNumber - secondNumber;

	}
	
	public void mulTwoNumbers(int firstNumber, int secondNumber){

		calculationmulValue = firstNumber * secondNumber;

	}
	
	public void divideTwoNumbers(int firstNumber, int secondNumber){

		calculationdivideValue = firstNumber / secondNumber;

	}

	public int getCalculationaddValue(){

		return calculationaddValue;

	}

	public int getCalculationsubValue(){

		return calculationsubValue;

	}

	public int getCalculationmulValue(){

		return calculationmulValue;

	}

	public int getCalculationdivideValue(){

		return calculationdivideValue;

	}

}