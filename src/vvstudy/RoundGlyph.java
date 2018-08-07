package vvstudy;

public class RoundGlyph extends Glyph {
	public int radius = 1;

	public static void main(String[] args) {
		new RoundGlyph(5);

	}

	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(). radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(). radius = " + radius1);
	}
}
