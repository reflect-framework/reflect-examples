package nth.reflect.all.feature;

import java.util.Arrays;
import java.util.List;

import nth.reflect.all.feature.domain.TestService;

public class AllFeatureServiceClasses {

	private static List<Class<?>> serviceClasses = Arrays.asList(TestService.class);

	public static List<Class<?>> get() {
		return serviceClasses;
	}
}
