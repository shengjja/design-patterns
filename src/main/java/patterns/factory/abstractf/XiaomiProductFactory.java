package patterns.factory.abstractf;

/**
 * // 小米工厂
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class XiaomiProductFactory implements InvastmentFactory {
  // 生产手机
  public IphoneProduct phoneProduct() {
    return new XiaomiPhone();
  }

  // 生产路由
  public IRouterProduct routerProduct() {
    return new XiaomiRouter();
  }

}
