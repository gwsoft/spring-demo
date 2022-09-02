package pl.particle.gwsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.particle.gwsoft.entity.Car;
import pl.particle.gwsoft.repository.CarRepository;
import pl.particle.gwsoft.request.CreateCarRequest;

@Service
public class CarService {

  @Autowired
  CarRepository carRepository;
  
  public List<Car> getAllCars() {
    return carRepository.findAll();
  }
  
  public Car createCar(CreateCarRequest createCarRequest) {
    Car car = new Car(createCarRequest);
    car = carRepository.save(car);
    return car;
  }
}
