package oasis.SUPERNOVA.login;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoginEntity {
    private int user_id;
    private String user_email;
    private String user_password;
    private String user_name;
    private String user_school;
    private String user_major;
    private int user_school_year;
    private String user_region;
    private Date user_birth;
    private String user_gender;

    public LoginEntity() {
    }

    public LoginEntity(String user_email, String user_password){
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public LoginEntity(String user_email, String user_password, String user_name,
                       String user_school, String user_major, int user_school_year, String user_region,
                       Date user_birth, String user_gender) {

        this.user_email = user_email;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_school = user_school;
        this.user_major = user_major;
        this.user_school_year = user_school_year;
        this.user_region = user_region;
        this.user_birth = user_birth;
        this.user_gender = user_gender;
    }

    public LoginEntity(int user_id, String user_email, String user_password, String user_name,
                       String user_school, String user_major, int user_school_year, String user_region,
                       Date user_birth, String user_gender) {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_school = user_school;
        this.user_major = user_major;
        this.user_school_year = user_school_year;
        this.user_region = user_region;
        this.user_birth = user_birth;
        this.user_gender = user_gender;
    }
}


