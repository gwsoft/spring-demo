package pl.particle.gwsoft.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCarRequest {
  
  @JsonProperty("car_style")
  private String style;
  
  @JsonProperty("car_make")
  private String make;
  
  @JsonProperty("car_color")
  private String color;
  
  @JsonProperty("car_model")
  private String model;
  
  @JsonProperty("car_mileage")
  private int mileage;

  @JsonProperty("car_condition")
  private String condition;
  
  @JsonProperty("car_production_year")
  private int productionYear;
  
  @JsonProperty("car_price")
  private double price;
  
}
