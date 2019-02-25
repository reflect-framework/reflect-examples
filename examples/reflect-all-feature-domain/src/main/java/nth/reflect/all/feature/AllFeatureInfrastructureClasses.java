package nth.reflect.all.feature;

import java.util.Arrays;
import java.util.List;

import nth.reflect.all.feature.domain.TestRandomGenerator;

public class AllFeatureInfrastructureClasses {
	private static List<Class<?>> infrastructureClasses = Arrays.asList(TestRandomGenerator.class);

	public static List<Class<?>> get() {
		return infrastructureClasses;
	}
}
