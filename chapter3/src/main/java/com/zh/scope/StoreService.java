package com.zh.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * storeservice是单例的，shopingCart是会话作用域，只有用户访问时才会创建
 * 此时spring会创建一个代理
 * Created by zh on 2017-02-20.
 */
@Component
public class StoreService {

    private ShoppingCart shoppingCart;

    @Autowired
    @Scope(value = WebApplicationContext.SCOPE_SESSION,
    proxyMode = ScopedProxyMode.TARGET_CLASS)
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
