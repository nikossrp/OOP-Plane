
class Plane extends Object{
	String desc_plane;
	String title;
	int capacity;
	CargoBay carg; //1 tetioi xwro
	EquipmentCompartment equip1; //3 tetioi xwroi
	EquipmentCompartment equip2;
	EquipmentCompartment equip3;
	PassengerCompartment passeng1; // analoga thn capacity (50-50)
	PassengerCompartment passeng2;
	
	Plane()
	{
		desc_plane = toString();
		title = "Golden";
		capacity = 100;
		carg = new CargoBay();
		equip1 = new EquipmentCompartment();
		equip2 = new EquipmentCompartment();
		equip3 = new EquipmentCompartment();
		passeng1 = new PassengerCompartment();
		passeng2 = new PassengerCompartment();
		
	}
	
	int get_capacity()
	{
		return capacity;
	}
	
	String get_euip1()
	{
		return equip1.desc_equip;
	}
	
	String get_equip2()
	{
		return equip2.desc_equip;
	}
	
	String get_equip3()
	{
		return equip3.desc_equip;
	}
	
	String get_passenger1()
	{
		return passeng1.desc_passeng;
	}
	
	String get_passenger2()
	{
		return passeng2.desc_passeng;
	}
	
	void process(Employee e)
	{
		carg.process(e);
		
		equip1.process(e);
		equip2.process(e);
		equip3.process(e);
		
		passeng1.process(e);
		passeng2.process(e);
		
	}
	
	void report()
	{
		if(Employee.flag == 1){ //an to flag einai 1 oi ergazomenoi doulepsan
		carg.ready_check();
		equip1.ready_check();
		equip2.ready_check();
		equip3.ready_check();
		passeng1.ready_check();
		passeng2.ready_check();
		System.out.println("Plane ready to take off");
		}else System.out.println("Plane isn't ready yet");
	}
	
	public String toString()
	{
		return super.toString() + "/desc_plane/";
	}
	
	
	

}
