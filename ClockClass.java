package selftechypackage;

public class ClockClass {
	
	public static String units(int n) {
	String disp_value = null;
	switch (n) {
	case 1:
	disp_value = "one ";
	break;
	case 2:
		disp_value ="two ";
	break;
	case 3:
		disp_value ="three ";
	break;
	case 4:
		disp_value ="four ";
	break;
	case 5:
		disp_value ="five ";
	break;
	case 6:
		disp_value ="six ";
	break;
	case 7:
		disp_value ="seven ";
	break;
	case 8:
		disp_value ="eight ";
	break;
	case 9:
		disp_value ="nine ";
	break;
	case 10:
		disp_value ="ten ";
	break;
	case 11:
		disp_value =" eleven";
	 break;
	 case 12:
		 disp_value =" twelve";
	 break;
	 case 13:
		 disp_value =" thirteen";
	 break;
	 case 14:
		 disp_value =" fourteen";
	 break;
	 case 15:
		 disp_value =" fifteen";
	 break;
	 case 16:
		 disp_value =" sixteen";
	 break;
	 case 17:
	 disp_value = " seventeen";
	 break;
	 case 18:
		 disp_value =" eighteen";
	 break;
	 case 19:
		 disp_value =" nineteen";
	 break;
	 case 20:
		 disp_value =" twenty";
	break;
	 case 21:
		 disp_value =" twenty one";
	 break;
	 case 22:
		 disp_value =" twenty two";
		 break;
	 case 23:
		 disp_value =" twenty three";
		 break;
	 case 24:
		 disp_value =" twenty four";
		 break;
	 case 25:
		 disp_value =" twenty five";
		 break;
	 case 26:
		 disp_value =" twenty six";
		 break;
	 case 27:
		 disp_value =" twenty seven";
		 break;
	 case 28:
		 disp_value =" twenty eight";
		 break;
	 case 29:
		 disp_value =" twenty nine";
		 break;
	 case 30:
		 disp_value =" thirty";
		 break;
	 case 31:
		 disp_value =" thirty one";
		 break;
	 case 32:
		 disp_value =" thirty two";
		 break;
	 case 33:
		 disp_value =" thirty three";
		 break;
	 case 34:
		 disp_value =" thirty four";
		 break;
	 case 35:
		 disp_value =" thirty five";
		 break;
	 case 36:
		 disp_value =" thirty six";
		 break;
	 case 37:
		 disp_value =" thirty seven";
		 break;
	 case 38:
		 disp_value =" thirty eight";
		 break;
	 case 39:
		 disp_value =" thirty nine";
		 break;
	 case 40:
		 disp_value =" forty";
		 break;
	 case 41:
		 disp_value =" forty one";
		 break;
	 case 42:
		 disp_value =" forty two";
		 break;
	 case 43:
		 disp_value =" forty three";
		 break;
	 case 44:
		 disp_value =" forty four";
		 break;
	 case 45:
		 disp_value =" forty five";
		 break;
	 case 46:
		 disp_value =" forty six";
		 break;
	 case 47:
		 disp_value =" forty seven";
		 break;
	 case 48:
		 disp_value =" forty eight";
		 break;
	 case 49:
		 disp_value =" forty nine";
		 break;
	 case 50:
		 disp_value =" fifty";
		 break;
	 case 51:
		 disp_value =" fifty one";
		 break;
	 case 52:
		 disp_value =" fifty two";
		 break;
	 case 53:
		 disp_value =" fifty three";
		 break;
	 case 54:
		 disp_value =" fifty four";
		 break;
	 case 55:
		 disp_value =" fifty five";
		 break;
	 case 56:
		 disp_value =" fifty six";
		 break;
	 case 57:
		 disp_value =" fifty seven";
		 break;
	 case 58:
		 disp_value =" fifty eight";
		 break;
	 case 59:
		 disp_value =" fifty nine";
		 break;
	}
	return disp_value ;	 
	}
	
