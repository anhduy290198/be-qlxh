package vn.com.duy.exportmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExportManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExportManagementApplication.class, args);
    }
}
