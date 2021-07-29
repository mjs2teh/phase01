package com.internship.phase01.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
    private String token;
    private String country;
    private String location;
    private int lng;
    private int lat;
    private String dob;
    private int gender;
    private int userType;
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private Boolean enablefollowme;
    private Boolean sendmenotifications;
    private Boolean sendTextmessages;
    private Boolean enabletagging;
    private String createdAt;
    private String updatedAt;
    private Double livelng;
    private Double livelat;
    private String liveLocation;
    private int creditBalance;
    private int myCash;

    public Employee(){
        super();
    }
    public Employee(int id, String name, String email, String password, String about, String token,
                    String country, String location, int lng, int lat, String dob, int gender, int userType,
                    int userStatus, String profilePicture, String coverPicture, Boolean enablefollowme,
                    Boolean sendmenotifications, Boolean sendTextmessages, Boolean enabletagging,
                    String createdAt, String updatedAt, Double livelng, Double livelat, String liveLocation,
                    int creditBalance, int myCash) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.about = about;
        this.token = token;
        this.country = country;
        this.location = location;
        this.lng = lng;
        this.lat = lat;
        this.dob = dob;
        this.gender = gender;
        this.userType = userType;
        this.userStatus = userStatus;
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.enablefollowme = enablefollowme;
        this.sendmenotifications = sendmenotifications;
        this.sendTextmessages = sendTextmessages;
        this.enabletagging = enabletagging;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.livelng = livelng;
        this.livelat = livelat;
        this.liveLocation = liveLocation;
        this.creditBalance = creditBalance;
        this.myCash = myCash;
    }

//    @PostConstruct
//    public void json2xml() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("src/main/java/com/internship/phase01/com.internship.phase01.data/EmployeeData.json");
//        List<Employee> employee= objectMapper.readValue(file,new TypeReference<List<Employee>>(){});
//        log.info(employee.toString());
//    }
}
