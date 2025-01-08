package com.ra.controller;

import com.ra.model.Student;
import com.ra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public String index(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "students";
    }
    @GetMapping("/add")
    public String add(Model model,Student student){
        model.addAttribute("student",student);
        return "add-student";
    }
    @PostMapping("/add")
    public String create(@ModelAttribute Student student){
        if(studentService.create(student)){
            return "redirect:/students";
        }
       return "redirect:/students/add?err";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id,Model model){

        // gọi service tìm ve ban ghi theo id
        // chuyen sang view edit de hien thi
        // tam
        model.addAttribute("student",new Student());
        return "edit-student";
    }
    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute Student student){
        // goi den service de thuc hien cap nhat
        // chuyen sang trang danh sach
        return "redirect:/students";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        // goi den service de thuc xoa
        // chuyen sang trang danh sach
        return "redirect:/students";
    }
}
