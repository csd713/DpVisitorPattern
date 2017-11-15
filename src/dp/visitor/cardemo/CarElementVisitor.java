/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public interface CarElementVisitor {

	void visit(Car car);

	void visit(Body body);

	void visit(Engine engine);

	void visit(Wheel wheel);

}
