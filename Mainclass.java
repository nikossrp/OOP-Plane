
public class Mainclass {

	 public static void main(String [] args)
	 {
		Plane pl = new Plane();
		Employee s = new SecurityEmployee("Nikos");
		Employee m = new MaintenanceEmployee("Marios");
		Employee c = new CleaningEmployee("Stela");
		
		pl.process(s);
		pl.process(m);
		pl.process(c);
		
		pl.report();
		
	 }

	}

