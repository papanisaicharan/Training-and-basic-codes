package day5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;

import oracle.jdbc.driver.OracleDriver;

public class TestDb {
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("connection successfull");
//		String qry = "insert into student values(123,'saicharan',99)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(qry);
//		System.out.println("executed successfully");
		boolean loop = true;
		while(loop) {
			try {
				System.out.println("enter a i((insert) ,s(retreive all details) or u(update)");
				char p = br.readLine().toLowerCase().charAt(0);
				switch(p) {
					case 'u':
						String query1 = "update student set stdname = ?,marks=? where regno = ?";
						PreparedStatement pst1 = conn.prepareStatement(query1);
						System.out.println("please enter regno of student :");
						int regNo1 = Integer.parseInt(br.readLine());
						System.out.println("please enter new name,marks of student :");
						String stdName1 = br.readLine();
						if(isNumeric(stdName1)) {
							throw new Exception();
						}
						int marks1 = Integer.parseInt(br.readLine());
						pst1.setInt(3, regNo1);
						pst1.setString(1, stdName1);
						pst1.setInt(2, marks1);
						int rows1 = pst1.executeUpdate();
						if(rows1 > 0)
							System.out.println("updated successfully");
						else {
							System.out.println("failed..! sorry");
						}
						break;
					case 'i':
						System.out.println("please enter regno,name,marks of student :");
						int regNo = Integer.parseInt(br.readLine());
						String stdName = br.readLine();
						if(isNumeric(stdName)) {
							throw new Exception();
						}
						int marks = Integer.parseInt(br.readLine());
						String query = "insert into student values(?,?,?)";
						PreparedStatement pst = conn.prepareStatement(query);
						pst.setInt(1, regNo);
						pst.setString(2, stdName);
						pst.setInt(3, marks);
						int rows = pst.executeUpdate();
						if(rows > 0)
							System.out.println("inserted successfully");
						else {
							System.out.println("failed..! sorry");
						}
						break;
					case 's':
						String query3 = "select * from student";
						PreparedStatement ps3 = conn.prepareStatement(query3);
						System.out.println("-------------------------------------------------------------------------------");
						ResultSet rs = ps3.executeQuery();
						ResultSetMetaData md = rs.getMetaData();
						for(int i = 1; i <= md.getColumnCount();i++) {
							System.out.print("|"+md.getColumnName(i));
						}
						System.out.print("|\n----------------------------------------------------------------------------------\n");
						while(rs.next()) {
							System.out.println("|"+rs.getInt(1)+"  |"+rs.getString(2)+"  |"+rs.getInt(3)+"  |");
						}
						break;
					case 'a':
						System.out.println("all student records will be deleted, Is it okay for u? if okay press y");
						char decision = br.readLine().toLowerCase().charAt(0);
						if(decision != 'y'){
							break;
						}
						String query4 = "delete student";
						PreparedStatement ps4 = conn.prepareStatement(query4);
						ps4.executeUpdate();
						String query5 = "alter table student add Dob date not null";
						PreparedStatement ps5= conn.prepareStatement(query5);
						ps5.executeUpdate();
						System.out.println("altered successfully, cannot run any other options u will be exited");
						
						String query6 = "insert into student values(?,?,?,?)";
						PreparedStatement pst6 = conn.prepareStatement(query6);
						System.out.println("please enter regno,name,marks of student :");
						int regNo6 = Integer.parseInt(br.readLine());
						String stdName6 = br.readLine();
						if(isNumeric(stdName6)) {
							throw new Exception();
						}
						int marks6 = Integer.parseInt(br.readLine());
						System.out.println("please enter in dd-mmm-yyyy format only");
						String date = br.readLine();
						String[] dates = date.split("-");
						
						// creating a Calendar object 
				        Calendar c1 = Calendar.getInstance(); 
				  
				        // set Month 
				        // MONTH starts with 0 i.e. ( 0 - Jan) 
				        c1.set(Calendar.MONTH, Integer.parseInt(dates[1])); 
				  
				        // set Date 
				        c1.set(Calendar.DATE, Integer.parseInt(dates[0])); 
				  
				        // set Year 
				        c1.set(Calendar.YEAR, Integer.parseInt(dates[2])); 
				  
				        // creating a date object with specified time. 
				        Date dateOne = c1.getTime(); 

						java.sql.Date sqldt = new java.sql.Date(dateOne.getTime());
						pst6.setInt(1, regNo6);
						pst6.setString(2, stdName6);
						pst6.setInt(3, marks6);
						pst6.setDate(4, sqldt);
						int rows6 = pst6.executeUpdate();
						if(rows6 > 0)
							System.out.println("inserted successfully");
						else {
							System.out.println("failed..! sorry");
						}
						//System.exit(0);
						break;
					default:
						System.out.println("enter right character");
				}
				
				System.out.println("if u want to continue, enter y");
				char c = br.readLine().toLowerCase().charAt(0);
				if(c != 'y') {
					loop = false;
				}
			}catch(NumberFormatException | SQLException e) {
				System.out.println("Wrong format");
			}catch(InputMismatchException e) {
				System.out.println("Wrong format");
			}catch (IOException e) {
				System.out.println("Something went wrong..");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Wrong format");
			}
		}
		System.out.println("Thank u for operations.");
		conn.close();
	}

}
