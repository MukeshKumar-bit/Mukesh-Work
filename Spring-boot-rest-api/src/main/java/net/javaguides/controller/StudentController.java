package net.javaguides.controller;

import net.javaguides.bean.Student;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        Student student=new Student(
                1,
                "Mukesh",
                "Kumar"
        );
return student;
    }
@GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> student=new ArrayList<>();
        student.add(new Student(1,"mukesh","kumar"));
        student.add(new Student(2,"rakesh","kumar"));
        student.add(new Student(3,"omkar","kumar"));
        student.add(new Student(4,"prakash","pandey"));
        student.add(new Student(5,"saket","Kumar"));
        return student;

    }
    @GetMapping("/students/{id}")
    public Student getStudentPathVariable(@PathVariable int id){
        return new Student(id, "mukesh","Pandey");
    }
    @GetMapping("student/{id}/{firstName}/{lastName}")
    public Student getStudentPath(@PathVariable int id,
                                  @PathVariable String firstName,
                                  @PathVariable String lastName){
        return new Student(id,firstName,lastName);
    }
   @GetMapping("/student1/{studentId}/{firstName}/{secondName}")
    public Student getStudentDetail(
            @PathVariable("studentId") int studentId,
            @PathVariable("firstName") String firstName,
            @PathVariable("secondName") String secondName) {

        return new Student(studentId, firstName, secondName);
    }
    //http://localhost:student2/query?id=1
    @GetMapping("/student2/query")
    public Student getStudentRequestParam(@RequestParam int id){
        Student student = new Student(id, "mukesh", "Kumar");
        return student;
    }
    //http://localhost:student2/query?id=1&firstName=mukesh&secondName=Kumar
    @GetMapping("/student3/query")
public Student getstudentrequest(@RequestParam int id,
                                 @RequestParam String firstName,
                                 @RequestParam String secondName){
        return new Student(id,"firstName","secondName");
}
}
