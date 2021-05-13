
class CargoBay extends PrivateCompartment{
	String desc_carg;
	EquipmentCompartment e;
	
	CargoBay()
	{
		e = new EquipmentCompartment();
		desc_carg = toString();
	}
	
	void process(Employee e)
	{
		e.workOn(this);
	}
	void ready_check()
	{
		if(Employee.flag == 1){
		e.ready_check();
		System.out.println(desc_carg);
		System.out.println("CargoBay OK!");}
	}
	
	public String toString()
	{
		return super.toString() + "/desc_carg/";
	}
}
