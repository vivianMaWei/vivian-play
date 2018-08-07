package vvstudy;

public class Triangle {
	public static void main(String[] args) {

		int[] a = { 1, 2, 0 };
		Triangle t = new Triangle();
		System.out.println(t.triangleTest(a));

	}

	public String triangleTest(int[] a) {
		if (a == null)
			return null;

		if (a[0] + a[1] > a[2] && a[1] + a[2] > a[0] && a[0] + a[2] > a[1])
			return "this is a triangle";
		else

			return "this is not a triangle";

	}
}
