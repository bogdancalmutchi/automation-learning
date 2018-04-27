package com.autolearning;

import com.autolearning.config.CucumberConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = CucumberConfiguration.class)
@SpringBootTest
public class StepsContext {

}
