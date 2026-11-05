package Polymorphism;

class Plan
{
	void fly()
	{
		System.out.println("Plan will flies");
	}

}
class cargoPlan extends Plan
{
	@Override
	void fly()
	{
		System.out.println("Cargo plan  flies at lower hiegth");
	}
	void carryCargoPlan()
	{
		System.out.println("CargoPlan carry goods");
	}
}
class passengerPlan extends Plan
{
	@Override
	void fly()
	{
		System.out.println("Passenger plan flies at medium hieght");
	}
	void carryPassengerPlan()
	{
		System.out.println("PassengerPlan carry pepole");
	}
}
class figtherPlan extends Plan
{
	@Override
	void fly()
	{
		System.out.println("Figther plan flies at any hieght");
	}
	void carryFigtherPlan()
	{
		System.out.println("FigtherPlan carry weapon");
	}
}
class Polymarphism
{
	void permit(Plan ref)
	{
		ref.fly();

	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlan c=new cargoPlan();
		((cargoPlan)(c)).carryCargoPlan();
		
		passengerPlan p=new passengerPlan();
		((passengerPlan)(p)).carryPassengerPlan();
		
		figtherPlan f=new figtherPlan();
		((figtherPlan)(f)).carryFigtherPlan();
		

		Polymarphism poly =new Polymarphism();


		poly.permit(c);
		poly.permit(p);
		poly.permit(f);

	

		// we achieved the polymarphism but we haven't achieved advantage of polymorephism

	}

}
