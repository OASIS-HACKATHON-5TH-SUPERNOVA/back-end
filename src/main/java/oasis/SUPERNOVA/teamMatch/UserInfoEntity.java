package oasis.SUPERNOVA.teamMatch;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoEntity {

    private int user_id;
    private String user_name;
    private String user_active_area;
    private String user_school;
    private String user_major;
    private UserCareer user_career;

    public UserInfoEntity() {
    }

    public UserInfoEntity(String user_active_area, String user_school, String user_major, UserCareer user_career) {
        this.user_active_area = user_active_area;
        this.user_school = user_school;
        this.user_major = user_major;
        this.user_career = user_career;
    }

    public UserInfoEntity(int user_id, String user_active_area, String user_school, String user_major, UserCareer user_career) {
        this.user_id = user_id;
        this.user_active_area = user_active_area;
        this.user_school = user_school;
        this.user_major = user_major;
        this.user_career = user_career;
    }
}
