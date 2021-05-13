
 abstract class Object {
	int id;

	Object()
	{
		id += 1;
	}
	 public String toString()
	 {
		 String s = String.valueOf(id++); //metatropi int se String
		 return s;
	 }

}
