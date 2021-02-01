package mihalcin.enversrevinfo.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    void auditTest() {
        Person p = personRepository.findById(1L).get();
        p.setLastName("NoWay");
        personRepository.save(p);
    }

}