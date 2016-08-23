/**
 * 
 */
package cn.wapoint.pattern.single;

/**
 * @author linger
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonPattern s1 = SingletonPattern.getInstance();
		SingletonPattern s2 = SingletonPattern.getInstance();
		System.out.println(s1 == s2);
	}

}
