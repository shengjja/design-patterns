package patterns.factory.abstractf;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class XiaomiRouter implements IRouterProduct{

  public void start() {
    System.out.println("开启小米路由");
  }

  public void shutdown() {

    System.out.println("关闭小米路由");
  }

  public void open() {
    System.out.println("小米路由open");
  }

}
