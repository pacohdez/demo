
public class Test {

	public static void main(String[] args) {
		
		
		int area = getArea(5,24);
		System.out.println("Area:" +area);
		System.out.println("Author: Lilian");
		System.out.println("Author: Andrea Adriana (>.<)");
		System.out.println("Author: Jakqueline");
		System.out.println("Andale Paco si se puede!!!");
		
	}
	
	public static int getArea(int base, int altura){
		int area = base * altura / 2;
		System.out.println("Area: "+area);
		return area;
	}
	
	
	public static int getAreaRectangulo(int base, int altura){
		int area = base * altura;
		return area;
	}
	

}
