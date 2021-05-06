package patterns.prototype.demo2;

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
    Object obj = super.clone();
    // 深克隆，将时间也克隆并赋值
    Video v = (Video) obj;
    v.createTime = (Date)this.createTime.clone();
    return obj;
  }
}
