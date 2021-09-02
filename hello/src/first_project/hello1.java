package first_project;

public class hello1{
	public static void main(String args[]) {
		int age = 23;
		switch(age) {
		case 1:{
			System.out.print("tre em");
			break;
		}
		case 18:{
			System.out.print("thanh nien");
			break;
		}
		case 23:{
			System.out.print("tuoi hien tai");
			break;
		}
		default: System.out.print("khong biet bao nhieu tuoi");
		}
		System.out.print("\nkiem tra cau lenh switch");
	}
}