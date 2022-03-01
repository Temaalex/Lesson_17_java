package ru.bse71.homewoerk17.students;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student(15, "Tema", "LearnUn");

        //в json
        objectMapper.writeValue(new File("target/Student.json"), student);

        //в String
        String studentAsString = objectMapper.writeValueAsString(student);
        System.out.println(studentAsString);
    }


}
