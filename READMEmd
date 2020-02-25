### spring-boot 集成 security
+ SecurityConfig 主要配置
+ MyUserDetailService 扩展 UserDetailsService
```java
@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }
```    
