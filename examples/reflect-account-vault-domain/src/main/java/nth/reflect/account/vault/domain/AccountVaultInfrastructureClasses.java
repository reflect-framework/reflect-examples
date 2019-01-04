package nth.reflect.account.vault.domain;

import java.util.ArrayList;
import java.util.Arrays;

import nth.reflect.account.vault.domain.account.AccountRepository;
import nth.reflect.infra.generic.xml.XmlConverter;

@SuppressWarnings("serial")
public class AccountVaultInfrastructureClasses extends ArrayList<Class<?>> {

	public AccountVaultInfrastructureClasses() {
		super(Arrays.asList(AccountRepository.class, XmlConverter.class));
	}
}
