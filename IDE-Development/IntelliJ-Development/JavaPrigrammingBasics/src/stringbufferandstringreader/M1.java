package stringbufferandstringreader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.Date;

public class M1
{
        public static void main(String[] args)
        {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, 20);
                Date date = cal.getTime();
                System.out.println(date);


        }
        }