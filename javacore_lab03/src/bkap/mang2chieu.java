package bkap;

import java.util.Scanner;

public class mang2chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("so hang cua mang la: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("so cot cua mang la: ");
		int m = Integer.parseInt(sc.nextLine());
		int[][] mang = new int[n][m];
		do {
			System.out.println("\n**********MENU************");
			System.out.println("1.nhap gia tri cac phan tu mang");
			System.out.println("2.hien thi mang vua nhap theo ma tran");
			System.out.println("3.in gia tri cac phan tu nam tren duong bien");
			System.out.println("4.in tong cac gia tri nam tren duong cheo chinh va cheo phu");
			System.out.println("5.sap xep cac cot trong mang tang dan");
			System.out.println("6.thoat");
			System.out.print("nhap lua chon cua ban: ");
			int choi = Integer.parseInt(sc.nextLine());
			switch (choi) {
			case 1:
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.printf("gia tri cua mang[%d][%d] la: ",i,j);
						mang[i][j] = Integer.parseInt(sc.nextLine());
					}
				}
				System.out.println(" ");
				break;
			case 2:
				for (int i = 0; i < n; i++) {
					System.out.println("");
					for (int j = 0; j < m; j++) {
						System.out.print("\t"+mang[i][j]);
					}
				}
				System.out.println(" ");
				break;
			case 3:
				for (int i = 0; i < n; i++) {
					System.out.println(" ");
					for (int j = 0; j < m; j++) {
						if (i==0 || j==0 || i==n-1 || j==m-1) {
							System.out.print("\t"+mang[i][j]);
						}
						else
							System.out.print("\t");
					}
				}
				break;
			case 4:
				if (n==m) {
					for (int i = 0; i < n; i++) {
						for (int j = 0; j < m; j++) {
							if (i==j) {
								System.out.print("\t"+mang[i][j]);
							}
						}
					}
					System.out.println(" ");
					for (int i = 0; i < n; i++) {
						for (int k = 0; k < m; k++) {
							if (i+k==n-1) {
								System.out.print("\t"+mang[i][k]);
							}
						}
					}
				}
				else {
					System.out.println("khong co duong cheo chinh va duong cheo phu");
				}
				break;
			case 5:
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n-1; j++) {
						for (int k = j+1; k < n; k++) {
							if (mang[j][i]>mang[k][i]) {
								int temp = mang[j][i];
								mang[j][i]=mang[k][i];
								mang[k][i]=temp;
							}
						}
					}
				}
				System.out.println("mang da duoc sap xep.");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.print("vui long chon lai 1-6: ");
				break;
			}
		} while (true);
	}
}
