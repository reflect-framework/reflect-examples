package nth.reflect.web.shop.swing;

import java.util.List;

import com.acme.web.shop.WebShopColors;
import com.acme.web.shop.WebShopInfrastructureClasses;
import com.acme.web.shop.WebShopServiceClasses;

import nth.reflect.fw.gui.style.ReflectColors;
import nth.reflect.fw.layer5provider.reflection.behavior.description.Description;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;
import nth.reflect.fw.ui.swing.ReflecttApplicationForSwing;

@DisplayName(englishName = "ACME Web Shop")
@Description(englishDescription = "ACME Web Shop for everything you need...")
public class WebShopForSwing extends ReflecttApplicationForSwing {

	public static void main(String[] commandLineArguments) {
		launch();
	}

	@Override
	public List<Class<?>> getServiceClasses() {
		return new WebShopServiceClasses();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return new WebShopInfrastructureClasses();
	}

	@Override
	public ReflectColors getColors() {
		return new WebShopColors();
	}
}
