package patterns.factory.abstractf;

/**
 * // 华为工厂
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class HuaweiProductFactory implements InvastmentFactory {
  // 生产手机
  public IphoneProduct phoneProduct() {
    return new HuaweiPhone();
  }

  // 生产路由
  public IRouterProduct routerProduct() {
    return new HuaweiRouter();
  }

}
