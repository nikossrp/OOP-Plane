
abstract class Employee {
	static int flag; //gia na blepoume pote doulepsan kai pote oxi
	String name;
	Employee(String nam)
	{
		name = nam;
	}
	abstract void workOn(PlaneComponent p);
	abstract void workOn(PassengerCompartment p);
	abstract void workOn(EquipmentCompartment e);
	abstract void workOn(CargoBay c);
	abstract void workOn(PrivateCompartment p);
	abstract void report();
	abstract int get_mp();
	
}
