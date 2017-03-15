package com.atguigu.view.resolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.atguigu.view.view.XlsView;

public class XlsViewResolver implements ViewResolver{

    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        return new XlsView();
    }

}