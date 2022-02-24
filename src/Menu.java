import java.util.Scanner;

public class Menu{

	public static void menu(int I) {
		// TODO Auto-generated constructor stub
		InputData Tes = new InputData();
		Tes.input(I);
	}
	
	public static void View(int A) {
		ViewMenu Tos = new ViewMenu();
		Tos.View(A);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MenuNum;
		int conterr = 1;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Menu: ");
		System.out.println("(1). Input");
		System.out.println("(2). View");
		System.out.println("(3). Exit");
		System.out.print("Input (1/2/3): ");
		MenuNum = sc.nextInt();
		if (MenuNum == 1 ) {
			System.out.println("Input Menu");
			Menu.menu(conterr);
			conterr = conterr + 1;
			} 
		else if (MenuNum == 2 ) {
			System.out.println("View Menu");
			Menu.View(conterr);
			}
		} while (MenuNum != 3 );
	}

}
