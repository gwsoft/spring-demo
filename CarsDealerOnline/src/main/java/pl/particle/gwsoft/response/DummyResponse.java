package pl.particle.gwsoft.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DummyResponse {

  @JsonProperty("dummyId")
  private long id;
  
  private String text;
  
  @JsonIgnore
  private boolean condition;
  
  private Object object;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isCondition() {
    return condition;
  }

  public void setCondition(boolean condition) {
    this.condition = condition;
  }

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public DummyResponse(long id, String text, boolean condition, Object object) {
    this.id = id;
    this.text = text;
    this.condition = condition;
    this.object = object;
  }
  
}
