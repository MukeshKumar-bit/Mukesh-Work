
package net.javaguides.controller;

import net.javaguides.bean.Student;
import org.springframework.boot.servlet.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    //http://localhost:8080/student
    @GetMapping
    public ResponseEntity<Student> getStudent(){
        Student student=new Student(
                1,
                "Mukesh",
                "Kumar"
        );
return ResponseEntity.ok().header("custom-name","mukesh").body(student);
    }
@GetMapping("/student")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> student=new ArrayList<>();
        student.add(new Student(1,"mukesh","kumar"));
        student.add(new Student(2,"rakesh","kumar"));
        student.add(new Student(3,"omkar","kumar"));
        student.add(new Student(4,"prakash","pandey"));
        student.add(new Student(5,"saket","Kumar"));
        return ResponseEntity.ok(student);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentPathVariable(@PathVariable int id){
       Student student=new Student(id, "mukesh","Pandey");
       return ResponseEntity.ok(student);
    }
    /*@GetMapping("/{id}/{firstName}/{lastName}")
    public ResponseEntity<Student> getStudentPath(@PathVariable int id,
                                  @PathVariable String firstName,
                                  @PathVariable String lastName){
       Student student = new Student(id,firstName,lastName);
       return ResponseEntity.ok(student);
    }*/
   @GetMapping("/{studentId}/{firstName}/{secondName}")
    public ResponseEntity<Student> getStudentDetail(
            @PathVariable("studentId") int studentId,
            @PathVariable("firstName") String firstName,
            @PathVariable("secondName") String secondName) {

         Student student =new Student(studentId, firstName, secondName);
         return ResponseEntity.ok(student);
    }
    /*//http://localhost:student2/query?id=1
    @GetMapping("/query")
    public ResponseEntity<Student> getStudentRequestParam(@RequestParam int id){
        Student student = new Student(id, "mukesh", "Kumar");
        return ResponseEntity.ok(student);
    }*/
    //http://localhost:student2/query?id=1&firstName=mukesh&secondName=Kumar
    @GetMapping("/query")
public ResponseEntity<Student> getstudentrequest(@RequestParam int id,
                                 @RequestParam String firstName,
                                 @RequestParam String secondName){
        Student student =new Student(id,"firstName","secondName");
        return ResponseEntity.ok(student);
}
//Spring boot Rest api that handles HTTP Post Request
@PostMapping("/create")
//@ResponseStatus(HttpStatus.CREATED)
public ResponseEntity<Student> createStudent(@RequestBody Student student){
    System.out.println(student.getId());
    System.out.println(student.getFirstName());
    System.out.println(student.getSecondName());
    return new ResponseEntity<>(student,HttpStatus.CREATED);
}
//Spring boot Rest Api that handle Http put request-updating existing resource
    @PutMapping("/{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getSecondName());
        return ResponseEntity.ok(student) ;
    }
    //Spring boot Rest Api that handle Http delete existing resource
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Student deleted successfully");
    }

}

