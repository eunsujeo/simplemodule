module hello.modules {
    exports com.silverspoon8.modules.hello;
    provides com.silverspoon8.modules.hello.HelloInterface with com.silverspoon8.modules.hello.HelloModules;
}