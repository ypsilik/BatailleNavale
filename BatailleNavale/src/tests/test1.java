package tests;

public class test1 {
		
		public static void main (String args[]) 
		{
			int tableSize = 9;
			printMultiplicationTable(tableSize);
		}
				    
		public static void printMultiplicationTable(int tableSize) 
		{

		   System.out.format("      ");
		   for(int i = 1; i<=tableSize;i++ )
		   {
		       System.out.format("%4d",i);
		   }
		   System.out.println();
		   System.out.println("------------------------------------------");
		   int n=0;
		   for(int i = 1 ;i<=tableSize;i++) 
		   {
			
			   char code='A';
			   int increm=code+n;
			   System.out.format("%4s |",(char)increm);
			   n++;
			   for(int j=1;j<=tableSize;j++) 
			   {
				   System.out.format("%4s",(char)126);
			   }
			   System.out.println();
			}
		}
}
