package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");
    JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
     String query = "insert into Student(id,name,city) values(?, ?, ?)";
     int result = jdbcTemplate.update(query, 113, "Ram", "Noida");
     System.out.println("number of records insert:" + result);
    }
}