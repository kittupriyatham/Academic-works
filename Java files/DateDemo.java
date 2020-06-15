import java.util.StringTokenizer;
public class DateDemo {
public static void main(String[] args)
{
String datetemp [] = {"10/05/19","01/03/03","12/14/99"};
int count = datetemp.length;
int i=0;
String dt="",mt="",yt="";
while(i<count)
{
StringTokenizer st = new StringTokenizer(datetemp[i],"/");
int month = Integer.parseInt(st.nextToken());
int day = Integer.parseInt(st.nextToken());
String year = st.nextToken();
int yer = Integer.parseInt(year);

dt = Integer.toString(day);
dt = dt + "th";
switch(month)
{
case 1:
mt = "January";
break;
case 2:
mt = "Feburary";
break;
case 3:
mt = "March";
break;
case 4:
mt = "April";
break;
case 5:
mt = "May";
break;
case 6:
mt = "June";
break;
case 7:
mt = "July";
break;
case 8:
mt = "August";
break;
case 9:
mt = "September";
break;
case 10:
mt = "October";
break;
case 11:
mt = "November";
break;
case 12:
mt = "December";
break;
}
if(yer>=0 && yer<=20)
yt="20"+year;
else if(yer>=21 && yer<=99)
	yt="19"+year;
System.out.println(dt+" "+mt+" "+yt);
mt="";
dt="";
yt="";
i++;
}
}
}
