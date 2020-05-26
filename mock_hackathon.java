package truelines;
import java.util.*;
import java.io.*;
public class mock_hackathon {
	
	double avg;
	double max;
ArrayList<Double> arr=new ArrayList<Double>();
	void convert()
	{
		try {
	FileReader fr=null;
	fr=new FileReader("C:\\Users\\Dell\\eclipse-workspace\\truelines\\src\\Memory.txt");
	BufferedReader br=new BufferedReader(fr);
	for(int i=0;i<1876;i++)
	{
		if(i%2!=0)
		{
			String str=br.readLine().trim();
			String pqr[]=str.split(" ");
			int x=pqr[3].length();
			String df=pqr[3].substring(0,x-1);
			Double d=Double.parseDouble(df.trim());
			d=d/100;
			
			arr.add(d);
		}
		else
			br.readLine();
	}
	
	br.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	void avgMemory()
		{
			double sum=0;
			
			for(int i=0;i<arr.size();i++)
			{
				sum+=arr.get(i);
			}
			avg=sum/arr.size();
			avg= Math.round(avg* 100.0) / 100.0;
			System.out.println("\"AverageMemory(MB)\":"+avg);
			
		}
	
		void maxMemory()
		{
			max=arr.get(0);
			for(int i=1;i<arr.size();i++)
			{
				if(arr.get(i)>max)
				{
					max=arr.get(i);
				}
			}
			System.out.println("\"MaxMemory(MB)\":"+max);
		}
		


public static void main(String args[])
{
	mock_hackathon obj=new mock_hackathon();
	obj.convert();
	obj.avgMemory();
	obj.maxMemory();
System.out.println("\"Usecasename\":\"HomePage\"");
	
}

}



	

