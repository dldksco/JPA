package hello_jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table("user") user라는 테이블에 나감
public class Member {
    @Id//pk를알려줌
    //@Column(name=”username”) 컬럼매핑
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
