package connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "test";
	String pw = "1234";
	
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 검색 실패");
			System.exit(0);
		}
		try {
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			System.err.println("데이터베이스 연결 실패");
			System.exit(0);
		}
	}
	
	public void insertUser() {
		
		getConn();
		String sql = "INSERT INTO users(user_id,user_name,user_pass,user_gender,user_email) values(?,?,?,?,?)";
		try {     // INSERT INTO 쿼리문을 작성하여 데이터를 넣을 컬럼을 선택합니다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 10);
			pstmt.setString(2, "김용식");
			pstmt.setString(3, "1234");
			pstmt.setString(4, "남");    // 여기서 숫자는 위에 작성한 쿼리문의 테이블 컬럼 순서대로입니다.
			pstmt.setString(5, "ys73@naver.com");
			
			int result = pstmt.executeUpdate();     
			if(result>0) {                           
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("등록이 실패하였습니다. 데이터를 확인해주세요.");
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//     // 실행이 끝났다면 무조건 DB연결도 끝내줍니다.
			
		}
		
	}
	public String getAllUsers() {
		getConn();
		String sql = "SELECT * FROM users";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("user_id");
				String name = rs.getString("user_name");
				String pass = rs.getString("user_pass");
				String gender = rs.getString("user_gender");
				String email = rs.getString("user_email");
				System.out.printf("%d %s %s %s %s",id,name,pass,gender,email);
				conn.close();
				return "%d %s %s %s %s".formatted(id,name,pass,gender,email);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//     // 실행이 끝났다면 무조건 DB연결도 끝내줍니다.
		}
		return "실패하듯?";
	}
}