	public static String time(String hr_mt) 
	{
		String disp_value = null;
		switch (hr_mt) {
		case "one ":
			disp_value = "one in the morning ";
			break;
		case "two ":
			disp_value = "two in the morning ";
			break;
		case "three ":
			disp_value = "three in the morning ";
			break;
		case "four ":
			disp_value = "four in the morning ";
			break;
		case "five ":
			disp_value = "five in the morning ";
			break;
		case "six ":
			disp_value = "six in the morning ";
			break;
		case "seven ":
			disp_value = "seven in the morning ";
			break;
		case "eight ":
			disp_value = "eight in the morning ";
			break;
		case "nine ":
			disp_value ="nine in the morning";
			break;
		case "ten ":
			disp_value ="ten in the morning";
			break;
		case " eleven":
			disp_value ="eleven in the morning";
			break;
		case " thirteen":
			disp_value ="one in the afternoon";
			break;
		case " fourteen":
			disp_value ="two in the afternoon";
			break;
		case " fifteen":
			disp_value ="three in the evening";
			break;
		case " sixteen":
			disp_value ="four in the evening ";
			break;
		case " seventeen":
			disp_value ="five in the evening";
			break;
		case " eighteen":
			disp_value ="six in the evening";
			break;
		case " nineteen":
			disp_value ="seven in the evening";
			break;
		case " twenty":
			disp_value ="eight in the evening";
			break;
		case " twenty one":
			disp_value ="nine in the night";
			break;
		case " twenty two":
			disp_value ="ten in the night";
			break;
		case " twenty three":
			disp_value ="eleven in the night";
			break;
		}
		return disp_value;
	}
	
		String rtn_value = null;				
	String str_mid_aft = null;
	
	  public String Display(int hours, int minutes) {
	   int  hrs = hours;
	   int mts = minutes;
	   int nexthr = hrs + 1;
	
	  	  if (hrs==0 || hrs==00)
		  {
			  if (mts==0 || mts==00)
			    rtn_value =  " Midnight ";
			  else if (mts>0 && mts <4)
				  rtn_value = " just after Midnight ";
			  else if (mts>=5 && mts <=30)
			  	  rtn_value = units(mts)+ " past Midnight ";
			   else if (mts>30 && mts<45 || mts >45)
			  	  rtn_value = units(60-mts)+ "to" + nexthr;
			   else if (mts==45)
			  	  rtn_value = " quarter to " + nexthr;
			  			 			
		  }
			  else  if (hrs==23 || hrs==11)
			  {
				  if (hrs==23)
				  	  str_mid_aft = " midnight ";
				    else
					  str_mid_aft  =" noon ";  
			   
				  if (mts==0 || mts==00)
					  rtn_value =  str_mid_aft;
				  else if (mts>0 && mts <4)
				 rtn_value = " just after " + time (units(hrs));

				  else if (mts>=5 && mts <=30)
					  rtn_value = units(mts)+ " past " + time (units(hrs));
				  
				  else if (mts>30 && mts<45 || mts >45)
					  rtn_value = units(60-mts)+ " to "+ str_mid_aft ;
				  else if (mts==45)
					  rtn_value = " quarter to " + str_mid_aft ;
			  }
	  	  
			  else  if (hrs==15)
			  {
				  if (mts==0 || mts==00)
					  rtn_value =  time(units(hrs)) ;
				  else if (mts>0 && mts <4)
					  rtn_value = " just after " + time(units(hrs));
				  else if (mts>=5 && mts <=30)
					  rtn_value = units(mts)+ " past " + time(units(hrs));
				  else if (mts>30 && mts<45 || mts >45)
				  	  rtn_value = units(60-mts)+ " to " + time(units(hrs));
				   else if (mts==45)
				  	  rtn_value = " quarter to " + time(units(hrs+1));
			  }
			  else  
			  {	  
				  if (mts==0 || mts==00)
					  rtn_value =  time(units(hrs));

			  else if (mts>0 && mts <4)
				  rtn_value = " just after " + time(units(hrs));
			  else if (mts>=5 && mts <=30)
				  rtn_value = units(mts)+ " past " + time(units(hrs));
			  else if (mts>30 && mts<45 || mts >45)				  
			  	  rtn_value = units(60-mts)+ " to " + time(units(hrs+1));
			   else if (mts==45)
			  	  rtn_value = " quarter to " + time(units(hrs+1));
			  }
	  	  
	  	  return rtn_value;
	
		  
	  
	  }
}