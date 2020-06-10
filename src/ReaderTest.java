/**
 * Title      : ReaderTest.java
 * Description: This class contains the definition of ReaderTest
 * Copyright  : Copyright (c) 2905-2017 All rights reserved
 * @author      Group 78
 * @version     1.8
 */
import java.util.*;
public class ReaderTest {
     public static void main(String args[]){
    	 Reader rd = new Reader();
    /*----------------movies.txt�ļ���ȡ����-------------------------
    	 ArrayList<String> filmList = rd.readMovieList();  
    	 for(String str : filmList)
    	 {
    		 System.out.println(str);
    	 }
    */
    /*---------------movieName_info.txt�ļ���ȡ����-------------------
   
    	 rd.readMovieInfo("KONG SKULL ISLAND");
    	 for(String s : rd.getFilmIntro())
    	 {
    		 if(s != null)
    		   System.out.println(s);
    	 }
    	// System.out.println(rd.getFilmIntro());
    	 System.out.println("price: " + rd.getPrice() + "$");
    	 System.out.println("Last Time: " + rd.getLastTime() + "min");
    */ 
    /*---------------screen n_x.txt�ļ���ȡ����------------------------
    	//-------screen1 �Ĳ���--------
    	 rd.readScreen(1, 1);
    	 for(int i = 0; i < 4; i++){
    		 for(int j = 0; j < 8; j++){
    			 System.out.print(Screen1.getScreen1()[i][j] + " ");
    		 }
    		 System.out.println();
    	 }
    	 System.out.println("screen 1_1 ʣ��Ʊ��: " + Screen1.ticketCount);*/
    	//------screen2 �Ĳ���---------
    /*	 rd.readScreen(2, 1, "KONG SKULL ISLAND");
    	 System.out.println("Screen 2: D: ");
    	 for(int i = 0; i < 8; i++)
    		 System.out.print(Screen2.getScreen2_D()[i] + " ");
    	 System.out.println();
    	 for(int i = 0; i < 3; i++){
    		 for(int j = 0; j < 6; j++)
    			 System.out.print(Screen2.getScreen2_rest()[i][j] + " ");
    		 System.out.println();
    	 }
    	 System.out.println("screen 2_1_KONG SKULL ISLAND ʣ��Ʊ��: " + Screen2.ticketCount);*/
    	 
  /*      //-------screen3 �Ĳ���--------
    	rd.readScreen(3, 1);
        System.out.println("Screen 3: E: ");
        for(int i = 0; i < 8; i++)
        	System.out.print(Screen3.getScreen3_E()[i] + " ");
        System.out.println();
        for(int i = 0; i < 4; i++){
        	for(int j = 0; j < 6; j++)
        		System.out.print(Screen3.getScreen3_rest()[i][j] + " ");
        		 System.out.println(); 
    	 }
        System.out.println("screen 3_1 ʣ��Ʊ��: " + Screen3.ticketCount);
     */
     /*--------------screen_schedule �ļ���ȡ����------------------------*/
    /*	 rd.readScreenSchedule();
    	 int i = 0;
    	 for(String filmName : Screen3.filmList)
    	 {
    		 System.out.println("filmName: " + filmName);
    		 for(String time : Screen3.startTime.get(i))
    			 System.out.println(time);
    		 i++;
    	 }
     */
     /*---------------readReport �ļ���ȡ����----------------------------*/
    	 ArrayList<Film> films = rd.readReport();
    	 for(Film film : films)
    	 {
    		 System.out.println("filmName: " + film.getFilmName());
    		 System.out.println("adult: " + film.getTotalAdultTicketNum());
    		 System.out.println("Child " + film.getTotalChildTicketNum());
    		 System.out.println("senior " + film.getTotalSeniorTicketNum());
    		 System.out.println("student: " + film.getTotalStudTicketNum());
    	 }
   }
     
}
