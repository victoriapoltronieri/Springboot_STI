package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // o mesmo que @Component mas é melhor na leitura do código
public class StudentService {
    public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"Victoria",
				"victoria@gmail.com",
				LocalDate.of(2001, Month.JANUARY, 5),
				21 // Uma forma mais dinâmica seria subtrair o dia de hoje pelo dia do aniversário e assim obter a idade.
			)
		); // json array
	}
}
