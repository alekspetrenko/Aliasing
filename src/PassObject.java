
public class PassObject {
	public void f(Calculator y) {
		y.c = 124.f;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassObject b = new PassObject();
		Calculator x = new Calculator();
		x.c = 364.f;
		System.out.println("1: x.c: " + x.c);
		b.f(x);
		System.out.println("2: x.c: " + x.c);
	}

}



	
	// TODO Auto-generated method stub


