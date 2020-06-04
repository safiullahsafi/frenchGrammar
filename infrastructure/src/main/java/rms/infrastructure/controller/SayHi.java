package rms.infrastructure.controller;

import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
@Api(value = "hi")
public class SayHi {

    public SayHi() {
        super();
    }

    @GetMapping("hi")
    public String sayHi(){
        return "hi back";
    }

}
