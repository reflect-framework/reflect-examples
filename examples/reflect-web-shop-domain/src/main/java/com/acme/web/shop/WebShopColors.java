package com.acme.web.shop;

import nth.reflect.fw.gui.style.MaterialColorPalette;
import nth.reflect.fw.gui.style.ReflectColors;

public class WebShopColors {

	private static ReflectColors colors;

	static {
		colors = new ReflectColors(MaterialColorPalette.orange700(), MaterialColorPalette.lightBlue500(),
				MaterialColorPalette.white());
	}

	public static ReflectColors get() {
		return colors;
	}

}
