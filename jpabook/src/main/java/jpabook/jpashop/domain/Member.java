package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Member {
  @Id
  @GeneratedValue
  @Column(name="MEMBER_ID")
//Setter를 함부로 쓴다면 아무데서나 setting 할 수 있으니 추적하기가 어려워 유지보수성이 떨어짐
  //가급적이면 생성자에서 세팅
  private Long id;
  private String name;
  private String city;
  private String street;
  private String zipcode;

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public String getZipcode() {
    return zipcode;
  }
}
