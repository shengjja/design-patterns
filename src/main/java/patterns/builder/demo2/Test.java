package patterns.builder.demo2;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Test {

  public static void main(String[] args) {
    Product product = new Worker().buildA("asdfasdf").getProduct();
    System.out.println(product);
  }

}
