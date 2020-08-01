package com.currencyformatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CurrencyFormat {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		
		
		double payment = in.nextDouble();
		
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
		
		System.out.println(us);
		System.out.println(india);
		System.out.println(china);
		System.out.println(france);
		
		/* int decpoint=(int)((payment-(int)payment)*100)%100;
	        int in=(int)payment;
	        int dec=(int)payment-in;
	        StringBuffer us=new StringBuffer();
	        StringBuffer india=new StringBuffer();
	        StringBuffer china=new StringBuffer();
	        StringBuffer france=new StringBuffer();
	        int count=1;
	        while(in!=0){
	            int r=in%10;
	            in=in/10;
	            us.insert(0,r);
	            india.insert(0,r);
	            china.insert(0,r);
	            france.insert(0,r);
	            count=count*10;
	            if(count==1000 || count==1000000 || count==10000000 || count==1000000000){
	                us.insert(0,",");
	                india.insert(0,",");
	                china.insert(0,",");
	                france.insert(0," ");
	            }
	        }
	        us.append("."+decpoint);
	        india.append("."+decpoint);
	        china.append("."+decpoint);
	        france.append(","+decpoint);
	        us.insert(0,"$");
	        india.insert(0,"Rs.");
	        china.insert(0,"￥");
	        france.append(" €");
	        System.out.println("US: " + us.toString().trim());
	        System.out.println("India: " + india.toString().trim());
	        System.out.println("China: " + china.toString().trim());
	        System.out.println("France: " + france.toString().trim());*/
		
	}

}
