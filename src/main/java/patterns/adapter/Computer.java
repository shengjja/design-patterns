package patterns.adapter;

/**
 * 模拟一个电脑需要联网，但是需要一个转接口，的场景
 * @author: jiaming.sheng
 * @date: 2021/5/6
 */
public class Computer {

  public void networking(INetworkAdapter adapter) {
    adapter.connectNetwork();

  }

  public static void main(String[] args) {
    Computer computer = new Computer();
    // 网线
    Reticle reticle = new Reticle();
    // 适配器连接网线
    NetworkAdapter networkAdapter = new NetworkAdapter(reticle);
    // 电脑使用适配器上网
    computer.networking(networkAdapter);
  }

}
