package com.spartahw.hw2;

import com.spartahw.hw2.Service.PersonService;
import com.spartahw.hw2.domain.Person;
import com.spartahw.hw2.domain.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Hw2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}
	@Bean
	public CommandLineRunner demo(PersonRepository people, PersonService personService) {
		return (args) -> {
// 데이터 저장하기
			people.save(new Person("나나ㅇ유", "컴과",24));

			System.out.println("데이터 인쇄");
// 데이터 전부 조회하기
			List<Person> personList = people.findAll();
			for (int i=0; i<personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getMajor());
				System.out.println(person.getAge());
			}
		};
	}
}
