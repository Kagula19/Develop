package com.example.es3controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3")

public class CiaoController {
    @Autowired
    CiaoRepository ciaoRepository;

    @GetMapping("/ciao")
    public Iterable<CiaoEntity>getCiaoId(){
        return ciaoRepository.findAll();
    }

}
