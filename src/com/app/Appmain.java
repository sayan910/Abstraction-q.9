package com.app;
import java.util.Scanner;
import com.model.Hosteller;

public class Appmain {
	public static Hosteller getHostellerDetails() {
		int studentId=0;
		String name="Null";
		int departmentId=0;
		String gender="Null";
		String phone="Null";
		String hostelName="Null";
		int roomNo=0;
		Hosteller hosteller=new Hosteller(studentId,name, departmentId,gender,phone,hostelName,roomNo);
		return hosteller;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Id:");
		int studentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Student Name:");
		String studentname=sc.nextLine();
		System.out.println("Department Id:");
		int departmentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Gender:");
		String gender=sc.nextLine();
		System.out.println("Phone Number:");
		String phonenumber=sc.nextLine();
		System.out.println("Hostel Name:");
		String hostelname=sc.nextLine();
		System.out.println("Room Number:");
		int roomnumber=sc.nextInt();
		Hosteller hosteller =new Hosteller(studentid,studentname,departmentid,gender,phonenumber,hostelname,roomnumber);
		getHostellerDetails();
		System.out.println("Modify Room Number(Y/N");
		String modifyroomnumber=sc.nextLine();
		if(modifyroomnumber.equals("Y")) {
			System.out.println("New Room Number");
			int newroomnumber=sc.nextInt();
			sc.nextLine();
			hosteller.setRoomNumber(newroomnumber);
		}
		else if(modifyroomnumber.equals("N")) {
			hosteller.getRoomNumber();
		}
		System.out.println("Modify Phone Number(Y/N)");
		String modifyphonenumber=sc.nextLine();
		if(modifyphonenumber.equals("Y")) {
			System.out.println("New Phone Number");
			String newphonenumber=sc.nextLine();
			hosteller.setPhone(newphonenumber);
		}
		else if(modifyphonenumber.equals("N")) {
			hosteller.getPhone();
		}
		System.out.println("The Student Details");
		System.out.println(hosteller.getStudentId()+""+hosteller.getName()+""+hosteller.getDepartmentId()+""+hosteller.getGender()+""+hosteller.getPhone()+""+hosteller.getHostelName()+""+hosteller.getRoomNumber());
		

	}

}
