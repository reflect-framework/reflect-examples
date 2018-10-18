package nth.reflect.account.vault.javafx;

import java.util.Arrays;
import java.util.List;

import nth.reflect.example.domain.account.AccountRepository;
import nth.reflect.example.domain.account.AccountService;
import nth.reflect.example.domain.tag.TagService;
import nth.reflect.example.domain.vault.VaultService;
import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;
import nth.reflect.infra.generic.xml.XmlConverter;

@DisplayName(englishName="Account Vault")
public class AccountVaultForJavaFX extends ReflectApplicationForJavaFX {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public List<Class<?>> getServiceClasses() {
		return Arrays.asList(VaultService.class, AccountService.class,TagService.class);
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return Arrays.asList(AccountRepository.class, XmlConverter.class);
	}

}
