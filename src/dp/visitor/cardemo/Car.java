/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class Car implements CarElement {
	CarElement[] elements;

	// constructor
	public Car() {
		this.elements = new CarElement[] { new Wheel("Front Left"),
				new Wheel("Front Right"), new Wheel("Back Left"),
				new Wheel("Back Right"), new Body(), new Engine() };
	}

	public void accept(final CarElementVisitor visitor) {
		for (CarElement elem : elements) {
			elem.accept(visitor);
		}
		visitor.visit(this);
	}
}
