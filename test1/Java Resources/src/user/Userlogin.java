package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Userlogin {
	private Connection conn; // connection:db에접근하게 해주는 객체
	private PreparedStatement pstmt;
	private ResultSet rs;
	public Userlogin() { // 생성자 실행될때마다 자동으로 db연결이 이루어 질 수 있도록함
		try {
			String url = "jdbc:mysql://localhost:3306/1pmmidia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		    String id = "root";
		    String pwd = "7891";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
		} catch (Exception e) {
			e.printStackTrace(); // 오류가 무엇인지 출력
		}
		System.out.println("데이터베이스 연동성공!");
	}

	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword FROM 1pmmidia.user WHERE userID = ?";
		try {
			// pstmt : prepared statement 정해진 sql문장을 db에 삽입하는 형식으로 인스턴스가져
			pstmt = conn.prepareStatement(SQL);
			// sql인젝션 같은 해킹기법을 방어하는것... pstmt을 이용해 하나의 문장을 미리 준비해서(물음표사용)
			// 물음표해당하는 내용을 유저아이디로, 매개변수로 이용.. 1)존재하는지 2)비밀번호무엇인지
			pstmt.setString(1, userID);
			// rs:result set 에 결과보관
			rs = pstmt.executeQuery();
			System.out.println("쿼리문 실행 성공!");
			// 결과가 존재한다면 실행
			if (rs.next()) {
				// 패스워드 일치한다면 실행
				System.out.println("회원가입한 유저 존재!");
				if (rs.getString(1).equals(userPassword)) {
					System.out.println("로그인 성공!");
					return 1; // 라긴 성공
				} else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디가 없음 오류
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류를 의미
	}

	public int make(User user) {
		String SQL = "INSERT INTO USER VALUES (?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserTel());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // DB 오류
	}
}
