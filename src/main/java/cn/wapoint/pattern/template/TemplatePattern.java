/**
 * 
 */
package cn.wapoint.pattern.template;

/**
 * @author linger
 *
 */
public abstract class TemplatePattern {

	public void executeBefore() {
		System.out.println("excuteBefore");
	}

	public void executeAfter() {
		System.out.println("executeAfter");
	}

	public abstract void execute();

	public void doExecute() {
		executeBefore();
		execute();
		executeAfter();
	}
}
