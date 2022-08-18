package pl.particle.gwsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @GetMapping("/dummy")
  public String getCar() {
    return "dummy car";
  }
  
  @Value("${app.name}")
  private String appName;
  
  @Value("${app.author:Grzegorz Wieczerzak}")
  private String appAuthor;
  
  @GetMapping("/appInfo")
  public String getAppInfo() {
    return "Welcome in " + appName + "<br>" + "author: " + appAuthor;
  }
}
