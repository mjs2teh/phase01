package com.internship.phase01;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import com.internship.phase01.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Slf4j
@SpringBootApplication
public class Phase01Application {


    public static void main(String[] args) throws IOException {

        SpringApplication.run(Phase01Application.class, args);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> employee = objectMapper.readValue(new File("src/main/java/com/internship/phase01/data/EmployeeData.json"),
                new TypeReference<List<Employee>>(){});
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("src/main/java/com/internship/phase01/data/EmployeeData.xml"), employee);
        System.out.println("ok");
    }




}
