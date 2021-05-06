package java.demo1;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Worker extends Builder {

  private Product product;

  public Worker() {
    this.product = new Product();
  }

  void a() {
    product.setA("set a");
    System.out.println("set a");
  }

  void b() {
    product.setB("set b");
    System.out.println("set b");
  }

  void c() {
    product.setC("set c");
    System.out.println("set c");
  }

  Product getProduct() {
    return this.product;
  }
}
