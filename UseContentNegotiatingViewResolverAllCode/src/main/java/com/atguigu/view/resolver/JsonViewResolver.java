package com.atguigu.view.resolver;

import java.util.Locale;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class JsonViewResolver implements ViewResolver{
    //JsonView 实现类比较多,直接使用就可以了
	/*
	 * com.alibaba.fastjson.support.spring.FastJsonJsonView
	 * org.springframework.web.servlet.view.json.MappingJackson2JsonView
	 */
    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }

}