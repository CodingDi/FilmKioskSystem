/**
 * Title      : ReadStudID.java
 * Description: This class contains the definition of ReadStudID
 * Copyright  : Copyright (c) 2905-2017 All rights reserved
 * @author      Group 78
 * @version     1.8
 */
import java.util.*;
import java.io.*;

public class ReadStudID {
    private ArrayList<String> studIdList;
    
    public ArrayList<String> getID()
    {
    	return studIdList;
    }
    public void readStudID(String schoolName)
    {
    	studIdList = new ArrayList<String>();
    	String fileName = schoolName + ".txt";
    	File file = new File(fileName);
    	if(file.exists() == true)
    	{
    		 try
    	   {
    		 BufferedReader reader = new BufferedReader(new FileReader(file));
    		 String line = null;
    		 while((line = reader.readLine()) != null)
    		 {
    			studIdList.add(line);
    		 }
    		 reader.close();
    	   }catch(Exception e){e.printStackTrace();}
    	}
    	
    	
    }
    public Boolean checkStudID(String id)
    {
    	for(String str : studIdList)
    	{
    		if(str.equals(id) == true)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}
