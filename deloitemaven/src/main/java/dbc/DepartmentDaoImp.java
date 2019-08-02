package dbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value = "dao")
public class DepartmentDaoImp {
	@Autowired
	private JdbcTemplate template;

	public int addDepartment(Department dept) {
		int rows;
		String sql = "insert into dept values(?,?,?)";
		Object args[] = {dept.getDeptno(),dept.getDname(),dept.getLoc()};
		rows = template.update(sql, args);
		return rows;
	}
	
	public List<Department> getDepartments() {
		String qry = "select * from dept";
		List<Department> list = template.query(qry, new BeanPropertyRowMapper<Department>(Department.class));
		return list;
	}
	
	public int deleteDepartment(int deptno) {
		int rows = 0;
		String qry = "delete from dept where deptno=?";
		Object args[] = {deptno};
		rows = template.update(qry, args);
		return rows;
	}
}
