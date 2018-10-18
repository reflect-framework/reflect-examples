package nth.reflect.all.feature.javafx;

import java.util.Arrays;
import java.util.List;

import nth.reflect.example.domain.all.feature.AllFeatureSeviceObject;
import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;

@DisplayName(englishName="Reflect for JavaFX Demo")
public class AllFeatureForJavaFX extends ReflectApplicationForJavaFX {

	
	public static void main(String[] args) {
		launch(args);
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
