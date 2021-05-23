package com.annakhuseinova.springwsclient.service;

import com.annakhuseinova.springwsclient.model.GetCourseDetailsRequest;
import com.annakhuseinova.springwsclient.model.GetCourseDetailsResponse;
import com.annakhuseinova.springwsclient.soap.CourseClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseClient courseClient;

    public GetCourseDetailsResponse getCourseDetails(int courseId){
        return courseClient.getCourseDetails(createGetCourseDetailsRequest(courseId));
    }

    private GetCourseDetailsRequest createGetCourseDetailsRequest(int courseId){
        GetCourseDetailsRequest request = new GetCourseDetailsRequest();
        request.setId(courseId);
        return request;
    }
}
