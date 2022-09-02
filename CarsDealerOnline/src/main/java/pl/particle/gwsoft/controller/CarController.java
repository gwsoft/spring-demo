package pl.particle.gwsoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.particle.gwsoft.entity.Car;
import pl.particle.gwsoft.request.CreateCarRequest;
import pl.particle.gwsoft.response.CarResponse;
import pl.particle.gwsoft.service.CarService;

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
  
  @GetMapping("/getSample")
  public CarResponse getCar() {
    Car car = new Car();
    car.setId(111);
    car.setStyle("hatchback");
    car.setColor("silver");
    car.setModel("");
    car.setMake("Volvo");
    car.setMileage(10000);
    car.setCondition("used");
    car.setProductionYear(2015);
    car.setPrice(45000.0);

    CarResponse carResponse = new CarResponse(car);
    return carResponse;
  }
  
  @Autowired
  CarService carService;
  
  @GetMapping("/getAll")
  public List<CarResponse> getAllCars() {
    List<Car> carList = carService.getAllCars();
    List<CarResponse> carResponseList = new ArrayList<CarResponse>();
    
    carList.stream().forEach(car -> {
      carResponseList.add(new CarResponse(car));
    });
    
    return carResponseList;
  }
  
  @PostMapping("/create")
  public CarResponse createCar(@Valid @RequestBody CreateCarRequest createCarRequest) {
    Car car = carService.createCar(createCarRequest);
    return new CarResponse(car);
  }
}
