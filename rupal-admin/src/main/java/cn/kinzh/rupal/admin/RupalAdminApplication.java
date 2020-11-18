package cn.kinzh.rupal.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.kinzh.rupal.admin.mapper")
public class RupalAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RupalAdminApplication.class, args);
    }

}
