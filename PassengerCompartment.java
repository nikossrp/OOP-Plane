
class PassengerCompartment extends PlaneComponent{
	String desc_passeng;
	//public static double x;
	PassengerCompartment n;
	
	PassengerCompartment()
	{
	//	x = Math.random()*(1-0);
		desc_passeng = toString();
	//	n = new PassengerCompartment();
	}
	void process(Employee e)
	{
		e.workOn(this);
	}
	void ready_check()
	{
	//	if(x == 1)
	//	n.ready_check();
		if(Employee.flag == 1){
		System.out.println(desc_passeng);
		System.out.println("PassengerCompartment OK!");
		}
	}
	
	 public String toString()
	{
		return "/desc_passeng/" + super.toString();
	}
}
