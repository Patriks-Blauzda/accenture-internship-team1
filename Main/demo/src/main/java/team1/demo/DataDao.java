package team1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DataDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Data data) {
        String sql = "INSERT INTO DATA(ievaditie_dati) VALUES(?)";
        jdbcTemplate.update(sql, data.getIevaditie_dati());
    }

    public List<Data> loadAll() {
        return jdbcTemplate.query("SELECT * FROM Dati", (resultSet, i) -> {
            return toData(resultSet);
        });
    }

    private Data toData(ResultSet resultSet) throws SQLException {
        Data data = new Data();
        data.setId(resultSet.getLong("Nr"));
        data.setIevaditie_dati(resultSet.getString("IEVADITIE_DATI"));
        return data;
    }
}
