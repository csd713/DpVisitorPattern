/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class Body implements CarElement {
	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
