package nth.reflect.web.shop.vaadin;

import java.util.List;

import com.acme.web.shop.WebShopInfrastructureClasses;
import com.acme.web.shop.WebShopServiceClasses;
import com.vaadin.flow.router.Route;

import nth.reflect.ui.vaadin.ReflectApplicationForVaadin14;

@Route("")
public class ReflectWebShopForVaadin extends ReflectApplicationForVaadin14 {

	private static final long serialVersionUID = 6772233296199079883L;

	@Override
	public List<Class<?>> getServiceClasses() {
		return WebShopServiceClasses.get();
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return WebShopInfrastructureClasses.get();
	}

//	@Override
//	public ReflectColors getColors() {
//		return WebShopColors.get();
//	}
}
