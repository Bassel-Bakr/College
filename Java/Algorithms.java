public class Algorithms {
  
  // Recursive algorithm to compute factorial of (num)
  public static int recursive_factorial(int num) {
    if(num < 0)
      throw new IllegalArgumentException("No factorial for negative numbers!");
      
    return (num < 1) ? 1 : num * factorial(num - 1);
  }
  
  /* 
   * Tail-Recursive algorithm to compute factorial of (num)
   * The (accumulator) will hold the result that will be returned
   * The main differences between Tail and Non-Tail recursive algorithms is that:
   *  1. Tail-recursive algorithms can be easily converted to loops
   *  2. Our Tail-Recursive version doesn't abuse the stack as much as-
   *     non-recursive one.
   */
  public static int recursive_factorial(int num, int accumulator) {
    if(num < 0)
      throw new IllegalArgumentException("No factorial for negative numbers!");
      
    return (num < 1) ? accumulator : factorial(num - 1, num * accumulator);
  }
  
  // Iterative algorithm to compute factorial of (num)
  public static int iterative_factorial(int num) {
    int result = num;
    
    while(--num > 0)
      result *= num;
    
    return result;
  }
  
  
  
  /*
   * fibonacci(x) = fibonacci(x - 1) + fibonacci(x - 2)
   */
  public static int recursive_fibonacci(int num) {
    if(num < 0)
      throw new IllegalArgumentException("No fibonacci for negative numbers!");
    else if(num == 1 || num == 2)
      return 1;
    else
      return recursive_fibonacci(num - 1) + recursive_fibonacci(num - 2);
  }
  
  /*
   * A bottom-up algorithm, instead of starting from num to 0, we will start from 1 to num
   * Since fibonacci of 3 is fib(1) + fib(2) = 1 + 1 = 2
   * We will calculate these values before hand
   * And since fib(x) = fib(x - 1) + fib(x - 2)
   * we will just sum and swap values until we finish number 3 through (num)
   */
  public static int iterative_fibonacci(int num) {
    if(num < 0)
      throw new IllegalArgumentException("No fibonacci for negative numbers!");
    else if(num == 0)
      return 0;
    
    int x_1, x_2;
    x_1 = x_2 = 1;
    
    int result = 0;
    
    while(num-- > 2) {
      result += x_1 + x_2;
      x_1 = x_2;
      x_2 = result;
    }
    
    return result;
  }
}
