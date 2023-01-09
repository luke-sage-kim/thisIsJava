package testPage666;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {// 수강생은 모든타입이 될수있다
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// Student와 Student를 상속받은 객체 course
	public static void registerCourseStudent(Course<? extends Student> course) {// 수강생은 student와 highstudent만 될수있다
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// Worker와 Worker의 상위 객체 course
	public static void registerCourseWorker(Course<? super Worker> course) {// 수강생은 worker와 person만 될 수 있다
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		// Course객체 생성
		// name=일반인과정, String 타입의 배열 길이 5 세팅
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));// 배열에 객체 삽입

		
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new HighStudent("중학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		workerCourse.add(new Worker("직장인"));
		workerCourse.add(new Worker("직장인"));
		workerCourse.add(new Worker("직장인"));
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		highStudentCourse.add(new HighStudent("고등학생"));
		highStudentCourse.add(new HighStudent("고등학생"));
		highStudentCourse.add(new HighStudent("고등학생"));
		highStudentCourse.add(new HighStudent("고등학생"));

		// <?>: 제한 없음. 모든 객체를 받는 메소드
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse); (x)
		// registerCourseStudent(workerCourse); (x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse); (x)
		// registerCourseWorker(highStudentCourse); (x)
	}
}
