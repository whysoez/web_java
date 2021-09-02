package bkap;

import java.util.Iterator;
import java.util.Scanner;

public class btvn2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so pha tu trong mang: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] arrInt = new int[n];
		do {
			System.out.println("\n************MENU*************");
			System.out.println("1.nhap cac phan tu trong mang");
			System.out.println("2.hien thi mang vua nhap");
			System.out.println("3.in ra phan tu co gia tri lon nhat, nho nhat");
			System.out.println("4.in ra phan tu la so nguyen to");
			System.out.println("5.in ra cac phan tu la so hoan hao");
			System.out.println("6.sap xep mang giam dan");
			System.out.println("7.thoat");
			System.out.print("nhap lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				System.out.println("gia tri cac phan tu trong mang la: ");
				for (int i = 0; i < n; i++) {
					System.out.printf("gia tri cua mang arrInt[%d] la: ",i);
					arrInt[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 2:
				for (int i : arrInt) {
					System.out.printf("%d\t",i);
				}
				break;	
			case 3:
				int max = arrInt[0];
				int min = arrInt[0];
				for(int i=1;i<n;i++) {
					if(arrInt[i]>max)
						max = arrInt[i];
				}
				for (int i = 1; i < n; i++) {
					if (arrInt[i]<min) {
						min = arrInt[i];
					}
				}
				System.out.println("gia tri lon nhat la: "+max);
				System.out.println("gia tri nho nhat la : "+min);
				break;
			case 4:
				System.out.println("phan tu la so nguyen to la: ");
				for (int i = 0; i < n; i++) {
					if (arrInt[i]>=2){
						boolean check = true;
						for (int j = 2; j < arrInt[i]; j++) {
							if (arrInt[i]%j==0) {
								check = false;
								break;
							}
						}if(check)
							System.out.print("\t"+arrInt[i]);
					}
				}
				break;
			case 5:
				System.out.println("so hoan hao trong mang la: ");
				for (int i = 0; i < n; i++) {
					int sum = 0;
					for (int j = 1; j < arrInt[i]; j++) {
						if (arrInt[i]%j==0) {
							sum += j;
						}
					}
					if (sum == arrInt[i]) {
						System.out.printf("\t%d",arrInt[i]);
					}
				}
				break;
			case 6:
				for (int i = 0; i < n-1; i++) {
					for (int j = i+1; j < n; j++) {
						if (arrInt[i]<arrInt[j]) {
							int temp = arrInt[j];
							arrInt[j] = arrInt[i];
							arrInt[i] = temp;						}
					}
				}
				System.out.println("mang da duoc sap xep.");
				break;
			case 7:
				System.exit(0);

			default:
				System.out.println("vui long chon lai 1-7: ");
				break;
			}
		} while (true);
	}
}
