package mavenTest;

import java.sql.*;

public class TestDB {
    private static String url = "jdbc:mysql://localhost:3306/test?CharacterEncoding=utf-8";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static Connection con = null;
    private static String DriverClass = "com.mysql.jdbc.Driver";

    public static void getConnection(String url, String USERNAME, String PASSWORD) {
        try {
            Class.forName(DriverClass);
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void closeResource() {
        try {
            if (con != null) {
                con.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void handleDB(String SQL) {
        try {
            ps = con.prepareStatement(SQL);
            ps.executeUpdate(); //执行SQL语句
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void query(String SQL) {
        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; ++i) {
                System.out.print(rs.getMetaData().getColumnName(i) + ((i < columnCount)? "\t" : "\n"));
            }
            while (rs.next()) {
                for (int i = 1; i <= columnCount; ++i) {
                    System.out.print(rs.getString(i) + ((i < columnCount)? "\t" : "\n"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        getConnection(url, USERNAME, PASSWORD);
        query("select * from stu;");
        handleDB("update stu set phone='1111' where s_no = 3;");
        handleDB("update stu set phone='2222' where s_no = 5;");
        handleDB("delete from stu where s_no = 7;");
        query("select * from stu;");
        closeResource();
    }
}
