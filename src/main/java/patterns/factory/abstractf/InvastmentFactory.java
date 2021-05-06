package patterns.factory.abstractf;

/**
 * // 抽象工厂
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public interface InvastmentFactory {
  // 生产手机
  IphoneProduct phoneProduct();

  // 生产路由
  IRouterProduct routerProduct();

}
