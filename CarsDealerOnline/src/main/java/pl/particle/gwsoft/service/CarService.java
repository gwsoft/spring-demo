package pl.particle.gwsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.particle.gwsoft.entity.Car;
import pl.particle.gwsoft.repository.CarRepository;
import pl.particle.gwsoft.request.CreateCarRequest;
import pl.particle.gwsoft.request.UpdateCarRequest;

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
  
  public Car updateCar(UpdateCarRequest updateCarRequest) {
    Car car = carRepository.findById(updateCarRequest.getId()).get();
    
    // color, mileage, price
    if (updateCarRequest.getColor() != null &&
        !updateCarRequest.getColor().isEmpty()) {
      car.setColor(updateCarRequest.getColor());
    }
    if (updateCarRequest.getMileage() != null) {
      car.setMileage(updateCarRequest.getMileage());
    }
    if (updateCarRequest.getPrice() != null) {
      car.setPrice(updateCarRequest.getPrice());
    }
    
    car = carRepository.save(car);
    
    return car;
  }
  
  public String deleteCar(long id) {
    carRepository.deleteById(id);
    return "Samochód usunięty";
  }
}
