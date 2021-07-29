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
        File file = new File("C:\\Users\\Mehdi\\IdeaProjects\\phase01\\src\\main\\java\\com\\internship\\phase01\\data\\EmployeeData.json");
        List<Employee> employee = objectMapper.readValue(file, new TypeReference<List<Employee>>(){});
        log.info(employee.toString());
        XmlMapper xmlMapper = new XmlMapper();
        //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        File file2 = new File("C:\\Users\\Mehdi\\IdeaProjects\\phase01\\src\\main\\java\\com\\internship.\\phase01\\data\\EmployeeData.xml");
        xmlMapper.writeValue(file2, employee);
        System.out.println("ok");
    }




}
