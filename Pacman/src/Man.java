import java.util.*;
public class Man {
	static char map[][] = new  char[][]{
		"+#############################+".toCharArray(),
		"#P  $$$$$$$$$$$$              #".toCharArray(),
		"#                $$$$$$$$$$$$ #".toCharArray(),
		"### ########### ##   ##########".toCharArray(),
		"#   |                         #".toCharArray(),
		"# | |### |  |           |     #".toCharArray(),
		"# |      |  | |###  |   |  |  #".toCharArray(),
		"# | #####|  | |      ## |     #".toCharArray(),
		"# |   $$$     |###  |      |  #".toCharArray(),
		"# |##### ###         ##       #".toCharArray(),
		"#          ######  ####### ####".toCharArray(),
		"#  $$$                        #".toCharArray(),
		"## ### ####      ###   ########".toCharArray(),
		"#                             #".toCharArray(),
		"#$$$   $$$$          $$$      #".toCharArray(),
		"#            $$$$$$$$$        #".toCharArray(),
		"#   E                         #".toCharArray(),
		"+#############################+".toCharArray()
	};
	static int x=1,y=1;
	static int count=0;
	static int i,j,maxx=50;
	public static void main(String args[])
	{
		System.out.println("Enter into the Pac Man game ");
		char p;
		Scanner sc = new Scanner(System.in);
		display();
		
		while(true)
		{
			if(count==maxx)
			{
				System.out.println("you have eaten "+ count);
				break;
			}
			System.out.println("enter the poition");
			p=sc.next().charAt(0);
			if(p=='r')
			{
				if(map[x][y+1]==' ' || map[x][y+1]=='$')
				{
					if(map[x][y+1]=='$')
					{
						count++;
						map[x][y+1]=' ';
					}
					map[x][y]=' ';
					map[x][y+1]='P';
					y++;
					display();
					
					
				}
				else if(map[x][y+1]=='E')
				{
					System.out.println("you are out");
					break;
				}
			}
				else if(p=='l')
				{

					if(map[x][y-1]==' ' || map[x][y-1]=='$')
					{
						if(map[x][y-1]=='$')
						{
							count++;
							map[x][y-1]=' ';
						}
						map[x][y]=' ';
						map[x][y-1]='P';
						display();
						y--;
						
					}
					else if(map[x][y-1]=='E')
					{
						System.out.println("you are out");
						break;
					}
					
				}
				else if(p=='t')
				{

					if(map[x-1][y]==' ' || map[x-1][y]=='$')
					{
						if(map[x-1][y]=='$')
						{
							count++;
							map[x-1][y]=' ';
						}
						map[x][y]=' ';
						map[x-1][y]='P';
						x--;
						display();
						
					
					}
					else if(map[x-1][y]=='E')
					{
						System.out.println("you are out");
						break;
					}
				}
				else if(p=='d')
				{

					if(map[x+1][y]==' ' || map[x+1][y]=='$')
					{
						if(map[x+1][y]=='$')
						{
							count++;
							map[x+1][y]=' ';
						}
						map[x][y]=' ';
						map[x+1][y]='P';
						x++;
						display();
						
						
					}
					else if(map[x+1][y]=='E')
					{
						System.out.println("you are out");
						break;
					}
					
			   }
		
			
		}
	}
	static void display()
	{
		for(int i=0;i<18;i++)
		{
			System.out.println(map[i]);
		}
	}

}
