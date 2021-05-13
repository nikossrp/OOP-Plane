
class PrivateCompartment extends PlaneComponent {
	String desc_private;
	PrivateCompartment()
	{
		desc_private = toString();
	}
	void process(Employee e)
	{
		e.workOn(this);
	}
	
	void ready_check()
	{
		if(Employee.flag == 1)
		{
			System.out.println(desc_private);
			System.out.println("PrivateCompartment OK!");
		}

	}
	
	public String toString()
	{
		return "/desc_private/" + super.toString();
	}
}
