package demo;

public class Test {
	public static void main(String[] args) {
		GenericClassdemo<Integer, String> gnr = new GenericClassdemo<>();
		gnr.setA(15);
		gnr.setB("nguyen van a");
		gnr.displayData();

		GenericMethoddemo gn = new GenericMethoddemo();
		Integer[] a = {5, 7, 8, 8, 0};
		String[] b = {"nguyen van a", "nguyen van b", "nguyen van c"};
		Float[] c = {5.5f, 7.2F, -3.6f};
		
		gn.display(a);
		gn.display(b);
		gn.display(c);
	}
}
