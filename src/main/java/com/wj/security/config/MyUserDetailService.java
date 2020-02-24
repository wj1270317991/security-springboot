package com.wj.security.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * com.wj.security.config
 * Created on 2020-02-24  17:48
 *
 * @author wangjun
 */
@Service("myUserDetailService")
public class MyUserDetailService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.withUsername("zhangsan").password("$2a$10$tpkKom/AuoYid8ouuBOHIOVPN0VkisC0VHuO2HH7H2B0UHr7xrmjq").authorities("p1").build();
    }


}
