package nth.reflect.all.feature;

import nth.reflect.fw.gui.style.MaterialColorPalette;
import nth.reflect.fw.gui.style.ReflectColors;

public class AllFeatureColors {

	private static ReflectColors colors = new ReflectColors(MaterialColorPalette.purple700(),
			MaterialColorPalette.yellow700(), MaterialColorPalette.white());

	public static ReflectColors get() {
		return colors;
	}

}
