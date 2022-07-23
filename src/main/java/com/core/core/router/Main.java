package com.core.core.router;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class Main {

    @GetMapping(value="/hello")
    //@RequestMapping(value="/",method=RequestMethod.GET)
    public String hello(){
        return "HELLO!!";
    }
}

