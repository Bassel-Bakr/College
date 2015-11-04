/*
 * Author: Bassel Bakr
 * */

public class JavaOperators {

	public static void main(String args[]) {
		int x = 5;
		int y = 3;
		int result;

		/*
		 * Mathematical operators
		 */
		print("----------------------");
		print("Mathematical operators");
		print("----------------------");

		print("x = " + x);
		print("y = " + y);

		// add
		result = x + y;
		print("x + y = " + result);

		// subtract
		result = x - y;
		print("x - y = " + result);

		// multiply
		result = x * y;
		print("x * y = " + result);

		// divide
		result = x / y;
		print("x / y = " + result);

		// reminder of division
		result = x % y;
		print("x % y = " + result);

		// increment and decrement
		print("x = " + x);
		print("x++ = " + (x++)); // return old value then increment
		print("x = " + x);
		print("++x = " + (++x)); // increment first
		print("y = " + y);
		print("y-- = " + (y--)); // return old value then decrement
		print("y = " + y);
		print("--y = " + (--y)); // decrement first

		/*
		 * Relations operators
		 */
		print("-------------------");
		print("Relations operators");
		print("-------------------");

		print("x = " + (x = 5));
		print("y = " + (y = 3));

		boolean bresult;

		// greater than >
		bresult = (x > y);
		print("x > y = " + bresult);
		bresult = (y > x);
		print("y > x = " + bresult);

		// less than <
		bresult = (x < y);
		print("x < y = " + bresult);
		bresult = (y < x);
		print("y < x = " + bresult);

		// equal to ==
		bresult = (x == y);
		print("x == y = " + bresult);
		bresult = (y == x);
		print("y == x = " + bresult);

		// not equal to !=
		bresult = (x != y);
		print("x != y = " + bresult);
		bresult = (y != x);
		print("y != x = " + bresult);

		// greater than or equal to >=
		bresult = (x >= y);
		print("x >= y = " + bresult);
		bresult = (y >= x);
		print("y >= x = " + bresult);

		// less than or equal to <=
		bresult = (x <= y);
		print("x <= y = " + bresult);
		bresult = (y <= x);
		print("y <= x = " + bresult);
		
		/*
		 * Bitwise operators
		 */
		print("-----------------");
		print("Bitwise operators");
		print("-----------------");

		print("x = " + (x = 5));
		print("y = " + (y = 3));

		// AND &
		print("x & y = " + (x & y));
		// OR |
		print("x | y = " + (x | y));
		
		// XOR ^ aka: Exclusive OR
		print("x ^ y = " + (x ^ y));
		
		// NOT ~
		print("~x = " + (~x));
		print("~y = " + (~y));
		
		// Right SHIFT >>
		print("x >> 1 = " + (x >> 1));
		
		// Left SHIFT <<
		print("y << 1 = " + (y << 1));
		
		/*
		 * Misc operators
		 * */
		print("--------------");
		print("Misc operators");
		print("--------------");

		print("(x += y) is (x = x + y)");
		print("(x -= y) is (x = x - y)");
		print("(x *= y) is (x = x * y)");
		print("(x /= y) is (x = x / y)");
		print("(x %= y) is (x = x % y)");
		print("(x &= y) is (x = x & y)");
		print("(x |= y) is (x = x | y)");
		print("(x ^= y) is (x = x ^ y)");
		print("(x >>= y) is (x = x >> y)");
		print("(x <<= y) is (x = x << y)");
	}

	private static void print(String line) {
		System.out.println(line);
	}

}
