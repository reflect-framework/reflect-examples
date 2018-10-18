package nth.reflect.web.shop.javafx;

import java.util.Arrays;
import java.util.List;

import com.acme.web.shop.email.EmailClient;
import com.acme.web.shop.payment.PaymentClient;
import com.acme.web.shop.product.ProductGenerator;
import com.acme.web.shop.product.ProductRepository;
import com.acme.web.shop.product.ProductService;
import com.acme.web.shop.shopingcart.ShoppingCartService;

import nth.reflect.fw.javafx.ReflectApplicationForJavaFX;
import nth.reflect.fw.layer5provider.reflection.behavior.description.Description;
import nth.reflect.fw.layer5provider.reflection.behavior.displayname.DisplayName;

@DisplayName(englishName= "ACME Web Shop")
@Description(englishDescription="ACME Web Shop for everything you need...")
public class WebShopForJavaFX extends ReflectApplicationForJavaFX {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public List<Class<?>> getServiceClasses() {
		return Arrays.asList(ProductService.class, ShoppingCartService.class);
	}

	@Override
	public List<Class<?>> getInfrastructureClasses() {
		return Arrays.asList(ProductRepository.class, ProductGenerator.class, EmailClient.class, PaymentClient.class);
	}

}
