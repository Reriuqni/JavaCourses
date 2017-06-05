public class Bitwise {

	public static void main(String[] args) {

		int a = 0b1111_1111_1111_1111_1111_1111_1111_1111;

		int b = 0b0111_1111_1111_1111_1111_1111_1111_1111;

		System.out.println("a="+a);

		System.out.println("a>>1="+(a>>1));

		System.out.println("a<<1="+(a<<1));

		System.out.println("a>>>1="+(a>>>1));

		System.out.println("b="+b);

		System.out.println("b>>1="+(b>>1));

		System.out.println("b<<1="+(b<<1));

		System.out.println("b>>>1="+(b>>>1));

	}
}
