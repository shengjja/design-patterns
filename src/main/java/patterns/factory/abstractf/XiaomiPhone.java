package patterns.factory.abstractf;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class XiaomiPhone implements IphoneProduct{

  public void start() {
    System.out.println("开启小米手机");
  }

  public void shutdown() {

    System.out.println("关闭小米手机");
  }

  public void sendSMS() {
    System.out.println("小米手机发短信");
  }
}
