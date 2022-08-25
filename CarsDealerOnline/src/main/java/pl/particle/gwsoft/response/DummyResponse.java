package pl.particle.gwsoft.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DummyResponse {

  @JsonProperty("dummyId")
  private long id;
  
  private String text;
  
  @JsonIgnore
  private boolean condition;
  
  private Object object;

}
