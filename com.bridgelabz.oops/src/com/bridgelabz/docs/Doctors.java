package com.bridgelabz.docs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.bridgelabz.util.Utility;
public class Doctors 
{
	public String name,specialization,availability;
	public int id;
	Utility u1=new Utility();
	Doctors doctorList=new Doctors();
	public Doctors()
	{
		System.out.println("Enter Doctors Details");
		System.out.print("Enter Name: ");
		this.name=u1.inputString();
		System.out.print("Enter Id: ");
		this.id=u1.inputInteger();
		System.out.print("Enter specialization: ");
		this.specialization=u1.inputString();
		System.out.print("Enter availability (1:AM   2:PM  3:both)");
		this.availability=u1.inputString();
	}//end of constructor
	//search for doctor by name.						
		public ArrayList<Doctors> searchDoctorName(ArrayList<Doctors> doctorList,String name)
		{
			ArrayList<Doctors> temp=new ArrayList<Doctors>();
			for(Doctors doctor:doctorList){
				if(doctor.getName().equals(name)){
					temp.add(doctor);
				}
			}
			return temp;
		}
		public String getName()
		{
			return name;
		}
		//search for doctor by Id.						
		public ArrayList<Doctors> searchDoctorId(ArrayList<Doctors>doctorList,int id)
		{
			ArrayList<Doctors> temp=new ArrayList<Doctors>();
			for(Doctors doctor:doctorList){
				if(doctor.getId()==id){
					temp.add(doctor);
				}
			}
			return temp;
		}
		public int getId()
		{
			return id;
		}
		//search for doctor by specialization.						
		public ArrayList<Doctors> searchDoctorSpecialization(ArrayList<Doctors> doctorList,String specialization)
		{
			ArrayList<Doctors> temp=new ArrayList<Doctors>();
			for(Doctors doctor:doctorList){
				if(doctor.getSpecialization().equals(specialization)){
					temp.add(doctor);
				}
			}
			return temp;
		}
		public String getSpecialization()
		{
			return specialization;
		}
		//search for doctor by Availability
		public ArrayList<Doctors> searchDoctorAvailability(ArrayList<Doctors> doctorList,String availability)
		{
			ArrayList<Doctors> tempList=new ArrayList<Doctors>();
			for(Doctors doctor:doctorList){
				if(doctor.getAvailability().equals(availability)){
					tempList.add(doctor);
				}
			}
			return tempList;
		}
		public String getAvailability()
		{
			return availability;
	   }

}
	