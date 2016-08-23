/**
 * 
 */
package cn.wapoint.pattern.single;

/**
 * @author linger
 *
 */
public class SingletonPattern {
	private static SingletonPattern instance = new SingletonPattern();

	private SingletonPattern() {
	}

	public static SingletonPattern getInstance() {
		return instance;
	}

}
