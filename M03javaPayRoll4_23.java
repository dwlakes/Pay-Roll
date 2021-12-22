//Author: David Lakes
//Date: 09/05/2021
/*Purpose: The user enters the name of the name of the employee, the number of hours worked,
 their hourly rate, and state and federal withholds. The program then outputs the users net withholdings
 and net pay */

package M03javaPayRoll4;

import java.util.Scanner;

public class M03javaPayRoll4_23 {

	public static void main(String[] args) {
		
		//User enters employee name
		Scanner employeeName = new Scanner (System.in);
		System.out.println("Enter employees name: ");
		String name = employeeName.next();
		
		//User enters the number of hours the employee worked
		Scanner hoursWorked = new Scanner (System.in);
		System.out.println("Enter number of hours worked in a week: ");
		double hours = hoursWorked.nextDouble();
		
		//The user enters the employee's hourly rate
		Scanner hourlyPayRate = new Scanner (System.in);
		System.out.println("Enter hourly pay rate: ");
		double payRate = hourlyPayRate.nextDouble();
		
		//User enters the federal withholding rate
		Scanner fedWithHold = new Scanner (System.in);
		System.out.println("Enter federal withholding rate as decimal: ");
		double fedTaxRate = fedWithHold.nextDouble();
		
		//User enters the state withholding rate. 
		Scanner stateWithHold = new Scanner (System.in);
		System.out.println("Enter state withholding rate as decimal: ");
		double stateTaxRate = stateWithHold.nextDouble();
		
		//Program calculates gross pay
		double grossPay = payRate*hours;
		//Program calculates federal withholdings
		double fedTax = fedTaxRate*grossPay;
		//Program calculates state withholdings
		double stateTax = stateTaxRate*grossPay;
		
		//Program outputs various employee information
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: " +hours);
		System.out.println("Pay Rate: " +payRate);
		System.out.println("Gross Pay: "+grossPay );
		System.out.println("Deductions:");
		System.out.println("	Federal Withholding ("+fedTaxRate*100+"%): $"+fedTax);
		System.out.println("	State Withholding ("+stateTaxRate*100+"%): $"+stateTax);
		System.out.println("	Total Deduction: $"+fedTax+stateTax);
		System.out.println("Net Pay: "+ (Math.round((grossPay-stateTax-fedTax)*100.0)/100.0));
		
	
	}

}
