/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lizardo
 */

@RestController
public class OperacionesBasicasController {
    
    
    @GetMapping("/suma")
    public int suma(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b){
        return a+b;
    }
    
    @GetMapping("/resta")
    public int resta(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b){
        return a-b;
    }
    
    @GetMapping("/multiplicacion")
    public int multiplicacion(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b){
        return a*b;
    }
    
    @GetMapping("/division")
    public int division(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b){
        return a/b;
    }
    
}
