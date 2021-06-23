
public class Firstclass {
	
	public void getData()
	{
		System.out.println("I am in first method");
	}
	
	int b=2;

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		Firstclass fn=new Firstclass();
		fn.getData();
		Secondclass sn=new Secondclass(); //create object for a class before using its methods and variables
		sn.setData();
		System.out.println(sn.a);//print variable from different class
		System.out.println(fn.b); //print variable from same class also you need to create object
	}

}
