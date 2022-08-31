package pl.particle.gwsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private long id;
  
  @Column(name = "style")
  private String style;
  
  @Column(name = "make")
  private String make;
  
  @Column(name = "color")
  private String color;
  
  @Column(name = "mileage")
  private int mileage;

  @Column(name = "condition")
  private String condition;
  
  @Column(name = "production_year")
  private int productionYear;
  
  @Column(name = "price")
  private double price;
}
