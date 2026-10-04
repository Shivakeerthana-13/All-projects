package Soacourse12.example.course_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Soacourse12.example.course_service.entity.Course;
import Soacourse12.example.course_service.repository.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course getCourseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }
}