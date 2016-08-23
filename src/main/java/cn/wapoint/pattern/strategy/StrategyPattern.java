/**
 * 
 */
package cn.wapoint.pattern.strategy;

/**
 * @author linger
 *
 */
public class StrategyPattern {
	private GoShopping goShopping;

	public StrategyPattern(GoShopping goShopping) {
		this.goShopping = goShopping;
	}

	public void goShopping() {
		this.goShopping.goShopping();
	}
}
