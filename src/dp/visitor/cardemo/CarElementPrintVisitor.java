/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class CarElementPrintVisitor implements CarElementVisitor {

	public void visit(final Car car) {
		System.out.println("PrintVisitor: Visiting car");
	}

	public void visit(final Body body) {
		System.out.println("PrintVisitor: Visiting body");
	}

	public void visit(final Engine body) {
		System.out.println("PrintVisitor: Visiting Engine");
	}

	public void visit(final Wheel wheel) {
		System.out.println("PrintVisitor: Visiting " + wheel.getName() + " wheel");
	}

}
