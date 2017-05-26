import java.util.Scanner;

public class FridayProject_TaxCode {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String another_record = "Y";
		double total_amount_due = 0.0;
		
		while (another_record != "N"){
			System.out.print("Customer ID:");
			String customer_id = sc.next();
			System.out.print("Customer Name:");
			String customer_name = sc.next();
			sc.nextLine();
			System.out.print("Sales Amount:");
			double sales_amount = sc.nextDouble();
			System.out.print("Tax Code:");
			String tax_code = sc.next();
			sc.nextLine();
			double sales_tax; 
			
		 
			
			if (tax_code.equals("NRM")){
				sales_tax = (0.06)*sales_amount;
				total_amount_due = sales_tax + sales_amount;
			}else if(tax_code.equals("NPF")){
				sales_tax = 0;
				total_amount_due = sales_amount;		
			}else if (tax_code.equals("BIZ")){
				sales_tax = 0.045* sales_amount;
				total_amount_due = sales_tax + sales_amount;   
			}
		    System.out.println("\n\nCustomer ID: "+ customer_id);
			System.out.println("Customer Name: "+customer_name);
			System.out.println("Sales Amount: "+ sales_amount);
			System.out.println("Tax Code: "+ tax_code);
			System.out.println("Total Amount Due: "+ total_amount_due);
			
			System.out.println("Do you want another record? (Y/N)");
			another_record = sc.nextLine();
			
			if (another_record.equals("Y")){
			    continue;
			}else{
				break;
			}
		  }
			
	    }

    }
	
	
