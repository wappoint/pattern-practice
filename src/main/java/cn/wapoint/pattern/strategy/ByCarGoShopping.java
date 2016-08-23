/**
 * 
 */
package cn.wapoint.pattern.strategy;

/**
 * @author linger
 *
 */
public class ByCarGoShopping implements GoShopping {

	/* (non-Javadoc)
	 * @see cn.wapoint.pattern.strategy.GoShopping#goShopping()
	 */
	@Override
	public void goShopping() {
		System.out.println("坐汽车去购物");
	}
}
