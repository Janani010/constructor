public class Birds
{
int wings;
String birdname;
boolean fly;

public Birds(int w,String bn,boolean fy)
{
wings = w;
birdname = bn;
fly= fy;

System.out.println(w+"\n"+bn+"\n"+fy);
}

public Birds(String bn,boolean fy)
{

birdname = bn;
fly= fy;

System.out.println(bn+"\n"+fy);
}

public static void main(String args[])
{

Birds b1 = new Birds(2,"parrot",true);
Birds b2 = new Birds("dove",true);


}
}
