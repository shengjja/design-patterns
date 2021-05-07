package patterns.proxy.demo1;

import java.util.Date;
import javax.xml.crypto.Data;
import patterns.prototype.demo1.Video;

/**
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class TestDemo {

  public static void main(String[] args) {

    ProxyInvocationHandler handler = new ProxyInvocationHandler(new Demo());

    IDemo proxy = (IDemo) handler.getProxy();
    proxy.setStr("asdkfas");
    proxy.getStr();

  }

}
