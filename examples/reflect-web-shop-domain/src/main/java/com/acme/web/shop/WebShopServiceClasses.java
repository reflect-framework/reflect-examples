package com.acme.web.shop;

import java.util.ArrayList;
import java.util.Arrays;

import com.acme.web.shop.product.ProductService;
import com.acme.web.shop.shopingcart.ShoppingCartService;

@SuppressWarnings("serial")
public class WebShopServiceClasses extends ArrayList<Class<?>> {
	public WebShopServiceClasses() {
		super(Arrays.asList(ProductService.class, ShoppingCartService.class));
	}
}
