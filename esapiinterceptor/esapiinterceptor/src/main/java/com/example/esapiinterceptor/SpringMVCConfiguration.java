package com.example.esapiinterceptor;


import com.example.esapiinterceptor.Interceptors.APILoggingInterceptor;
import com.example.esapiinterceptor.Interceptors.LegacyIntercepotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apilogginginterceptor;

    @Autowired
    private LegacyIntercepotr legacyIntercepotr;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apilogginginterceptor);
        registry.addInterceptor(legacyIntercepotr);
    }
}
