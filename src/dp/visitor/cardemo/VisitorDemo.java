/**
 * File created by csd on Oct 28, 2017
 */
package dp.visitor.cardemo;

public class VisitorDemo {

	public static void main(String[] args) {
		final Car car = new Car();

		System.out.println("Accepting Print visitor:");
		car.accept(new CarElementPrintVisitor());

	}
}
