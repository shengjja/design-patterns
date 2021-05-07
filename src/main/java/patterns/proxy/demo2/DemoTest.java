package patterns.proxy.demo2;

/**
 * cglib 动态代理 测试
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class DemoTest {
  public static void main(String[] args) {
    CglibInterceptor interceptor = new CglibInterceptor();
    Demo o = (Demo) interceptor.newProxyInstance(Demo.class);
    o.setStr("asdfdasdfasdfsadf");
    o.getStr();
  }
}
