package generic;
/*
 * ²âÊÔÀà
 */
public class GenericDemo02 {
	public static void main(String[] args) {
		Generic<String> g1 = new Generic<>();
		g1.setT("Íõ±ù±ù");
		System.out.println(g1.getT());
		
		Generic<Integer> g2 = new Generic<>();
		g2.setT(26);
		System.out.println(g2.getT());
		
		Generic<Boolean> g3 = new Generic<>();
		g3.setT(true);
		System.out.println(g3.getT());
	}
}
