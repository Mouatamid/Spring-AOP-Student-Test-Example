# Spring-AOP-Student-Test-Example

I am currently learning the **Spring Framework**, I created a small app example for the **Aspect Oriented Programming** concept.

### Annotations : ###
- **For model getters:** `src\main\java\org\mouatamid\annotation\ModelGet.java`
- **For model setters:** `src\main\java\org\mouatamid\annotation\ModelSet.java`
- **For service getters:** `src\main\java\org\mouatamid\annotation\ServiceGet.java`
- **For service setters:** `src\main\java\org\mouatamid\annotation\ServiceSet.java`

### Models : ###
- **Student model:** `src\main\java\model\Student.java`

### Services : ###
- **Student service:** `src\main\java\org\mouatamid\service\StudentService.java`

### Aspects : ###
- **Aspect for model actions:** `src\main\java\org\mouatamid\aspect\ModelAspect.java`
- **Aspect for service actions:** `src\main\java\org\mouatamid\aspect\ServiceAspect.java`

## Output:
```
18:01:28.312 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@1e643faf
18:01:28.749 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 5 bean definitions from class path resource [applicationContext.xml]
18:01:28.783 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.aop.config.internalAutoProxyCreator'
18:01:28.892 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'student'
18:01:28.948 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public java.lang.Object org.mouatamid.aspect.ModelAspect.aroundAspectMethod(org.aspectj.lang.ProceedingJoinPoint)
18:01:28.950 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ModelAspect.beforeGetAspect(org.aspectj.lang.JoinPoint)
18:01:28.951 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ModelAspect.beforeSetAspect(org.aspectj.lang.JoinPoint)
18:01:28.951 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ModelAspect.afterGetAspect()
18:01:28.952 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ModelAspect.afterSetAspect()
18:01:28.954 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ServiceAspect.beforeGetAspect(org.aspectj.lang.JoinPoint)
18:01:28.957 [main] DEBUG org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory - Found AspectJ method: public void org.mouatamid.aspect.ServiceAspect.afterSetAspect(org.aspectj.lang.JoinPoint)
18:01:29.362 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'studentService'
18:01:29.388 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'modelAspect'
18:01:29.389 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'serviceAspect'
Before service getters aspect...Method executed : execution(Student org.mouatamid.service.StudentService.getStudent())
Before model setters aspect...Method executed : execution(void org.mouatamid.model.Student.setAge(int))...Arguments passed : [18]
After model setters aspect
Before service getters aspect...Method executed : execution(Student org.mouatamid.service.StudentService.getStudent())
Before model getters aspect...Method executed : execution(String org.mouatamid.model.Student.getName())
After model getters aspect
Name : Imad
Before service getters aspect...Method executed : execution(Student org.mouatamid.service.StudentService.getStudent())
Before model getters aspect...Method executed : execution(String org.mouatamid.model.Student.getStudentId())
After model getters aspect
Id : Q33546
Before service getters aspect...Method executed : execution(Student org.mouatamid.service.StudentService.getStudent())
Before model getters aspect...Method executed : execution(int org.mouatamid.model.Student.getAge())
After model getters aspect
Age : 18
Before service getters aspect...Method executed : execution(Student org.mouatamid.service.StudentService.getStudent())
Around advice...
toString() : This is for around advice toString() : name : Imad - age : 18 - Id : Q33546
18:01:29.423 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Closing org.springframework.context.support.ClassPathXmlApplicationContext@1e643faf, started on Wed Nov 25 18:01:28 WEST 2020

Process finished with exit code 0
```
