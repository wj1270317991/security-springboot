package com.wj.security.config;

import com.wj.security.model.UserDto;
import com.wj.security.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.wj.security.config
 * Created on 2020-02-24  17:48
 *
 * @author wangjun
 */
@Service("myUserDetailService")
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //登录账号
        System.out.println("username="+username);
        //根据账号去数据库查询...
        UserDto user = userDao.getUserByUsername(username);
        if(user == null){
            return null;
        }
        //查询用户权限
        List<String> permissions = userDao.findPermissionsByUserId(user.getId());
        String[] perarray = new String[permissions.size()];
        permissions.toArray(perarray);
        //这里暂时使用静态数据
        UserDetails userDetails = User.withUsername(user.getFullname()).password(user.getPassword()).authorities(perarray).build();
        return userDetails;

        //return User.withUsername("zhangsan").password("$2a$10$tpkKom/AuoYid8ouuBOHIOVPN0VkisC0VHuO2HH7H2B0UHr7xrmjq").authorities("p1").build();
    }


}
