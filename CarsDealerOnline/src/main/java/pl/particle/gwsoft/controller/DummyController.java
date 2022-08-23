package pl.particle.gwsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import pl.particle.gwsoft.response.DummyResponse;

@RestController
@RequestMapping("/dummy")
public class DummyController {

  class A {
    @JsonIgnore
    private int a1;
    
    @JsonProperty("A.a2")
    private String a2;
    
    public int getA1() {
      return a1;
    }

    public void setA1(int a1) {
      this.a1 = a1;
    }

    public String getA2() {
      return a2;
    }

    public void setA2(String a2) {
      this.a2 = a2;
    }

    public A (int a1, String a2) {
      this.a1 = a1;
      this.a2 = a2;
    }
  }
  
  @GetMapping("/example1")
  public DummyResponse getDummyResponse1() {
    
    DummyResponse dummyResponse = new DummyResponse(100, "This is a dummy text", false, null);
    return dummyResponse;
  }

  @GetMapping("/example2")
  public DummyResponse getDummyResponse2() {
    
    DummyResponse dummyResponse = new DummyResponse(101, "This is another dummy text", true, new A(30, "Hello!"));
    return dummyResponse;
  }

  @GetMapping("/example3")
  public DummyResponse getDummyResponse3() {
    A a = new A(55, A.class.getCanonicalName());
    
    DummyResponse dummyResponse = new DummyResponse(101, "This is another dummy text", true, a);
    return dummyResponse;
  }
}
