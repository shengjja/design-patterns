package patterns.builder.demo2;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Worker extends Builder {

  private Product product;

  public Worker() {
    product = new Product();
  }

  Builder buildA(String s) {
    product.setA(s);
    return this;
  }

  Builder buildB(String s) {
    product.setB(s);
    return this;
  }

  Builder buildC(String s) {
    product.setC(s);
    return this;
  }

  Product getProduct() {
    return product;
  }
}
