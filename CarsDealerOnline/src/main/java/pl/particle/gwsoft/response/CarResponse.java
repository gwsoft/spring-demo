package pl.particle.gwsoft.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import pl.particle.gwsoft.entity.Car;

@Getter
@Setter
public class CarResponse {

  @JsonProperty("car_id")
  private long id;
  
  @JsonProperty("car_style")
  private String style;
  
  @JsonProperty("car_make")
  private String make;
  
  @JsonProperty("car_color")
  private String color;
  
  @JsonProperty("car_mileage")
  private int mileage;

  @JsonProperty("car_condition")
  private String condition;
  
  @JsonProperty("car_production_year")
  private int productionYear;
  
  @JsonProperty("car_price")
  private double price;
  
  public CarResponse(Car car) {
    this.id = car.getId();
    this.style = car.getStyle();
    this.make = car.getMake();
    this.color = car.getColor();
    this.mileage = car.getMileage();
    this.condition = car.getCondition();
    this.productionYear = car.getProductionYear();
    this.price = car.getPrice();
  }

}
