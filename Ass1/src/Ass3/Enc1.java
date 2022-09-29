package Ass3;

public class Enc1 {
		public int a;
		public float b;
		public double c;
		
	public Enc1(double c) {
		this.c = c;
		System.out.println("This is Double"+c);
		}
	public Enc1(float b) {
		this.b = b;
		System.out.println("This is Float"+b);
	}
	public Enc1(int a) {
		this.a = a;
		System.out.println("This is Int"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enc1 e1 = new Enc1(587);
		Enc1 e2 = new Enc1(5.768977);
		Enc1 e3 = new Enc1(8765.1);
		Enc1 e4 = new Enc1(45);
		Enc1 e5 = new Enc1(56);
	}
		
}
