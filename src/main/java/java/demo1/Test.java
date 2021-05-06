package java.demo1;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Test {

  public static void main(String[] args) {
    Director d = new Director();
    Product build = d.build(new Worker());
    System.out.println(build);
  }

}
