package nth.reflect.account.vault.domain;

import java.util.ArrayList;
import java.util.Arrays;

import nth.reflect.account.vault.domain.account.AccountService;
import nth.reflect.account.vault.domain.tag.TagService;
import nth.reflect.account.vault.domain.vault.VaultService;

@SuppressWarnings("serial")
public class AccountVaultServiceClasses extends ArrayList<Class<?>> {
	public AccountVaultServiceClasses() {
		super(Arrays.asList(VaultService.class, AccountService.class,TagService.class));
	}
}
