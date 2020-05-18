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
#### 具体操作
+ http://localhost:8080/login (zhangsan   123)
> 访问r1可以，访问r2被拦截
+ http://localhost:8080/login?logout

