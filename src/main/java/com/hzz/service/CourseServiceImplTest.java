package com.hzz.service;


import com.hzz.pojo.Course;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CourseServiceImplTest {


    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml",
                "spring/applicationContext-service.xml"});
    }

    @Test
    public void findById() throws Exception {

        CourseService courseService = (CourseService) applicationContext.getBean("courseServiceImpl");
        Course course = courseService.findById(1);
        System.out.println(course.toString());
    }

}
