package Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
