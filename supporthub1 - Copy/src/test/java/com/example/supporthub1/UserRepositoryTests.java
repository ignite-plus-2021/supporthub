package com.example.supporthub1;

import com.example.supporthub1.model.User;
import com.example.supporthub1.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user=new User();
        user.setFirstName("maahi");
        user.setLastName("Vaspula");
        user.setPassword("maahi@007");
        user.setEmailId("vaspularuchi@gmail.com");
        user.setPhoneNo(9878978);


        User savedUser=repository.save(user);

        User existUser=entityManager.find(User.class,savedUser.getId());
        assertThat(existUser.getEmailId()).isEqualTo(user.getEmailId());
    }

}
