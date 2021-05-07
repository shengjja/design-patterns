package patterns.proxy.demo1;

/**
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class Demo implements IDemo{
  private String str;


  public void getStr(){
    System.out.println(str);
  }

  @Override
  public void setStr(String str) {
    this.str = str;
  }

}
