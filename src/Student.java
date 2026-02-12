import java.sql.*;

public class Student {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Project",
                "root",
                "Sit-Aiml@008"
        );

        int rool_no = 3;
        String Tname = "Team-3";

        String sql = "INSERT INTO Seminor (num, name) VALUES (?, ?)";

        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1, rool_no);
        st.setString(2, Tname);

        int ans = st.executeUpdate();

        System.out.println(ans + " row(s) affected");

        con.close();
    }
}
