package com.apress.springpersistence.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.SpringMusicApplication;
import com.apress.springpersistence.service.PersonRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringMusicApplication.class)
public class DependencyInjectionJUnitTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testPerson() {
        // insert test logic here
    }

}
