package io.hel.tx.startup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * hel
 * 2022/2/13 2:12 下午
 * description:
 */
@SuppressWarnings({"all"})
@SpringBootApplication(scanBasePackages = {"io.hel"})
@MapperScan(basePackages = {"io.hel.tx.mapper"})

public class TxServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(TxServiceApp.class, args);
    }
}
