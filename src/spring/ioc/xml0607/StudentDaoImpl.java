package spring.ioc.xml0607;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class StudentDaoImpl implements StudentDao {
	
	@Override
	public List<Student> queryAll() {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"张三",Gender.Male,20,"JAVA"));
		list.add(new Student(2,"胖妞",Gender.Female,18,"JAVA"));
		list.add(new Student(3,"黑蛋",Gender.Male,21,"JAVA"));
		
		return list;
	}

}
