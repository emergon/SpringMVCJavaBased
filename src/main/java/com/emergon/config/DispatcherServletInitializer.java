package com.emergon.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class [] servletSpecificClasses = {MyWebAppConfig.class};
        return servletSpecificClasses;
    }

    @Override
    protected String[] getServletMappings() {
        String [] urlMappings = {"/"};
        return urlMappings;
    }

   
}
