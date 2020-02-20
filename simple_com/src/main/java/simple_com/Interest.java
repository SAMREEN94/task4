package simple_com;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the amount:");
        double amount=scanner.nextDouble();
        System. out. println("Enter the No.of years:");
        double noOfYears=scanner.nextDouble();
        System. out. println("Enter the Rate of  interest");
        double interestRate=scanner.nextDouble();
        System.out.println("enter type of interest \n1)simple_interest\n2)compound_interest\n");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:simple_interest SI=new simple_interest(amount,noOfYears,interestRate);
        		System.out.println("Simple interest ="+SI.calculate());
        		
        		
        		break;
        case 2:Compound_interest CI=new Compound_interest(amount,noOfYears,interestRate);
				System.out.println("compound interest ="+CI.calculate1());
				break;
		default:System.out.println("enter valid interest type in range 1 or 2");
				break;
        }
	}

}
