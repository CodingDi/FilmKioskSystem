/**
 * Title      : CurrentPurchase.java
 * Description: This class contains the definition of CurrentPurchase
 * Copyright  : Copyright (c) 2905-2017 All rights reserved
 * @author      Group 78
 * @version     1.8
 */
import java.util.*;

public class CurrentPurchase {
	public final double childDiscount = 0.5;
	public final double seniorDiscount = 0.8;
	public final double studDiscount = 0.85;
    public static String filmName = new String();
    public static int screenNum = 0;
    public static int startTime = 0;
    public static int ticketCount = 0;
    public static int lastTime = 0;
    public static double filmPrice;
    public static int adultTicketNum = 0;
    public static int childTicketNum = 0;
    public static int studTicketNum = 0;
    public static int elderTicketNum = 0;
    public static double totalPrice = 0.0;
    public static int day = 0;
   // public static ArrayList<String> ticketIDList;
    public static ArrayList<String> studIDList;
    /**This method is to set adultTicketNum
     * @param num    store the adultTicketNum
     */
    public void setAdultTicketNum(int num)
    {
    	adultTicketNum = num;
    }
    /**This method is to set childTicketNum
     * @param num    store the childTicketNum
     */
    public void setChildTicketNum(int num)
    {
    	childTicketNum = num;
    }
    /**This method is to set studTicketNum
     * @param num    store the studTicketNum
     */
    public void setStudTicketNum(int num)
    {
    	studTicketNum = num;
    }
    /**This method is to set elderTicketNum
     * @param num    store the elderTicketNum
     */
    public void setElderTicketNum(int num)
    {
    	elderTicketNum = num;
    }
    /**This method is to get check
     * @return boolean
     */
    public Boolean check()
    {
    	
         if(totalTicket() > ticketCount)
		     return false;
	     else
	         return true;
    	 

    }
    /**This method is to get totalTicket
     * @ return int
     */
    public static int totalTicket()
    {
    	return adultTicketNum + childTicketNum + studTicketNum + elderTicketNum;
    }
    /**This method is to get childUnitprice
     * @return double
     */
    public double childUnitprice()
    {
    	return filmPrice * childDiscount;
    }
    /**This method is to get seniorUnitprice
     * @return double
     */
    public double seniorUnitprice()
    {
    	return filmPrice * seniorDiscount ;
    }
    /**This method is to get studUnitprice
     * @return double
     */
    public double studUnitprice()
    {
    	return filmPrice * studDiscount ;
    }
    /**This method is to get calTotalPrice
     * @return double
     */
    public void calTotalPrice()
    {
    	totalPrice = adultTicketNum * filmPrice 
    			     + childTicketNum * filmPrice * childDiscount
    			     + elderTicketNum * filmPrice * seniorDiscount 
    			     + studTicketNum * filmPrice * studDiscount;
    }
}
