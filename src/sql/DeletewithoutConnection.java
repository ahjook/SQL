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
public class DeletewithoutConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println("Time Started: " + time1);
      
       for (int i = 0; i < 1000; i++) {
//           try {
               int id = 1;
//               Statement stmt = null;
//               Class.forName("com.mysql.jdbc.Driver");
//               java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kitty", "root", "");
//               stmt = (Statement) con.createStatement();
               String sql = "DELETE FROM `sql_test` WHERE id='" + id + "'";
//               stmt.executeUpdate(sql);
               id++;

//          ssssssss
       }
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println ("Time Ended: " + time2);

        System.out.println ("Total Time:" + (time2.getSecond() - time1.getSecond()));

    }
      
    }