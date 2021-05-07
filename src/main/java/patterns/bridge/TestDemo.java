package patterns.bridge;

import patterns.builder.demo1.Product;

/**
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class TestDemo {

  public static void main(String[] args) {
    ProductType laptop = new Laptop(new Lenovo());
    laptop.info();
  }

}
