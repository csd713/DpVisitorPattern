/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}
