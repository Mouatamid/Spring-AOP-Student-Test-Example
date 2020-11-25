package org.mouatamid.main;

import org.mouatamid.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service = context.getBean("studentService",StudentService.class);
        service.getStudent().setAge(18);
        System.out.printf("Name : %s%n",service.getStudent().getName());
        System.out.printf("Id : %S%n",service.getStudent().getStudentId());
        System.out.printf("Age : %d%n", service.getStudent().getAge() );
        service.getStudent().toString();
        context.close();
    }
}
