package oasis.SUPERNOVA.teamMatch;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecommendMemberSpec {

    private String recommend_member_name;
    private String recommend_member_region;
    private String recommend_member_school;
    private String recommend_member_major;
    private String userCareer;


    public RecommendMemberSpec() {
    }

    public RecommendMemberSpec(
            String recommend_member_name,
            String recommend_member_region,
            String recommend_member_school,
            String recommend_member_major,
            String userCareer) {

        this.recommend_member_name = recommend_member_name;
        this.recommend_member_region = recommend_member_region;
        this.recommend_member_school = recommend_member_school;
        this.recommend_member_major = recommend_member_major;
        this.userCareer = userCareer;
    }
}
