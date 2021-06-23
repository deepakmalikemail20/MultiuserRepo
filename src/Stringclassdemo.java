
public class Stringclassdemo {

	public static void main(String[] args) {
		
	String a= "JavaTraining";
	
	String array[]=a.split("T");
	System.out.println(array[0]);
	System.out.println(array[1]);
	
	System.out.println(a.toUpperCase());
	
	//String : it is one of the prebuilt class in java
	/* 1.String literal
	2.by creating object of string*/

	System.out.println(a.charAt(2));
	System.out.println(a.indexOf("T"));
	System.out.println(a.substring(3, 6));
	System.out.println(a.substring(5));
	System.out.println(a.concat(" By Deepak"));
	System.out.println(a.length());
	System.out.println(a.hashCode());
	System.out.println(a.trim());
	
	System.out.println(a.replace("T", "s"));
	
	}

}
