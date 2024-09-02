
public class Debugging {
	int i;
	public static void main(String[] args) {
		
		System.out.println("Inciou o método main");
		a();
		System.out.println("Terminou o método main");
		
	}
	
	static void a() {
		System.out.println("Iniciou o método A");
		b();
		System.out.println("Terminou o método A");
	}
	
	static void b() {
		System.out.println("Iniciou o método B");
		for (int i=0;i<=4;i++) {
			System.out.println(i);
			}
		c();
		System.out.println("Terminou o método B");
	}
	
	static void c() {
		System.out.println("Iniciou o método C");
		System.out.println("Terminou o método C");
	}
	
	

}
