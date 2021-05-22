package com.annakhuseinova.springwsclient.soap;


import com.annakhuseinova.springwsclient.model.GetCourseDetailsRequest;
import com.annakhuseinova.springwsclient.model.GetCourseDetailsResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * WebServiceGatewaySupport is a base class that facilitates configuration of WebServiceTemplate
 * */
@Setter
@Getter
public class CourseClient extends WebServiceGatewaySupport {

    private String coursesUri;

    public GetCourseDetailsResponse getCourseDetails(GetCourseDetailsRequest request) {
        return (GetCourseDetailsResponse) getWebServiceTemplate().marshalSendAndReceive(coursesUri, request);
    }
}
