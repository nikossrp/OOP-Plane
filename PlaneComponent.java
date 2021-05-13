
abstract class PlaneComponent extends Object {
	protected String desc_comp;
	PlaneComponent()
	{
		desc_comp = toString();
	}
	 void process(Employee e){
		 e.workOn(this);
	 };
	abstract void ready_check();
	public String toString()
	{
		return "/desc_comp/" + super.toString();
	}


}
