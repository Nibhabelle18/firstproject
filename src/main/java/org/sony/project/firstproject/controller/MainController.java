package org.sony.project.firstproject.controller;

import org.sony.project.firstproject.dao.StudentDAO;
import org.sony.project.firstproject.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/c1")
public class MainController {
    @Autowired
    StudentDAO obj;
    @GetMapping("/msg")
    public ResponseEntity<String> f1(){
        try{
           return new ResponseEntity<String>("welcome to rest application", HttpStatus.OK);
        }
        catch(Exception e){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/msg1")
    public ResponseEntity<List<StudentEntity>> f2(){
        try{
            return new ResponseEntity<List<StudentEntity>>(obj.findAll(), HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/msg2")
    public ResponseEntity<String> f3(@RequestBody StudentEntity s){
        try{
            obj.save(s);
            return new ResponseEntity<>("inserted", HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
