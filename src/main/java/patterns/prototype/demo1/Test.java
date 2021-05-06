package patterns.prototype.demo1;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
public class Test {

  public static void main(String[] args) throws CloneNotSupportedException {
    Date now = new Date();

    Video v1 = new Video(now);

    Video v2 = (Video) v1.clone();

    System.out.println(v1);
    System.out.println(v2);
    System.out.println("change time");

    // 浅克隆导致两个有影响
    //
    now.setTime(1);
    System.out.println(v1);
    System.out.println(v2);
  }

}
