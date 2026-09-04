/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act1;

import java.sql.SQLException;

public class Act1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException 
    {    
     MyCRUD c1 = new MyCRUD();
     c1.myconnect();
     
     c1.mygetall();
    }
}
