package nth.reflect.all.feature.javafx;

import java.util.List;

import nth.reflect.all.feature.AllFeatureColors;
import nth.reflect.all.feature.AllFeatureInfrastructureClasses;
import nth.reflect.all.feature.AllFeatureServiceClasses;
import nth.reflect.fw.gui.style.ReflectColors;
import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;

@DisplayName(englishName="Reflect for JavaFX Demo")
public class AllFeatureForJavaFX extends ReflectApplicationForJavaFX {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public List<Class<?>> getServiceClasses() {
		return new AllFeatureServiceClasses();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return new AllFeatureInfrastructureClasses();
	}

	@Override
	public ReflectColors getColors() {
		return new AllFeatureColors();
	}

}
