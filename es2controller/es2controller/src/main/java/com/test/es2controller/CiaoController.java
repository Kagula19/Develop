package com.test.es2controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class CiaoController {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")
    public Ciao ciao(@PathVariable String provincia, @RequestParam String nome){
        return new Ciao(nome, provincia);
    }
}
