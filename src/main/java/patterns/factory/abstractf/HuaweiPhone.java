package patterns.factory.abstractf;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class HuaweiPhone implements IphoneProduct{

  public void start() {
    System.out.println("开启华为手机");
  }

  public void shutdown() {

    System.out.println("关闭华为手机");
  }

  public void sendSMS() {
    System.out.println("华为手机发短信");
  }
}
