package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnect {
    Connection con;
    public void connect()
    {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");                
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Student");    //Connecting database and this
            System.out.println("Connected Successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public void insert(int roll_no,String name)
    {
        try
        {
            PreparedStatement ps=con.prepareStatement("insert into details(roll_no,Name)" + "values(?,?)");
            ps.setInt(1, roll_no);
            ps.setString(2,name);
            if(ps.executeUpdate()>0)
                System.out.println("Record inserted successfully");
        
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    public void display(){
        try{
            PreparedStatement ps=con.prepareStatement("Select * from details");
            ResultSet rs=ps.executeQuery();
            System.out.println("==================================================");
            System.out.println("roll_no"+"\t"+"name");
            System.out.println("==================================================");
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        DbConnect ob=new DbConnect();
        ob.connect();
//      ob.insert(20,"Dakshina");
        ob.display();
    }

    void insert(int id, String name, String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}