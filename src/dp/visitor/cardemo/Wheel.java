/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class Wheel implements CarElement {
	private String name;
	// constructor
	public Wheel(final String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
