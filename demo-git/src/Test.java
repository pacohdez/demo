
public class Test {

	public static void main(String[] args) {
		System.out.println("Hola Git!");
		
		int area = getArea(6,10);
		System.out.println("Area:" +area);
		System.out.println("AUTOR: ANDREA");
		
	}
	
	public static int getArea(int base, int altura){
		int area = base * altura / 2;
		return area;
	}

}
