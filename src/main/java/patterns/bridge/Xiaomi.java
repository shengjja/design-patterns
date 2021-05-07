package patterns.bridge;

/**
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class Xiaomi implements Brand{

  @Override
  public void tag() {
    System.out.print("M1");
  }
}
