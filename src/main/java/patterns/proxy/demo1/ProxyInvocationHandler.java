package patterns.proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用这个类，生成代理类
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class ProxyInvocationHandler implements InvocationHandler {

  private Object target;

  public ProxyInvocationHandler(Object target) {
    this.target = target;
  }

  // 获取代理对象
  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader()
        ,target.getClass().getInterfaces()
        ,this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object invoke = method.invoke(target, args);
    return invoke;
  }
}
