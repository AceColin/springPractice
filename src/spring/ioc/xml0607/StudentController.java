package spring.ioc.xml0607;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public void list() {
		
		List<Student> list = studentService.findAll();
		
		for (Student student : list) {
			System.out.println(String.format("%s %s %s %s %s", //%是占位符，s是数据类型
					student.getNumber(),student.getName(),student.getGender(),
					student.getAge(),student.getMajor()
			));
		}
	}
	
}
