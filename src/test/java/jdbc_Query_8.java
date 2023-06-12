import utilities.ResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Query_8 {
    public static void main(String[] args) throws SQLException {


         //Database üzerinden appointment_payment tablosunda odeme turu olarak "offline" secenl hasta
        // id'lerinin (1,2,3,16,17,18,20,21,24,25,31) oldugunu dogrulayiniz.


        Statement st = ResuableMethods.createStatement(ResuableMethods.getConnection());
        String query="SELECT appointment_id ,payment_type FROM heallife_hospitaltraining.appointment_payment WHERE payment_type ='Offline'";

        ResultSet rs   = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt("appointment_id") +" " + rs.getString("payment_type"));

        }








    }
}
