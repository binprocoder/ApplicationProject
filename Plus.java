package plus;

import java.util.Scanner;

public class Plus {

int a,b,s;

public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

void input()
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Nhap a:");
	setA(kb.nextInt());
	System.out.println("Nhap b :");
	setB(kb.nextInt());
}

void output()
{
	System.out.println("Du lieu vua nhap :");
	System.out.println("A = " + this.a + "\t\t\t B= " + this.b);
}

void sum()
{
	int s;
	s= this.a+this.b;
	System.out.println("Tong cua 2 so A va B = " + s);
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Xin Chao ");
		Plus p = new Plus();
		p.input();
		p.output();
		p.sum();
	}

}