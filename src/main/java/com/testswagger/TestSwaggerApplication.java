package com.testswagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;






@SpringBootApplication
@EnableSwagger2
public class TestSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSwaggerApplication.class, args);
	}
}

@RestController
@RequestMapping(value="/test")
class MessageRestController{
	 private static final Logger LOGGER = LoggerFactory.getLogger(MessageRestController.class);
		public MessageRestController(){}

	   @RequestMapping(value="/greeting/", method = RequestMethod.GET,produces = { "application/json"})
	    public String getMessageForMessageRestController() {
		   LOGGER.info("---------getMessageForMessageRestController------------------");
	       return "Test Swagger  ";
	    }
	   
	   @RequestMapping(value="/greeting1/", method = RequestMethod.GET,produces = { "application/json"})
	    public String getMessageForMessageRestControllerAnother() {
		   LOGGER.info("---------getMessageForMessageRestControllerAnother------------------");
	       return "Test Swagger 1 ";
	    }
}


