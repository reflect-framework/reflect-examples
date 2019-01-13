package nth.reflect.account.vault.javafx;

import java.util.List;

import nth.reflect.account.vault.domain.AccountVaultColors;
import nth.reflect.account.vault.domain.AccountVaultInfrastructureClasses;
import nth.reflect.account.vault.domain.AccountVaultServiceClasses;
import nth.reflect.fw.gui.style.ReflectColors;
import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;

@DisplayName(englishName="Account Vault")
public class AccountVaultForJavaFX extends ReflectApplicationForJavaFX {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public List<Class<?>> getServiceClasses() {
		return new AccountVaultServiceClasses();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return new AccountVaultInfrastructureClasses();
	}

	@Override
	public ReflectColors getColors() {
		return new AccountVaultColors();
	}

}
