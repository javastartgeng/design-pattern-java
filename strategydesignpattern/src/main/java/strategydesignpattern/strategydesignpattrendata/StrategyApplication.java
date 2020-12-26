package strategydesignpattern.strategydesignpattrendata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("strategydesignpattern.strategydesignpattrendata.mapper")
public class StrategyApplication {
    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class);
    }
}
