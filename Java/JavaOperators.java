/**
 * @author Bassel (Bakr) Aasher
 */

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

    // AND &&
    bresult = (x <= y && x == 3);
    print("(x <= y && x == 3) = " + bresult);
    bresult = (y <= x && x == 5);
    print("(y <= x && x == 5) = " + bresult);

    // OR ||
    bresult = (x <= y || x == 3);
    print("(x <= y || x == 3 = " + bresult);
    bresult = (y <= x || x == 5);
    print("(y <= x || x == 5) = " + bresult);

    /*
     * Bitwise operators
     */

    /*
     * AND                = &
     * OR                 = |
     * XOR (Exclusive OR) = ^
     * NOT                = ~
     * Left SHIFT         = <<
     * Right SHIFT        = >>
     * 
     * AND: corresponding bits are 1
     * A B ( A & B )
     * 0 0     0
     * 0 1     0
     * 1 0     0
     * 1 1     1
     * 
     * 
     * OR: at least one of any two corresponding bits is 1
     * A B ( A | B )
     * 0 0     0
     * 0 1     1
     * 1 0     1
     * 1 1     1
     * 
     * 
     * XOR: any two corresponding bits must be different
     * A B ( A ^ B )
     * 0 0     0
     * 0 1     1
     * 1 0     1
     * 1 1     0
     * 
     * NOT: change ones to zeros and vice-versa
     * A ( ~A ) 
     * 0   1
     * 0   1
     * 1   0
     * 1   0
     * 
     * 
     * Right SHIFT: shift ones to the right
     * If A in binary = 1000
     *  Then:
     *    (A >> 0) = 1000
     *    (A >> 1) = 0100
     *    (A >> 2) = 0010
     *    (A >> 3) = 0001
     *    (A >> 4) = 0000
     * 
     * 
     * Left SHIFT: shift ones to the left
     * If B in binary = 0001
     *  Then:
     *    (B << 0) = 0001
     *    (B << 1) = 0010
     *    (B << 2) = 0100
     *    (B << 3) = 1000
     *    (B << 4) = 0000
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

    // XOR ^
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
     */
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

  /**
   * prints @param line
   */
  private static void print(String line) {
    System.out.println(line);
  }

}
