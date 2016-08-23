/**
 * 
 */
package cn.wapoint.pattern.facade;

/**
 * @author linger
 *
 */
public class FacadeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Male male = new Male();
		Female female = new Female();
		FacadePattern facadePattern = new FacadePattern(male, female);
		facadePattern.doSomething("male");
	}

}
