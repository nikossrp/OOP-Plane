
class MaintenanceEmployee extends Employee{
	private int mp; //to poso exei doulepsei o ergazomenos
	
	MaintenanceEmployee(String nam)
	{
		super(nam);
		mp = 400;
	}
	
	void workOn(CargoBay c)
	{
		if(mp>0){
		Employee.flag = 1;
		System.out.println("I am "+name+" and I working at CargoBay!");
		mp--;
		}
		else System.out.println(name+" wants rest");
	}
	
	void workOn(EquipmentCompartment e)
	{
		if(mp>0){
		Employee.flag = 1;
		System.out.println("I am "+name+" and I am working at EquipmentCompartment!");
		mp--;
		}
		else System.out.println(name+" wants rest");
	}
	
	void workOn(PlaneComponent p){}
	void workOn(PrivateCompartment p){}
	void workOn(PassengerCompartment p){}
	
	void report()
	{
		if(Employee.flag == 1)
		System.out.println(name+ " report.....OK!");
	}
	
	int get_mp()
	{
		return mp;
	}

}
