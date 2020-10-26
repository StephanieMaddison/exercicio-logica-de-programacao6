public class mcd {

	public static double mdc(double dividendo, double divisor) {

		if ((dividendo % divisor == 0)) {
			return divisor;
		} else {
			return mdc(divisor, (dividendo % divisor));
		}

	}
}