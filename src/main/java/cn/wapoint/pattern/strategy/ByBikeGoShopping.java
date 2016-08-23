/**
 * 
 */
package cn.wapoint.pattern.strategy;

/**
 * @author linger
 *
 */
public class ByBikeGoShopping implements GoShopping {

	/* (non-Javadoc)
	 * @see cn.wapoint.pattern.strategy.GoShopping#goShopping()
	 */
	@Override
	public void goShopping() {
		System.out.println("骑自行车去购物");
	}

}
