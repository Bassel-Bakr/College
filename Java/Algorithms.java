public class Algorithms {
  
  // Iterative algorithm to compute factorial of (num)
  public static int factorial(int num) {
    int result = num;
    
    while(--num > 0)
      result *= num;
    
    return result;
  }
  
  // Recursive algorithm to compute factorial of (num)
  public static int factorial(int num) {
    return (num < 1) ? 1 : num * factorial(num - 1);
  }
  
  /* 
   * Tail-Recursive algorithm to compute factorial of (num)
   * The (accumulator) will hold the result that will be returned
   * The main difference between Tail and Non-Tail recursive algorithms is that:
   *  1. Tail-recursive algorithms can be easily converted to loops
   *  2. Our Tail-Recursive version doesn't abuse the stack as much as-
   *     non-recursive one.
   */
  public static int factorial(int num, int accumulator) {
    return (num < 1) ? accumulator : factorial(num - 1, num * accumulator);
  }
}
