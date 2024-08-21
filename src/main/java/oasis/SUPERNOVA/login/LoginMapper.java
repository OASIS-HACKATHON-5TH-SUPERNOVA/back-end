package oasis.SUPERNOVA.login;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("SELECT user_password FROM userinfo where user_email = #{user_email}")
    String findUserPassword(String user_email);

    @Insert("INSERT INTO userinfo (user_email, user_password, user_name, " +
            "user_school, user_major, user_school_year, user_region, user_birth, user_gender)\n" +
            "VALUES (#{user_email}, #{user_password}, #{user_name}, \" +\n" +
            "            \"#{user_school}, #{user_major}, #{user_school_year}, #{user_region}, #{user_birth}, #{user_gender})")
    void insertUserInfo(LoginEntity loginEntity);
}
