package vvstudy;

public class Glyph {
	public int radius = 6;	
	public int radius1 = 6;


	void draw() {
		System.out.println("Glyph.draw()");
	}
	
	Glyph() {
		System.out.println("Glyph() before draw()");
		System.out.println(radius);
		draw();
		System.out.println("Glyph() after draw()");
	}
}
