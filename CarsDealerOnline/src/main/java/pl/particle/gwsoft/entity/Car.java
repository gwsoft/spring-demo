package pl.particle.gwsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.particle.gwsoft.request.CreateCarRequest;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;
  
  @Column(name = "style")
  private String style;
  
  @Column(name = "make")
  private String make;
  
  @Column(name = "model")
  private String model;
  
  @Column(name = "color")
  private String color;
  
  @Column(name = "mileage")
  private int mileage;

  @Column(name = "`condition`")
  private String condition;
  
  @Column(name = "production_year")
  private int productionYear;
  
  @Column(name = "price")
  private double price;
  
  public Car(CreateCarRequest createCarRequest) {
    this.style = createCarRequest.getStyle();
    this.make = createCarRequest.getMake();
    this.model = createCarRequest.getModel();
    this.color = createCarRequest.getColor();
    this.mileage = createCarRequest.getMileage();
    this.condition = createCarRequest.getCondition();
    this.productionYear = createCarRequest.getProductionYear();
    this.price = createCarRequest.getPrice();
  }
}
