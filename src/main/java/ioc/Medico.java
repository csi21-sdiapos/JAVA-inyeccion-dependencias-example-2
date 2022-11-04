package ioc;

public class Medico {

	Utils util;
	
	public void setUtil(Utils util) {
		this.util = util;
	}
	
	public void operar() {
		System.out.println("¡Operando!");
		util.usar();
	}
}
