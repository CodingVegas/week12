import java.util.Random;

public class TestDemo {
  public int addPositive(int a, int b) {
    int c = 0;
        if(a < 0 || b < 0){
          throw new IllegalArgumentException("Both parameters must be positive!");
        } else {
          c = a+b;
          return c;
        }
  }
  
 int randomNumberSquared() {
  return getRandomInt()^2;
 
   }
 int getRandomInt() {
   Random random = new Random();
   return random.nextInt(10) + 1;
 }
}
