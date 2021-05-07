package patterns.bridge;

import patterns.builder.demo1.Product;

/**
 * 产品类型 抽象类，关联了Brand，使得 品牌和类型可以桥接
 * 功能是先打印品牌，再打印产品类型
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public abstract class ProductType {
  protected Brand brand;

  public ProductType(Brand brand) {
    this.brand = brand;
  }

  protected abstract void info();

}

/**
 * 主机
 */
class Desktop extends ProductType {

  public Desktop(Brand brand) {
    super(brand);
  }

  @Override
  protected void info() {
    brand.tag();
    System.out.println("台式机");
  }
}

class Laptop extends ProductType {

  public Laptop(Brand brand) {
    super(brand);
  }

  @Override
  protected void info() {
    brand.tag();
    System.out.println("笔记本");
  }
}
