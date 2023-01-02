package com.Assignment.springboot.Question9.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    
    @Autowired
    CalculatorService calc;
    
    //private RestTemplate restTemplate;    



   @RequestMapping("/add/{num1}/{num2}")
    public int add(@PathVariable("num1") int num1,@PathVariable("num2") int num2) {
        return calc.add(num1, num2);
    }
    @RequestMapping("/sub/{num1}/{num2}")
    public int sub(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2) {
        return calc.sub(num1, num2);
    }
    @RequestMapping("/mul/{num1}/{num2}")
    public int mul(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2) {
        return calc.mul(num1, num2);
    }
    @RequestMapping("/div/{num1}/{num2}")
    public int div(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2) {
        return calc.div(num1, num2);
    }
    @RequestMapping("/sqrt/{num1}/{num2}")
    public int sqrt(@PathVariable ("num1") int num1,@PathVariable ("num2") int num2) {
        return calc.sqrt(num1, num2);
    }
 
}