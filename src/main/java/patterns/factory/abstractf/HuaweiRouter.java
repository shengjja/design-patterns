package patterns.factory.abstractf;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class HuaweiRouter implements IRouterProduct{

  public void start() {
    System.out.println("开启华为路由");
  }

  public void shutdown() {

    System.out.println("关闭华为路由");
  }

  public void open() {
    System.out.println("华为路由open");

  }

}
