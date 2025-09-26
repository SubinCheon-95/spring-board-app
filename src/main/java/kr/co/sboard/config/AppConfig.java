package kr.co.sboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class AppConfig {

    @Bean
    public AppInfo getAppInfo() {
        return new AppInfo();
    }
}
