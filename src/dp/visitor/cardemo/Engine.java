/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class Engine implements CarElement {
	@Override
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
