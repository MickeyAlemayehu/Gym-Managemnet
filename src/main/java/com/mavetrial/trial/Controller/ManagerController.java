package com.mavetrial.trial.Controller;

import  com.mavetrial.trial.Entity.Manager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ManagerController {
    // @GetMapping("/manager")
    // public ResponseEntity <Manager> getManager(){
    //     Manager manager = new Manager();
    //     return new ResponseEntity<> (manager,HttpStatus.OK);
    // } 
}
