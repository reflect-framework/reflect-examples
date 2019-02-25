package nth.reflect.web.shop.javafx;

import java.util.List;

import com.acme.web.shop.WebShopColors;
import com.acme.web.shop.WebShopInfrastructureClasses;
import com.acme.web.shop.WebShopServiceClasses;

import nth.reflect.fw.gui.style.ReflectColors;
import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.description.Description;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;

@DisplayName(englishName = "ACME Web Shop")
@Description(englishDescription = "ACME Web Shop for everything you need...")
public class WebShopForJavaFX extends ReflectApplicationForJavaFX {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return WebShopServiceClasses.get();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return WebShopInfrastructureClasses.get();
	}

	@Override
	public ReflectColors getColors() {
		return WebShopColors.get();
	}

}
