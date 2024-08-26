package oasis.SUPERNOVA.teamMatch;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oasis.SUPERNOVA.CareerWorries.PostEntity;
import oasis.SUPERNOVA.CheckSuccess;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/teamMatch")
public class UserCareerController {
    /*
        1. `POST /api/teamMatch/createProfile` - 자신의 프로필 입력
        2. `GET /api/teamMatch/showRecommendMember` - AI 기반 자신에게 부합하는 팀원 추천
        3. `POST /api/teamMatch/suggestMember/{닉네임}` - 팀원 제안 신청
     */
    private final UserInfoEntity userInfoEntity;

    @PostMapping("/createProfile")

    //public ResponseEntity<CheckSuccess> createProfile(@RequestBody UserInfoEntity userInfoEntity) {
    public UserInfoEntity createProfile(@RequestBody UserInfoEntity userInfoEntity) {

        log.info(userInfoEntity.getUser_name().toString());




        CheckSuccess response = new CheckSuccess(true);
        //
        // return ResponseEntity.ok(response);
        return userInfoEntity;
    }


}
