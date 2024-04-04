package becker.zacarias.converters;

public class NumberConverter {
	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		if (isNumeric(strNumber))
			return Double.parseDouble(strNumber.replaceAll(",", "."));
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		return strNumber.replaceAll(",", ".").matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
