package pl.particle.gwsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.particle.gwsoft.response.CarResponse;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @GetMapping("/dummy")
  public String getDummyCar() {
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
  
  @GetMapping("/get")
  public CarResponse getCar() {
    CarResponse carResponse = new CarResponse(1, "hatchback", "Volvo", "silver", 10000, "used", 2015, 45000.0);
    return carResponse;
  }
}
