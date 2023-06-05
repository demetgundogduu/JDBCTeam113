import utilities.ResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query_6 {
    public static void main(String[] args) throws SQLException {
     //3- visitors_book tablosundan purpose bilgisi 'Inguiry' olan ziyaretcilerin isimlerini ters sirali listeleyiniz.

        Statement st= ResuableMethods.createStatement(ResuableMethods.getConnection());
        String query="SELECT name FROM heallife_hospitaltraining.visitors_book WHERE purpose='Inquiry' ORDER BY name DESC;";

        ResultSet rs = st.executeQuery(query);
        while (rs.next()){

            System.out.println(rs.getString("name"));



        }
        rs.close();
        st.close();
    }
}
