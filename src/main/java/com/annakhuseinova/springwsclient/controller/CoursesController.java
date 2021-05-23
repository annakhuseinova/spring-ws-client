package com.annakhuseinova.springwsclient.controller;

import com.annakhuseinova.springwsclient.model.GetCourseDetailsResponse;
import com.annakhuseinova.springwsclient.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CoursesController {

    private final CourseService courseService;

    @GetMapping("/v0/course/details/{id}")
    public GetCourseDetailsResponse getCourseDetails(@PathVariable("id") int courseId){
        return courseService.getCourseDetails(courseId);
    }
}
