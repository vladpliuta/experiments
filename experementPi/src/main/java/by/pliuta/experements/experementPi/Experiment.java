package by.pliuta.experements.experementPi;

public class Experiment {
	private static int totalPoint;
	private static int circlePoint;

	public static void checkCirclePoint(Point point) {
		totalPoint++;
		int border = point.getBorder();
		if (radius(point) <= border) {
			circlePoint++;
		}

	}

	private static double radius(Point point) {
		int x = point.getX();
		int y = point.getY();

		return Math.sqrt(x * x + y * y);
	}
	
	public  static  double valuePi (){
		return (double) 4*circlePoint/totalPoint;
	}
}
