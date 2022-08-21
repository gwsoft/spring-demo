package pl.particle.gwsoft.response;

public class CarResponse {

  private long id;
  
  private String style;
  
  private String make;
  
  private String color;
  
  private int mileage;

  private String condition;
  
  private int productionYear;
  
  private double price;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public int getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(int productionYear) {
    this.productionYear = productionYear;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public CarResponse(long id, String style, String make, String color, int mileage, String condition,
      int productionYear, double price) {
    this.id = id;
    this.style = style;
    this.make = make;
    this.color = color;
    this.mileage = mileage;
    this.condition = condition;
    this.productionYear = productionYear;
    this.price = price;
  }
  
}
