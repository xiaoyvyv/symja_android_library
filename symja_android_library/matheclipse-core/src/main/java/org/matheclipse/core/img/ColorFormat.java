package org.matheclipse.core.img;

import com.duy.awt.Color;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;

import ch.ethz.idsc.tensor.io.ImageFormat;

/**
 * mappings between {@link IAST}, {@link Color}, and 0xAA:RR:GG:BB integer
 * 
 * <p> 
 * functions are used in {@link ImageFormat}
 */
public enum ColorFormat {
	;
	/**
	 * there are only [0, 1, ..., 255] possible values for red, green, blue, and alpha. We preallocate instances of
	 * these scalars in a lookup table to save memory and possibly enhance execution time.
	 */
	private static final IExpr[] LOOKUP = new IExpr[256];
	static {
		for (int index = 0; index < 256; index++) {
			LOOKUP[index] = F.integer(index);
		}
	}
	// ---

	/**
	 * @param color
	 * @return vector with {@link IExpr} entries as {R, G, B, A}
	 */
	public static IAST toVector(Color color) {
		return F.List( //
				LOOKUP[color.getRed()], //
				LOOKUP[color.getGreen()], //
				LOOKUP[color.getBlue()], //
				LOOKUP[color.getAlpha()]);
	}

	/**
	 * @param argb
	 *            encoding color as 0xAA:RR:GG:BB
	 * @return vector with {@link IExpr} entries as {R, G, B, A}
	 */
	public static IAST toVector(int argb) {
		return toVector(new Color(argb, true));
	}

	/**
	 * @param vector
	 *            with {@link IExpr} entries as {R, G, B, A}
	 * @return encoding color as 0xAA:RR:GG:BB
	 * @throws Exception
	 *             if either color value is outside the allowed range [0, ..., 255]
	 */
	public static Color toColor(IAST vector) {
		Validate.checkSize(vector, 5);

		return new Color( //
				((IInteger) vector.arg1()).toInt(), //
				((IInteger) vector.arg2()).toInt(), //
				((IInteger) vector.arg3()).toInt(), //
				((IInteger) vector.arg4()).toInt());
	}

	/**
	 * @param vector
	 *            with {@link IExpr} entries as {R, G, B, A}
	 * @return int in hex 0xAA:RR:GG:BB
	 */
	public static int toInt(IAST vector) {
		return toColor(vector).getRGB();
	}
}
