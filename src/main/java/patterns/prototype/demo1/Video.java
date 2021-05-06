package patterns.prototype.demo1;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 *  实现一个接口
 *  重写一个方法
 * @author: jiaming.sheng
 * @date: 2021/4/30
 */
@Data
public class Video implements Cloneable{

  private String name;
  private Date createTime;

  public Video(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
