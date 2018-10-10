package nth.reflect.all.feature.swing;

import java.util.Arrays;
import java.util.List;

import nth.reflect.example.domain.all.feature.AllFeatureSeviceObject;
import nth.reflect.fw.ui.swing.ReflecttApplicationForSwing;

public class AllFeatureForSwing extends ReflecttApplicationForSwing {

	public static void main(String[] commandLineArguments) {
		launch();
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return Arrays.asList(AllFeatureSeviceObject.class);
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return Arrays.asList();
	}

}
