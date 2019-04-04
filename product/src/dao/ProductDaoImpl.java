package dao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.util.StringUtils;

/**
 * The Class ProductDaoImpl.
 * 
 * 
 */
public class ProductDaoImpl {
	/** The data source. */
	private DataSource dataSource;
	/** The jdbc template object. */
	private JdbcTemplate jdbcTemplate;

	/**
	 * Sets the data source.
	 * 
	 * @param dataSource the new data source
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<String[]> getCourseNotes(HttpServletRequest request, String studentid,String studentname,String studentemail,String studentaddress,String pincode,String studentmobile) {
		System.out.println("getCourseNotes for studentinstanceid:" + jdbcTemplate);
		String sql = "INSERT INTO student VALUES(?,?,?,?,?,?)";
		List<String[]> list = new ArrayList<String[]>();
		int rowSet = jdbcTemplate.update(sql, new Object[] { studentid ,studentname,studentemail,studentaddress,pincode,studentmobile});
		/*while (rowSet.next()) {
			String[] notes = new String[4];
			notes[0] = rowSet.getString("studentaddress");
			
			System.out.println(notes[0]);
			list.add(notes);
		}*/
		return list;
	}
	
	public static void main(String args[])
	{
		System.out.println("test");
		
	}

}
