package pl.particle.gwsoft.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CarResponse {

  private long id;
  
  private String style;
  
  private String make;
  
  private String color;
  
  private int mileage;

  private String condition;
  
  private int productionYear;
  
  private double price;

}
