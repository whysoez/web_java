package bt3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestMaps implements IMap<Integer, String> {
	static Map<Integer, City<Integer, String>> map = new HashMap<>();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			TestMaps tm = new TestMaps();

			do {
				System.out.println("*********MENU***********");
				System.out.println("1.Nhap danh sach voi n quoc gia voi key tang 1-n");
				System.out.println("2.Hien thi danh sach quoc gia ra man hinh");
				System.out.println("3.Sap xep quoc gia tang dan teo ten");
				System.out.println("4.Thoat.");
				System.out.print("Nhap lua chon cua ban: ");
				int choi = Integer.parseInt(sc.nextLine());
				switch (choi) {
				case 1:
					tm.inputData(14, "Ha noi", true);
					tm.inputData(32, "thai binh", false);
					tm.inputData(1, "quang ngai", true);
					tm.inputData(333, "ho chi minh", false);

					break;
				case 2:
					tm.displayData();
					break;
				case 3:
					tm.sortUp();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.print("vui long chon 1-4: ");
					break;
				}
			} while (true);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void inputData(Integer id, String name, Boolean status) {
		// TODO Auto-generated method stub
		City<Integer, String> ct = new City<Integer, String>();
		ct.setId(id);
		ct.setName(name);
		ct.setStatus(status);
		map.put(id, ct);
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		for(Entry<Integer, City<Integer, String>> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

	@Override
	public void sortUp() {
		// TODO Auto-generated method stub
		for (int i = 0; i < map.size()-1; i++) {
			for (int j = i+1; j < map.size(); j++) {
				if (map.get(i).getId()<map.get(j).getId()) {
					int temp = map.get(j).getId();
					map.put(j, map.get(i));
					map.put(i, map.get(temp));
				}
			}
		}
		System.out.println("da sap xep xong");
	}


}
