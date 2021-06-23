import Corejava.Countrytraffic;
import Corejava.Globaltraffic;

public class Implementinginterfaces implements Globaltraffic, Countrytraffic {
	//multiple can be implemented by separating with a comma as above
	public static void main(String[] args) 
	{
		
		Implementinginterfaces it=new Implementinginterfaces();
		it.walkonsymbol();
		System.out.println(it.a);
		Globaltraffic gt=new Implementinginterfaces();
		gt.greenGo();
		gt.redStop();
		gt.FlashYellow();
		Countrytraffic ct=new Implementinginterfaces();
		ct.Trainsymbol();
		
	}

	String a = "Deepak - printing string variable from Indiantraffic class";
	public void walkonsymbol()
	{
	System.out.println("walking - Indian method");
	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("I am greenGo");
	}
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("I am redStop");
	}
	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("I am FlashYellow");
	}
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("I am in Trainsybmol method from countrytraffic interface");
	}
}
