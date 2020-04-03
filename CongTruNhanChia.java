package congtrunhanchia;
import java.util.Scanner;
public class CongTruNhanChia {
int a,b,s;
public int  getA() {
	return a;
}
public void setA(int a) {
	this.a=a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b=b;
}
void input()
{
	Scanner kb=new Scanner(System.in);
	System.out.println("nhap a:");
	setA(kb.nextInt());
	System.out.println("nhap b:");
	setB(kb.nextInt());
}
void output() {
	System.out.println(" du lieu vua nhap:");
	System.out.println("A="+this.a+"\t\t\tB="+this.b);
}
void tru() {
	s=this.a-this.b;
	System.out.println("hieu cau hai so A va B="+s);
}
	public static void main(String[] args) {
		System.out.println("Hello everybody");
		CongTruNhanChia C=new CongTruNhanChia();
		C.input();
		C.output();
		C.tru();

	}

}
