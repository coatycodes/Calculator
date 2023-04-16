import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 
	    Double result;


	   String operator = JOptionPane.showInputDialog("Choose an operator: +, -, *, or /");
	   String n1 = JOptionPane.showInputDialog("Enter first number");
	   String n2 = JOptionPane.showInputDialog("Enter second number");
	   
	   char c = operator.charAt(0);
	   double number1 = Double.parseDouble(n1);
	   double number2 = Double.parseDouble(n2);
	   
	    
	    switch (c) {

	      case '+':
	        result = number1 + number2;
	        JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        JOptionPane.showMessageDialog(null, number1 + " * " + number2 + " = " + result);
	        break;

	      case '/':
	        result = number1 / number2;
	        JOptionPane.showMessageDialog(null, number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	    	 JOptionPane.showMessageDialog(null, "Invalid operator!");
	        break;
	    }
		

		
	
		
		
		
		
	
		
	}

}
