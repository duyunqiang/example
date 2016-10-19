package cn.netkiller.example;

import java.math.BigDecimal;

public class Tss {

	public static void main(String[] args) {

		double a = 77.22;
		double b = 77.2;

		System.out.println((float) a + b);
		System.out.println((float) a - b);
		System.out.println((float) a * b);
		System.out.println((float) a / b);

		System.out.println("-------------");

		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mul(a, b));
		System.out.println(div(a, b));
		System.out.println(div(55, 0));
		System.out.println(div(0.0, 50));
		System.out.println(div(0.0, 0.0));

	}

	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	public static double div(double v1, double v2) {
		return div(v1, v2, 8);
	}

	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
