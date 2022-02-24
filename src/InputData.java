import java.util.Scanner;

public class InputData extends data {

	public void input(int conter) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Type [Car | Motorcycle]: ");
		Type[conter] = sc.nextLine();
		
		System.out.print("Input brand [>=5]: ");
		Brand[conter] = sc.nextLine();
		
		System.out.print("Input Name [>=5]: ");
		Name[conter]= sc.nextLine();
		
		System.out.print("Input License: ");
		License[conter] = sc.nextLine();
		
		System.out.println("Input Top speed [100 <= topSpeed <= 250] : ");
		do {	
		TopSpeed[conter] = sc.nextInt();
		} while (TopSpeed >= 100 && TopSpeed <= 250);
		
		System.out.println("Input gas Capacity [30 <= gascap <= 60] : ");
		do {
		GasCap[conter] = sc.nextInt();
		}while (GasCap >= 30 && GasCap <= 60);
		System.out.println("Input Wheel [4 <= Wheel <= 6] : ");
		
		do {
		Wheel[conter] = sc.nextInt();
		} while (Wheel[conter] <= 3 && Wheel[conter] >= 7);
		
		sc.nextLine();
		
		System.out.println("Input Type [SUV | SuperCar | Minivan] : ");
		TypeCar[conter] = sc.nextLine();
		
		if (Type[conter].equals("Car")) {
			System.out.println("Entertaiment System Amount [ >= 1]: ");
			EntertaimentSystem[conter] = sc.nextInt();
		}
		else if (Type[conter].equals("Motorcycle")) {
			System.out.println("Helm Amount [ >= 1]: ");
			Helm[conter] = sc.nextInt();	
		}
		
		System.out.println("Brand: "+ Brand[conter]);
		System.out.println("Name: "+ Name[conter]);
		System.out.println("License Plate: "+ License[conter]);
		System.out.println("Type: "+ TypeCar[conter]);
		System.out.println("Gas Capacity: "+ GasCap[conter]);
		System.out.println("Wheel(s):"+ Wheel[conter]);
		if(Type[conter].equals("Car")) {
			System.out.println("Entertaiment System: "+ EntertaimentSystem[conter]);
			Car();
			if(Type[conter].equals("SuperCar")) {
				SuperCar();
			}
		}
		else if (Type[conter].equals("Motorcycle")) {
			Motor(conter);
		}
		
	}
}
