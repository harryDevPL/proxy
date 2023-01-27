package pl.wojcik.proxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Slf4j
@Component
@AllArgsConstructor
public class EmailService {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public void addEmail(String email) {
        try {
            entityManager.persist(new Email(email));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
