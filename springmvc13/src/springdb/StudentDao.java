package springdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate template;

	public int addstudent(Student std) {
		int rows;
		String sql = "insert into student values(?,?,?)";
		Object args[] = {std.getRegno(),std.getStdname(),std.getMarks()};
		rows = template.update(sql, args);
		return rows;
	}
	
	public List<Student> getStudents(){
		String qry = "select * from student";
		List<Student> list = template.query(qry,new BeanPropertyRowMapper<Student>(Student.class));
		return list;
	}
	
	public int updateStudent(Student std) {
		String qry = "update student set stdname = ?,marks=? where regno=?";
		Object args[] = {std.getStdname(),std.getMarks(),std.getRegno()};
		int rows = template.update(qry, args);
		return rows;
	}
	
	public int deleteStudent(int regno) {
		int rows = 0;
		String qry = "delete from student where regno=?";
		Object args[] = {regno};
		rows = template.update(qry, args);
		return rows;
	}
}
