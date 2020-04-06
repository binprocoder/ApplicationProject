package chia1;
import java.util.Scanner;
public class chia1 {
double a,b,s;
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
void input()
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Nhap a:");
	setA(kb.nextDouble());
	System.out.println("Nhap b :");
	setB(kb.nextDouble());
}
void output()
{
	System.out.println("Du lieu vua nhap :");
	System.out.println("A = " + this.a + "\t\t\t B= " + this.b);
}
void chia()
{
	double s;
	s= this.a/this.b;
	System.out.println("Tong cua 2 so A va B = " + s);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		chia1 p = new chia1();
		p.input();
		p.output();
		p.chia();	
	}
}