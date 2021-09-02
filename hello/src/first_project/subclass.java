package first_project;

public class subclass {
	static int banknumber = 44;
	static int id_customer = 123;
	String name;
	String subject;
	
	void learn(String name) {
		this.name = name;
		System.out.println("learning" + name);
	}
	
	static int number() {
		System.out.print(banknumber+ " "+id_customer);
		return banknumber;
	}
}

class sub extends subclass{
	public static void main(String srgs[]) {
		String name = "Hung";
		sub sb = new sub();
		sb.learn(name);
		sub.number();
	}
}
