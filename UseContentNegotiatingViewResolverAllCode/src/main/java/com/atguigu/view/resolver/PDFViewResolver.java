package com.atguigu.view.resolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.atguigu.view.view.PDFView;

public class PDFViewResolver implements ViewResolver{

    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        return new PDFView();
    }

}