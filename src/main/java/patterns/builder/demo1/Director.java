package patterns.builder.demo1;

/**
 * 指挥，负责构建一个对象，如何构建，由这个指挥负责
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Director {

  public Product build(Builder builder) {
    builder.a();
    builder.b();
    builder.c();

    return builder.getProduct();
  }

}
