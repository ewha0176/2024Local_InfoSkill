package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartData {
    public static List<Map<String, Object>> getTop5MusicByAge(Connection conn, int age) throws SQLException {
        List<Map<String, Object>> top5List = new ArrayList<>();
        String query = "SELECT m.m_name, COUNT(p.m_no) AS listen_count " +
                       "FROM playlist p " +
                       "JOIN music m ON p.m_no = m.m_no " +
                       "JOIN user u ON p.u_no = u.u_no " +
                       "WHERE YEAR(u.birth) / 10 = ? " +
                       "GROUP BY p.m_no " +
                       "ORDER BY listen_count DESC " +
                       "LIMIT 5";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, age / 10);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Map<String, Object> musicData = new HashMap<>();
                musicData.put("m_name", rs.getString("m_name"));
                musicData.put("listen_count", rs.getInt("listen_count"));
                top5List.add(musicData);
            }
        }
        return top5List;
    }
}
