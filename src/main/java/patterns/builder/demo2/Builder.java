package patterns.builder.demo2;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public abstract class Builder {

  abstract Builder buildA(String s);
  abstract Builder buildB(String s);
  abstract Builder buildC(String s);

  abstract Product getProduct();


}
