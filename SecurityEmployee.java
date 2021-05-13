
class SecurityEmployee extends Employee{
	private int mp; //to poso exei doulepsei o ergazomenos
	
	SecurityEmployee(String name)
	{
		super(name);
		mp = 500;
		
	}
	void workOn(PlaneComponent p){}
	
	void workOn(PrivateCompartment p)
	{	
		if(mp>0){
		Employee.flag = 1;
		System.out.println("I am "+name+" and I am working at PrivateCompartment!");
		mp--;
		}
		else System.out.println(name+" wants rest");
	}
	
	void workOn(PassengerCompartment p)
	{
		if(mp>0){
		Employee.flag = 1;
		System.out.println("I am "+name+" and I am working at PassengerCompartment!");
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
	
	void workOn(CargoBay c)
	{
		if(mp>0){
		Employee.flag = 1;
		workOn((PrivateCompartment) c);
		System.out.println("I am "+name+" and I am working at CargoBay!");
		workOn(new EquipmentCompartment()); //tha doulepsei kai ston mesa xwro
		mp--;
		}
		else System.out.println(name+" wants rest");
	}
	
	void report()
	{
		if(Employee.flag == 1){
		System.out.println(name+ " report.....OK!");}
	}
	
	int get_mp()
	{
		return mp;
	}
	
	
	
}
