
public abstract class data {
	String[] Type = new String[11];
	String[] Brand = new String[11];
	String[] Name = new String[11];
	String[] License = new String[11];
	int[] TopSpeed = new int[11];
	int[] GasCap = new int[11];
	int[] Wheel = new int[11];
	String[] TypeCar = new String[11];
	int[] EntertaimentSystem = new int[11];
	int[] Helm = new int[11];

	public abstract void input();
	public abstract void View();
	
	void Car() {
		System.out.println(Turning On Entertaiment System...);
	}
	void SuperCar() {
		System.out.println(Boosting!);
	}
	void Motor(int X) {
		System.out.println(Name[X]+"is Standing!");
	}

}
