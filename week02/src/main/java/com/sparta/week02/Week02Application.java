package com.sparta.week02;

import com.sparta.week02.Service.CourseService;
import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}
	// Week02Application.java 의 main 함수 아래에 붙여주세요.
	@Bean
	public CommandLineRunner demo(CourseRepository repository, CourseService courseService) {
		return (args) -> {
// 데이터 저장하기
			repository.save(new Course("다들 간 아이유 콘서트", "나유진만 못감"));

			System.out.println("데이터 인쇄");
// 데이터 전부 조회하기
			List<Course> courseList = repository.findAll();
			for (int i=0; i<courseList.size(); i++) {
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}
			Course new_course = new Course("엔시티 콘서트 3일전에 코로나걸린", "난나유진");
			courseService.update(1L, new_course);
			courseList = repository.findAll();
			for (int i=0; i<courseList.size(); i++) {
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}
// 데이터 하나 조회하기
			Course course = repository.findById(1L).orElseThrow(
					() -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
			);
		};
	}
}
