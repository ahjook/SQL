/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ajocme_sd2082
 */
public class InsertwithConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println("Time Started: " + time1);
        try {
            for (int i = 1; i < 1001; i++) {
                System.out.println("Gwapa c ajoc");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kitty", "root", "");
                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "INSERT INTO `sql_test`(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES (" + i + "," + (i) + "," + (i + 1) + "," + (i + 2) + "," + (i + 3) + "," + (i + 4) + ")";
                stmt.executeUpdate(sql);
//                con.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println ("Time Ended: " + time2);

        System.out.println ("Total Time:" + (time2.getSecond() - time1.getSecond()));

    }
      
    }

//}
