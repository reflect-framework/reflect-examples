package nth.reflect.all.feature.commandline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nth.reflect.all.feature.commandline.dom.AllFeatureServiceObject;
import nth.reflect.fw.layer5provider.url.UrlProvider;
import nth.reflect.fw.layer5provider.url.application.ApplicationUrlProvider;
import nth.reflect.fw.layer5provider.url.classresource.ClassResourceUrlProvider;
import nth.reflect.fw.ui.commandline.ReflectApplicationForCommandLine;

public class AllFeatureForCommandLine extends
		ReflectApplicationForCommandLine {

	public static void main(String[] arguments) {
		launch(arguments);;
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return Arrays.asList(AllFeatureServiceObject.class);
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return new ArrayList<Class<?>>();
	}

	
	@Override
	public List<Class<? extends UrlProvider>> getUrlProviderClasses() {
		return Arrays.asList(ClassResourceUrlProvider.class, ApplicationUrlProvider.class);
	}


}
