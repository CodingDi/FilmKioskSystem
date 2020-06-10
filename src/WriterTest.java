/**
 * Title      : WriterTest.java
 * Description: This class contains the definition of WriterTest
 * Copyright  : Copyright (c) 2905-2017 All rights reserved
 * @author      Group 78
 * @version     1.8
 */
import java.util.ArrayList;

public class WriterTest {
    public static void main(String [] args)
    {
    	Writer writer = new Writer();
    	Reader reader = new Reader();
    	ArrayList <Film> films = new ArrayList<Film>();
    	ArrayList <String> filmName = reader.readMovieList();
    	for(String name : filmName)
    	{
    		Film f = new Film();
    		f.setFilmName(name);
    		films.add(f);
    	}
    	
    	writer.writeReport(films, 0);
    }
}
