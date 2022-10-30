package Mizut452.studyhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserListDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    UserListDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create() {
        SqlParameterSource param = new BeanPropertySqlParameterSource();
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("userlist");
        insert.execute(param);
    }

    List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
    List<UserList> userLists = result.stream()
            .map((Map<String, Object>) row) -> new UserList(
                    row.get("id").toString();
                    row.get("mailaddress").toString();
                    row.get("username").toString();
                    row.get("password").toString();
    .toList();

    return userLists;
    )

}
