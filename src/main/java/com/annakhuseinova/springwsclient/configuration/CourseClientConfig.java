package com.annakhuseinova.springwsclient.configuration;

import com.annakhuseinova.springwsclient.soap.CourseClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CourseClientConfig {

    @Value("${courses.uri}")
    private String coursesUri;

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.annakhuseinova.springwsclient.model");
        return marshaller;
    }

    @Bean
    public CourseClient courseClient(Jaxb2Marshaller marshaller){
        CourseClient courseClient = new CourseClient();
        courseClient.setCoursesUri(coursesUri);
        courseClient.setMarshaller(marshaller);
        courseClient.setUnmarshaller(marshaller);
        return courseClient;
    }
}
