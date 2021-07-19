package mavenTest;

public class classwork {
    public static void main(String[] args) {
        TestDB.getConnection("jdbc:mysql://localhost:3306/classwork2?CharacterEncoding=utf-8", "root", "123456");
        /*TestDB.handleDB("CREATE TABLE teacher(t_no INT(6) NOT NULL PRIMARY KEY auto_increment,name VARCHAR(12),degree VARCHAR(12),age VARCHAR(3),address VARCHAR(12));");
        TestDB.handleDB("CREATE TABLE student(s_no INT(6) NOT NULL PRIMARY KEY auto_increment,name VARCHAR(12),degree VARCHAR(12),age VARCHAR(3),score DOUBLE(6, 1),t_no int(4),FOREIGN KEY(t_no) REFERENCES teacher(t_no));");

        TestDB.handleDB("INSERT into teacher (name, age, address) VALUES ('风太郎', '17', 'tokyo');");
        TestDB.handleDB("INSERT into teacher (name, age, address) VALUES ('水太郎', '18', 'shibuya');");
        TestDB.handleDB("INSERT into teacher (name, age, address) VALUES ('火太郎', '19', 'oosaka');");

        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('一花', '中专', '17', 40.5, 1);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('二乃', '大专', '17', 56.4, 2);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('三玖', '本科', '17', 87.4, 3);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('四叶', '中专', '17', 81.6, 3);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('五月', '大专', '17', 68.1, 3);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('张三', '本科', '17', 98.5, 2);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('李四', '中专', '17', 66.5, 2);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('王五', '大专', '17', 48.1, 1);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('aaa', '本科', '17', 69.4, 1);");
        TestDB.handleDB("INSERT into student (name, degree, age, score, t_no) VALUES ('bbb', '本科', '17', 84.3, 1);");*/

        TestDB.query("SELECT s.degree as '学历', AVG(s.score) as '平均分', SUM(s.score) as '总分' from student s GROUP BY s.degree;");
        TestDB.query("SELECT t.name as '教师姓名', AVG(s.score) as '平均分', MAX(s.score) as '最高分', MIN(s.score) as '最低分' from student s, teacher t WHERE s.t_no = t.t_no GROUP BY t.name;");
        TestDB.closeResource();
    }
}