/**
 * 
 */
package cn.wapoint.pattern.strategy;

/**
 * @author linger
 *
 */
public class StrategyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoShopping goShopping = new ByCarGoShopping();
		StrategyPattern strategyPattern = new StrategyPattern(goShopping);
		strategyPattern.goShopping();
	}

}
