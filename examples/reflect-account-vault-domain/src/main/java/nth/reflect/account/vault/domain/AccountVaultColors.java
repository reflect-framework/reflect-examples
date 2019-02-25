package nth.reflect.account.vault.domain;

import nth.reflect.fw.gui.style.MaterialColorPalette;
import nth.reflect.fw.gui.style.ReflectColors;

public class AccountVaultColors {

	private static ReflectColors colors = new ReflectColors(MaterialColorPalette.teal700(),
			MaterialColorPalette.orange500(), MaterialColorPalette.white());

	public static ReflectColors get() {
		return colors;
	}
}
