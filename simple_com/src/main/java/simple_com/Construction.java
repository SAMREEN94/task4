package simple_com;
import java.util.Scanner;

public class Construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
    	System.out.println("enter total area");
    	double area=scanner.nextDouble();
        System.out.println("enter type of standard\n1)standard_material\n2)high_material\n3)material\n4)fullyautomated");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:standard_material SM=new standard_material(area);
        		System.out.println("Simple interest ="+SM.calculate());
        		
        		
        		break;
        case 2:high_material HSM=new high_material(area);
		System.out.println("Total cost ="+HSM.calculate());
		break;
        case 3:material ASM=new material(area);
		System.out.println("Total cost ="+ASM.calculate());
		break;
        case 4:fully_automated HSMF=new fully_automated(area);
		System.out.println("Total cost ="+HSMF.calculate());
				break;
		default:System.out.println("enter valid type in range 1 to 4");
				break;
        }
        		
	}

}
