package Mizut452.studyhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.prepost.PrePostInvocationAttributeFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class COde {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studyhistory";
        String user = "root";
        String password = "CEzKou254!";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String a = "SELECT * FROM userlist";
        System.out.println(a);
    }
}
