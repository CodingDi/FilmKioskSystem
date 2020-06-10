/**
 * Title      : Writer.java
 * Description: This class contains the definition of Writer
 * Copyright  : Copyright (c) 2905-2017 All rights reserved
 * @author      Group 78
 * @version     1.8
 */
import java.io.*;
import java.util.*;

public class Writer {
	public boolean deleteFile(String filmName, int screenNum, int startNo, int day)
	{
		String fileName = day + "_screen" + screenNum + "_" + filmName + "_" + startNo + ".txt";
		//String reportFile = day + "_statistic_report.txt"; 
		System.out.println(fileName);
		File file = new File(fileName);
		/*File repFile = new File(reportFile);
		if(repFile.exists())
		{
			repFile.delete();
		}*/
		if(file.exists())
		{
			return file.delete();
		}
		return false;	
	}
	
	public void writeScreen1(int no, String filmName, int day)
	{
		Screen1 s1 = new Screen1();
		String fileName = day + "_screen1" + "_" + filmName + "_" + no + ".txt";
    	File file = new File(fileName);
		try
    	 {
			if(file.exists() == false)
			 file.createNewFile();
    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    		 for(int i = 0; i < 4; i++)
    		 {
    			 String line = "";
    			 for(int j = 0; j < 8; j++)
    			 {
    				 line = line + s1.getScreen1_temp()[i][j] + "";
    			 }
    			 writer.write(line);
    			 if(i != 3)
    				 writer.write("\r\n");
    		 }
    		 writer.close();
    	 }catch(Exception e){e.printStackTrace();}
	}
	public void writeScreen2(int no, String filmName, int day)
	{
		Screen2 s2 = new Screen2();
		String fileName = day + "_screen2" + "_" + filmName + "_" + no + ".txt";
    	File file = new File(fileName);
		try
    	 {
			if(file.exists() == false)
			 file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    		 String line = "";
    		 for(int i = 0; i < 8; i++)
    			 line = line + s2.getScreen2_D_temp()[i] + "";
    		 writer.write(line + "\r\n");
    		 
    		for(int i = 0; i < 3; i++)
   		 {
    			 line = "";
   			 for(int j = 0; j < 6; j++)
   			 {
   				 line = line + s2.getScreen2_rest_temp()[i][j] + "";
   			 }
   			 writer.write(line);
   			 if(i != 2)     
   				 writer.write("\r\n");
   		 }
   		 writer.close();
    	 }catch(Exception e){e.printStackTrace();}
	}
	
	public void writeScreen3(int no, String filmName, int day)
	{
		Screen3 s3 = new Screen3();
		String fileName = day + "_screen3" + "_" + filmName + "_" + no + ".txt";
		File file = new File(fileName);
		  try
	    	{
			     if(file.exists() == false)
				 file.createNewFile();
	    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	    		 String line = "";
	    		 for(int i = 0; i < 8; i++)
	    			 line = line + s3.getScreen3_E_temp()[i] + "";
	    		 writer.write(line + "\r\n");
	    		 
	    		for(int i = 0; i < 4; i++)
    		 {
	    			 line = "";
    			 for(int j = 0; j < 6; j++)
    			 {
    				 line = line + s3.getScreen3_rest_temp()[i][j] + "";
    			 }
    			 writer.write(line);
    			 if(i != 3)     
    				 writer.write("\r\n");
    		 }
    		 writer.close();
	    	}catch(Exception e){e.printStackTrace();}
	}
	
