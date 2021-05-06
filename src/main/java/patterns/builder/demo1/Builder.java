package patterns.builder.demo1;

/**
 * 抽象的建造者
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public abstract class Builder {

  abstract void a();
  abstract void b();
  abstract void c();

  abstract Product getProduct();


}
