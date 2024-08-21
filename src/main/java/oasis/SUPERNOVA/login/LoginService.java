package oasis.SUPERNOVA.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oasis.SUPERNOVA.CheckSuccess;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoginService {

    private final LoginMapper loginMapper;

    public CheckSuccess loginAuth(LoginEntity loginRequest){

        log.info(loginRequest.getUser_email());
        log.info(loginRequest.getUser_password());
        String findPassword = loginMapper.findUserPassword(loginRequest.getUser_email());

        if(findPassword != null && findPassword.equals(loginRequest.getUser_password()) ){
            return new CheckSuccess(true);
        }else {
            return new CheckSuccess(false);
        }

    }
}
