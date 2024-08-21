package oasis.SUPERNOVA.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oasis.SUPERNOVA.CheckSuccess;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class LoginController {
    /*
    1. `POST /api/login` - 이메일, 비밀번호를 통한 로그인
2. `POST /api/emailAuth` - 이메일 인증
3. `POST /api/createMemberInfo` - 회원정보 기입

     */
    private final LoginService loginService;
    private final LoginMapper loginMapper;


    @PostMapping("/login")
    public ResponseEntity<CheckSuccess> login(@RequestBody LoginEntity loginRequest) {
        log.info("Login request: {}", loginRequest);

        CheckSuccess response = loginService.loginAuth(loginRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/createMemberInfo")
    public ResponseEntity<CheckSuccess> signUp(@RequestBody LoginEntity loginRequest) {

        log.info("createMemberInfo");
        log.info("loginRequest: {}", loginRequest.getUser_email());

        LoginEntity loginEntity = new LoginEntity(
                loginRequest.getUser_email(),
                loginRequest.getUser_password(),
                loginRequest.getUser_name(),
                loginRequest.getUser_school(),
                loginRequest.getUser_major(),
                loginRequest.getUser_school_year(),
                loginRequest.getUser_region(),
                loginRequest.getUser_birth(),
                loginRequest.getUser_gender()
        );

        loginMapper.insertUserInfo(loginEntity);
        CheckSuccess response = new CheckSuccess(true);
        return ResponseEntity.ok(response);
    }

}
