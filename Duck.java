class Duck{
	int pounds = 6;
	float flotability = 2.1f;
	String name = "Universal";
	long[] feathers = {1, 2, 3, 4, 5, 6, 7};
	boolean canFly = true;
	int maxSpeed = 25;

	public Duck(){
		System.out.println("Duck type 1");
	}
	public Duck(boolean fly){
		canFly = fly;
		System.out.println("Duck type 2");
	}
	public Duck(String n, long[] f){
		name = n;
		feathers = f;
		System.out.println("Duck type 3");
	}
	public Duck(int w, float f){
		pounds = w;
		flotability = f;
		System.out.println("Duck type 4");
	}
	public Duck(float density, int max){
		flotability = density;
		maxSpeed = max;
		System.out.println("Duck type 5");
	}
}