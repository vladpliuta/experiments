package by.pliuta.experements.experementPi;

public class Runner {

	public static void main(String[] args) {

		int border = 100;
		for (int i = 0; i < 100000; i++) {
			Point p = new Point(border);
			Experiment.checkCirclePoint(p);
		}
		System.out.println("число пи = " + Experiment.valuePi());
	}

}
