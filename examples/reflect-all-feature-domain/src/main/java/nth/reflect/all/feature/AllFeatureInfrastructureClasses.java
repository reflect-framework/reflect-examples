package nth.reflect.all.feature;

import java.util.ArrayList;

import nth.reflect.all.feature.domain.TestRandomGenerator;

@SuppressWarnings("serial")
public class AllFeatureInfrastructureClasses extends ArrayList<Class<?>> {
	public AllFeatureInfrastructureClasses() {
		add(TestRandomGenerator.class);
	}
}
