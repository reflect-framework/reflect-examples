package nth.reflect.all.feature;

import java.util.ArrayList;
import java.util.Arrays;

import nth.reflect.all.feature.domain.TestService;

@SuppressWarnings("serial")
public class AllFeatureServiceClasses extends ArrayList<Class<?>> {

	public AllFeatureServiceClasses() {
		super(Arrays.asList(TestService.class));
	}
	
	
}
