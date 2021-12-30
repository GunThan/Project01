package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap 2 so nguyen va in ra gia tri lon, be
		System.out.println("Nhap vao a: ");
		int a = sc.nextInt();
		
		System.out.println("Nhap vao b: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a + " So lon nhat");
			System.out.println(b + " So nho nhat");
			
		}else {
			System.out.println(a + " So nho nhat");
			System.out.println(b + " So lon nhat");
		}
			
		//Nhap vao 2 so thuc va in ra tong, hieu, tich, thuong
		System.out.println("Nhap vao 1 so: ");
		float c = sc.nextFloat();
		
		System.out.println(" Nhap vao 1 so: ");
		float d = sc.nextFloat();
		
		float tong = c + d;
		System.out.println( "Tong: " + tong);
		
		float hieu = c - d;
		System.out.println( "Hieu: " + hieu);
		
		float tich = c * d;
		System.out.println( "Tich: " + tich);
		
		float thuong = c / d;
		System.out.println( "Thuong: " + thuong);
		
		//Nhap vao 3 so thuc va in ra tong, trung binh cong, tich
		System.out.println(" Nhap vao 1 so: ");
		c = sc.nextFloat();
		System.out.println(" Nhap vao 1 so: ");
		d = sc.nextFloat();
		System.out.println(" Nhap vao 1 so: ");
		float e = sc.nextFloat();
		
		tong = c + d + e;
		System.out.println("Tong: " + tong);
		
		float tbc = (c + d + e) * 3;
		System.out.println("Trung binh cong: " + tbc);
		
		tich = c * d * e;
		System.out.println("Tich: " + tich);
		
		//Nhap 2 so nguyen a va b. tinh tong va hieu cua 2 so a va b la chan hay le
		System.out.println(" Nhap vao a: ");
		a = sc.nextInt();
		System.out.println(" Nhap vao b: ");
		b = sc.nextInt();
		System.out.println("nhap a");
		   a = sc.nextInt();
		   
		   System.out.println("nhap b");
		    b = sc.nextInt();
		   
		   int Tong = a + b;
		      System.out.println("tong:" + Tong);	
			
			  int Hieu = a - b;
		      System.out.println("hieu:" + Hieu);
		      if( tong % 2 == 0) {
					System.out.println("Tong chan: " + Tong);
					System.out.println("Hieu le: " + Hieu);
				}else {
					System.out.println("Tong le: " + Tong);
					System.out.println(" Hieu Chan: " + Hieu);
				}
		//Nhap 2 so nguyen va in ra gia tri lon, be
				System.out.println("Nhap vao a: ");
				a = sc.nextInt();
				
				System.out.println("Nhap vao b: ");
				b = sc.nextInt();
				
				if(a>b) {
					System.out.println(a + " So lon nhat");
					System.out.println(b + " So nho nhat");
					
				}else {
					System.out.println(a + " So nho nhat");
					System.out.println(b + " So lon nhat");
				}
		//Nhap vao 3 so nguyen in ra gia tri lon nhat va be nhat
				System.out.println("Nhap vao a: ");
				a = sc.nextInt();
				
				System.out.println("Nhap vao b: ");
				b = sc.nextInt();
				
				System.out.println(" Nhap vao c: ");
				int g = sc.nextInt();
				
				if(a>b|| b>g) {
					System.out.println(a + " So lon nhat");
					System.out.println(g + " So nho nhat");
				}else {
					System.out.println(a + " So nho nhat");
					System.out.println(g + " So lon nhat");
				}
				
				
				
				
				
		
	}
}


