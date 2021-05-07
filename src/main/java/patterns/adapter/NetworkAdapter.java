package patterns.adapter;

/**
 * 适配器实现类，实际连接网线上网的方法在这里。
 * 需要传入网线类
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class NetworkAdapter implements INetworkAdapter {

  private Reticle reticle;

  public NetworkAdapter(Reticle reticle) {
    this.reticle = reticle;
  }

  @Override
  public void connectNetwork() {
    reticle.netting();
  }
}
