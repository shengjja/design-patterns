package patterns.proxy.demo2;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class CglibInterceptor implements MethodInterceptor {

  private Enhancer enhancer = new Enhancer();

  @Override
  public Object intercept(Object o, Method method, Object[] objects
      , MethodProxy methodProxy)
      throws Throwable {

    Object o1 = methodProxy.invokeSuper(o, objects);

    return o1;
  }

  public Object newProxyInstance(Class<?> c) {
    enhancer.setSuperclass(c);
    enhancer.setCallback(this);
    return enhancer.create();
  }



}
