
class CleaningEmployee extends Employee{
	private int mp; //how much the employee has worked
	
	CleaningEmployee(String nam)
	{
		super(nam);
		mp = 300;
	}
	
	void workOn(CargoBay c)
	{
		if(mp>0){
		System.out.println("I am "+name+" and I am working at CargoBay!");
		mp--;
		}
		else System.out.println(name+" wants rest");
	}
	

	void workOn(PassengerCompartment p)
	{
		if(mp>0){
		Employee.flag = 1;
		System.out.println("I am " + name + " and I am working at PassengerCompartment!");
		mp--;
		}
		else System.out.println(name + " wants rest");
	}
	
	void workOn(EquipmentCompartment e){}
	void workOn(PlaneComponent p){}
	void workOn(PrivateCompartment p){}
	
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
