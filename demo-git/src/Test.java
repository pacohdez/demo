
public class Test {

	public static void main(String[] args) {
		System.out.println("Hola Git!");
		
		int area = getArea(6,10);
		System.out.println("Area:" +area);
		System.out.println("Author: Lilian");
		System.out.println("AUTOR: ANDREA");
		System.out.println("Author: Jakqueline");
		System.out.println("Andale Paco si se puede!!!");
		
	}
	
	public static int getArea(int base, int altura){
		int area = base * altura / 2;
		System.out.println("Area: "+area);
		return area;
	}

}
