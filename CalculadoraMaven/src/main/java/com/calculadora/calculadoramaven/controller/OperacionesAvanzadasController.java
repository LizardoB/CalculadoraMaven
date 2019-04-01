/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.calculadoramaven.controller;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lizardo
 */

@RestController
public class OperacionesAvanzadasController {
    
    @GetMapping("/factorial")
    public BigInteger factoria(@RequestParam(name = "a", required = true) int a){
        
        BigInteger fact = new BigInteger("1");
      
        for (int i = 2; i <= a; i++) {
        fact = fact.multiply(BigInteger.valueOf(i)); 
        }
        return fact;
    }
    
    @GetMapping("/cuadrado")
    public int cuadrado(@RequestParam(name = "a", required = true) int a){
        
        return (int)Math.pow(a, 2);
        
    }
    
    @GetMapping("/potencia")
    public int potencia(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b){
        
        return (int) Math.pow(a, b);
        
    }
    
    @GetMapping("/valorabsoluto")
    public int valorabsoluto(@RequestParam(name = "a", required = true) int a){
        
        return Math.abs(a);
        
    }
    
    @GetMapping("/raiz")
    public int raiz(@RequestParam(name = "a", required = true) int a){
        
        return (int)Math.sqrt(a);
        
    }
    
    
}
