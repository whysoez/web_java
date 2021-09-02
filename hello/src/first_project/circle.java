package first_project;

class Square{
	int squa(int radius) {
		return radius*radius;
	}
}
public class circle {
	Square r;
	double pi = 3.14;
	
	double Dien_tich(int ban_kinh) {
		r = new Square();
		double result = r.squa(ban_kinh)*pi;
		return result;
	}
	public static void main(String args[]) {
		circle c = new circle();
		double result = c.Dien_tich(15);
		System.out.println("dien tich cua hinh tron la:" + result);
	}
}
