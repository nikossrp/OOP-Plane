
 abstract class Object {
	int id;

	Object()
	{
		id += 1;
	}
	 public String toString()
	 {
		 String s = String.valueOf(id++); //convert from int to String
		 return s;
	 }

}
