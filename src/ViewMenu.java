import java.util.Scanner;

public class ViewMenu extends data {
	
	public void View(int B) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		int Menunum1;
		do {
		System.out.println("|----|-----------------|---------------|");
		System.out.println("|No  |Type             |Name           |");
		System.out.println("|----|-----------------|---------------|");
		for (i = 1; i <= B; i++) {
		System.out.println("|"+ i + "   |" + Type[i] + "|" + Name[i] + "|");
		System.out.println("|----|-----------------|---------------|");
		}
		System.out.println("|----|-----------------|---------------|");
		System.out.print("Pick a vechile number to test drive[enter 0 to exit] : ");
		Menunum1 = sc.nextInt();
		} while (Menunum1 != 0);
}

}
