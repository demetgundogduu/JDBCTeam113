import utilities.ResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query_7 {
    public static void main(String[] args) throws SQLException {

        //Database üzerinden doctor_shift tablosunda staff_id=2 olan doctorun sali gunu kac saat calistigini dgorulayiniz.
        Statement st = ResuableMethods.createStatement(ResuableMethods.getConnection());
       String query="SELECT  start_time,end_time FROM  heallife_hospitaltraining.doctor_shift WHERE  id=2 AND  day=Tuesday";
        ResultSet rs   = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt("start_time") +" " + rs.getInt("end_time"));

        }
        rs.close();
        st.close();

    }
}
