package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserMapper {

    @Select("select * from t_users")
    List<UserBean> findlist();

    @Insert("insert into t_users(name,info,sex) values(#{name},#{info},#{sex})")
    void addlist(UserBean userBean);

    @Delete("delete from t_users where id=#{value}")
    void delete(@RequestParam Integer id);

    @Select("select * from t_users where id=#{id}")
    UserBean queryUserById(Integer id);

    @Update("update t_users set name=#{name},info=#{info},sex=#{sex} where id=#{id}")
    void updateUserList(UserBean userBean);
}
