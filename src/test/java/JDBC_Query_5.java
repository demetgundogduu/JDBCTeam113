import utilities.ResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query_5 {
    public static void main(String[] args) throws SQLException {
        //2- Patients tablosundaki ismi 'a' ile baslayan hastalarin patient_name, age,
        // mobileno, email bilgilerini listeleyiniz.


       Statement st = ResuableMethods.createStatement(ResuableMethods.getConnection());
        String query="SELECT patient_name, age,mobileno, email FROM  heallife_hospitaltraining.patients WHERE patient_name LIKE 'a%';";
        ResultSet rs= st.executeQuery(query);
     while (rs.next()){
         System.out.println(rs.getString("patient_name")+"\n"+rs.getString("mobileno")+"\n"+rs.getString("email")+"\n"+rs.getInt("age"));

     }
        rs.close();
        st.close();


    }
}
