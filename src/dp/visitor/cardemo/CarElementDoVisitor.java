/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class CarElementDoVisitor implements CarElementVisitor {

	public void visit(Car car) {
		System.out.println("DoVisitor: Starting my car");
	}

	public void visit(Body body) {
		System.out.println("DoVisitor: Moving my body");
	}

	public void visit(Engine engine) {
		System.out.println("DoVisitor: Starting my engine");
	}

	public void visit(Wheel wheel) {
		System.out.println("DoVisitor: Kicking my " + wheel.getName() + " wheel");
	}
}
