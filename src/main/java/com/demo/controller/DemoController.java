package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Utilisateur;

@RestController
public class DemoController {
@GetMapping("user")
public String getUser()
{
Utilisateur utilisateur =new Utilisateur("test", "testeur", "testing", 20);
return utilisateur.toString();

}
}
