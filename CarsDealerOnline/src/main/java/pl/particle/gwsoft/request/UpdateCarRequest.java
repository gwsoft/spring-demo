package pl.particle.gwsoft.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCarRequest {
  
  @JsonProperty("car_id")
  @NotNull(message = "Car Id is required")
  private Long id;
  
  @JsonProperty("car_style")
  private String style;
  
  @JsonProperty("car_make")
  private String make;
  
  @JsonProperty("car_color")
  @NotBlank(message = "Wymagane pole 'color'")
  private String color;
  
  @JsonProperty("car_model")
  private String model;
  
  @JsonProperty("car_mileage")
  //@NotBlank(message = "Wymagane pole 'mileage'")
  //Generuje błąd:
  //"message": "HV000030: No validator could be found for constraint 'javax.validation.constraints.NotBlank' validating type 'java.lang.Integer'. Check configuration for 'mileage'"
  private Integer mileage;

  @JsonProperty("car_condition")
  private String condition;
  
  @JsonProperty("car_production_year")
  private Integer productionYear;
  
  @JsonProperty("car_price")
  //@NotBlank(message = "Wymagane pole 'price'")
  //Generuje błąd:
  //"message": "HV000030: No validator could be found for constraint 'javax.validation.constraints.NotBlank' validating type 'java.lang.Double'. Check configuration for 'price'"
  private Double price;
  
}
