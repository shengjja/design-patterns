package patterns.factory;

import patterns.factory.abstractf.InvastmentFactory;
import patterns.factory.abstractf.IphoneProduct;
import patterns.factory.abstractf.XiaomiProductFactory;

/**
 * 工厂模式
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class FactoryPattern {

  public static void main(String[] args) {
    // 抽象工厂使用
    InvastmentFactory productFactory = new XiaomiProductFactory();
    IphoneProduct iphoneProduct = productFactory.phoneProduct();
    iphoneProduct.sendSMS();
  }
}