	public void writeScreenSchdule(int screenNum, int day)
	{
		ArrayList<String> filmListTemp = null;
		ArrayList<ArrayList<String>> startTimeTemp = null;
		String fileName = "";
		switch(screenNum)
		{
		case 1: 
			fileName = day + "_screen1_schedule.txt";
			filmListTemp = Screen1.filmList;
			startTimeTemp = Screen1.startTime;
			break;
		case 2:
			fileName = day + "_screen2_schedule.txt";
			filmListTemp = Screen2.filmList;
			startTimeTemp = Screen2.startTime;
			break;
		case 3:
			fileName = day + "_screen3_schedule.txt";
			filmListTemp = Screen3.filmList;
			startTimeTemp = Screen3.startTime;
			break;
		}
		
		File file = new File(fileName);
		
		try
		{
			if(file.exists() == false)
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < filmListTemp.size(); i++)
			{
				writer.write(filmListTemp.get(i) + ",");
				for(int j = 0; j < startTimeTemp.get(i).size(); j++)
				{
					writer.write(startTimeTemp.get(i).get(j));
					if(j != startTimeTemp.get(i).size() - 1)
						writer.write(",");
				}
				if(i != filmListTemp.size() - 1)
					writer.write("\r\n");
			}
			writer.close();
		}catch(Exception ex){ex.printStackTrace();}
	}
	public boolean checkFileExist(String name)
	{
		String fileName = name + ".txt";
		File file = new File(fileName);
		if(file.exists())
			return true;
		return false;
	}
	public void writeReport(ArrayList<Film> films, int day)
	{
		String fileName = day + "_statistic_report.txt";
		File file = new File(fileName);
		
		try
		{
			if(file.exists() == false)
			{
				file.createNewFile();
			}
			   
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			int ticketsOneDay = 0;
			double salesOneDay = 0.0;
			for(Film film : films)
			{
				writer.write("Film name:" + film.getFilmName() + "\r\n");
				writer.write("Adult ticket count:" + film.getTotalAdultTicketNum() + "\r\n");
				writer.write("Adult total income:" + film.totalAdultPrice() + "\r\n");
				writer.write("Child ticket count:" + film.getTotalChildTicketNum() + "\r\n");
				writer.write("Child total income:" + film.totalChildPrice() + "\r\n");
				writer.write("Senior ticket count:" + film.getTotalSeniorTicketNum() + "\r\n");
				writer.write("Senior total income:" + film.totalSeniorPrice() + "\r\n");
				writer.write("Student ticket count:" + film.getTotalStudTicketNum() + "\r\n");
				writer.write("Student total income:" + film.totalStudPrice() + "\r\n");
				writer.write("Total tickets sold:" + film.getTotalTicketNum() + "\r\n");
				writer.write("Total price:" + film.totalPrice() + "\r\n");
				writer.write("-------------------------------------------------------------------\r\n");
				ticketsOneDay += film.getTotalTicketNum();
				salesOneDay += film.totalPrice();
				
			}
			writer.write("Today's total tickets sold:" + ticketsOneDay + "\r\n");
			writer.write("Today's total income:" + salesOneDay);
			writer.close();
		}catch(Exception ex){ex.printStackTrace();}
	}
	
	public void writeInfo(String name, ArrayList<String> list)
	{
		String fileName = name + ".txt";
		File file = new File(fileName);
		
		try
		{
			if(file.exists() == false)
			  file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(String buf : list)
			{
				writer.write(buf + "\r\n");
			}
			writer.close();
		}catch(Exception e){e.printStackTrace();}
	}
	
     public void writeScreen(int screenNum, int startNo, String filmName, int day)
     {
    	 String fileName = day + "_screen" + screenNum +"_" + filmName + "_" + startNo + ".txt";
     	 File file = new File(fileName);
     	 switch(screenNum)
     	 {
     	    case 1: 
     	    	 try
     	    	 {
     	    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     	    		 for(int i = 0; i < 4; i++)
     	    		 {
     	    			 String line = "";
     	    			 for(int j = 0; j < 8; j++)
     	    			 {
     	    				 line = line + Screen1.getScreen1()[i][j] + "";
     	    			 }
     	    			 writer.write(line);
     	    			 if(i != 3)
     	    				 writer.write("\r\n");
     	    		 }
     	    		 writer.close();
     	    	 }catch(Exception e){e.printStackTrace();}
     	    	 break;
     	    case 2:
     	    	try
     	    	{
     	    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     	    		 String line = "";
     	    		 for(int i = 0; i < 8; i++)
     	    			 line = line + Screen2.getScreen2_D()[i] + "";
     	    		 writer.write(line + "\r\n");
     	    		 
     	    		for(int i = 0; i < 3; i++)
    	    		 {
     	    			 line = "";
    	    			 for(int j = 0; j < 6; j++)
    	    			 {
    	    				 line = line + Screen2.getScreen2_rest()[i][j] + "";
    	    			 }
    	    			 writer.write(line);
    	    			 if(i != 2)     
    	    				 writer.write("\r\n");
    	    		 }
    	    		 writer.close();
     	    	}catch(Exception e){e.printStackTrace();}
     	    	break;
     	    case 3:
     	    	try
     	    	{
     	    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     	    		 String line = "";
     	    		 for(int i = 0; i < 8; i++)
     	    			 line = line + Screen3.getScreen3_E()[i] + "";
     	    		 writer.write(line + "\r\n");
     	    		 
     	    		for(int i = 0; i < 4; i++)
    	    		 {
     	    			 line = "";
    	    			 for(int j = 0; j < 6; j++)
    	    			 {
    	    				 line = line + Screen3.getScreen3_rest()[i][j] + "";
    	    			 }
    	    			 writer.write(line);
    	    			 if(i != 3)     
    	    				 writer.write("\r\n");
    	    		 }
    	    		 writer.close();
     	    	}catch(Exception e){e.printStackTrace();}
     	    	break;
     	    	}
     	 }
     
}
