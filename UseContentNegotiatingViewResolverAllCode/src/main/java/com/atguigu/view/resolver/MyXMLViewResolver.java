package com.atguigu.view.resolver;

import java.util.Locale;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.xml.MarshallingView;
import com.atguigu.view.pojo.User;

public class MyXMLViewResolver implements ViewResolver {

    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        MarshallingView view = new MarshallingView();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(User.class);
        marshaller.setPackagesToScan("com.atguigu.view.pojo");
        view.setMarshaller(marshaller);
        return view;
    }

}