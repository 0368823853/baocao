package DemoApplication.demoaplicarion.Controller;

import DemoApplication.demoaplicarion.Model.Student;
import DemoApplication.demoaplicarion.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping(path = "/addstudent")
    public @ResponseBody String addStudent(@RequestParam String name, @RequestParam String email, @RequestParam String sdt, @RequestParam int age){
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setSdt(sdt);
        student.setAge(age);
        return "Đã lưu";
    }
    @GetMapping(path = "/student")
    public @ResponseBody Iterable<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
