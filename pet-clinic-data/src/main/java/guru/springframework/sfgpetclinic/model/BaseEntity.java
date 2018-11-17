package guru.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by jt on 7/18/18.
 */

/*
*
* @MappedSuperclass에 대한 내용
* 테이블과 매핑되지 않고 자식 클래스 엔티티의 매핑정보를 상속하기 위해 사용된다.
@MappedSupperclass로 지정한 클래스는 엔티티가 아니다,
이 클래스만 단독으로 사용할일은 거의 없기 때문에, 방어코드 차원에서 abstract 로 선언하여 사용하는 것이 실수를 줄일 수 있다.
*
* */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
