/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lizardo
 */

@RestController
public class HelloWorldController {
    
    @GetMapping("/helloworld")
    public String helloworld(){
        return ("Hello world!!!");
    }
    
}
