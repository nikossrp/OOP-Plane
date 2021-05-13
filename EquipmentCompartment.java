
class EquipmentCompartment extends PrivateCompartment{
	String desc_equip;
	
	EquipmentCompartment()
	{
		desc_equip = toString();
	}
	void process(Employee e)
	{
		e.workOn(this);
	}
	
	void ready_check()
	{
		if(Employee.flag == 1){
		System.out.println(desc_equip);
		System.out.println("EquipmentCompartment OK!");
		}
	}
	
	public String toString()
	{
		return "/desc_equip/" + super.toString(); 
	}
}
