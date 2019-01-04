package com.acme.web.shop;

import java.util.ArrayList;
import java.util.Arrays;

import com.acme.web.shop.email.EmailClient;
import com.acme.web.shop.payment.PaymentClient;
import com.acme.web.shop.product.ProductGenerator;
import com.acme.web.shop.product.ProductRepository;

@SuppressWarnings("serial")
public class WebShopInfrastructureClasses extends ArrayList<Class<?>> {
	public WebShopInfrastructureClasses() {
		super(Arrays.asList(ProductRepository.class, ProductGenerator.class, EmailClient.class, PaymentClient.class));
	}
}
