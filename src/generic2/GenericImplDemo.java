package generic2;
/*
 * ≤‚ ‘¿‡
 */
public class GenericImplDemo {
	public static void main(String[] args) {
		GenericImpl<String> g1 = new GenericImpl<>();
		g1.show("—Ó—Ó");
		GenericImpl<Integer> g2 =new GenericImpl<>();
		g2.show(20);
		GenericImpl<Boolean> g3 = new GenericImpl<>();
		g3.show(true);
		
	}
}
