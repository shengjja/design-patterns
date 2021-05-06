package patterns.single;

/**
 * 单例模式，饿汉
 * @author: jiaming.sheng
 * @date: 2021/4/29
 */
public class Hungry {

  // 静态变量私有
  private static final Hungry instance = new Hungry();

  // 构造方法私有
  private Hungry(){}

  // 实例获取方法
  public static Hungry getInstance() {
    return instance;
  }



}

/**
 * 懒汉，单例模式 双重校验锁
 */
class Lazy {

  private static volatile Lazy instance;

  private Lazy(){}

  public static Lazy getInstance() {
    if(instance == null) {
      synchronized (Lazy.class) {
        if(instance == null) {
          instance = new Lazy();
        }
      }
    }
    return instance;
  }
}

/**
 * 静态内部类实现 单例模式
 */
class Instance {
  private Instance(){}

  public static Instance getInstance() {
    return InnerClass.instance;
  }
  private static class InnerClass{
    private static final Instance instance = new Instance();
  }

}

/**
 * 枚举 单例模式
 */
enum EnumSingle {
  INSTANCE;
  private ClassDemo instance;
  EnumSingle(){
    instance = new ClassDemo();
  }

  public ClassDemo getInstance() {
    return instance;
  }

}

class ClassDemo{

}

class TestDemo{

  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      new Thread(()->{
        System.out.println(Instance.getInstance().hashCode());
      }).start();
    }
  }
}