package nth.reflect.all.feature.swing;

import java.util.List;

import nth.reflect.all.feature.AllFeatureColors;
import nth.reflect.all.feature.AllFeatureInfrastructureClasses;
import nth.reflect.all.feature.AllFeatureServiceClasses;
import nth.reflect.fw.gui.style.ReflectColors;
import nth.reflect.fw.ui.swing.ReflecttApplicationForSwing;

public class AllFeatureForSwing extends ReflecttApplicationForSwing {

	public static void main(String[] commandLineArguments) {
		launch();
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return AllFeatureServiceClasses.get();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return AllFeatureInfrastructureClasses.get();
	}

	@Override
	public ReflectColors getColors() {
		return AllFeatureColors.get();
	}

}
