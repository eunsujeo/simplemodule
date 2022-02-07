package com.silverspoon8.modules.main;

import com.silverspoon8.modules.hello.HelloInterface;
import com.silverspoon8.modules.hello.HelloModules;
import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        HelloModules.doSomething();
        
        Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
        HelloInterface service = services.iterator().next();
        service.sayHello();
    }
}
