import java.util.Scanner;

class Determine{//判斷輸入是否為數字
	public boolean Determine(String s)
	{
		try {
			Integer.parseInt(s);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}
class Mora{
	
	public static  int mora() {//執行猜拳的方法
		while(true)//當平手或輸入錯誤時，需再次執行，但無法確定要執行幾次
		{
			Scanner keyin =new Scanner(System.in);
			Determine d = new Determine();
			int x=0,y=0,z=0;
			String s;
			System.out.println("輸入您要出的拳：\n1=剪刀，2=石頭，3=布，0=離開遊戲");
			s=keyin.nextLine();//使用者可能會輸入錯誤，不一定是輸入數字，故先用字串儲存，再去辨別輸入的是什麼
			
			if (d.Determine(s))//如果輸入的數字
			{
				x=Integer.parseInt(s);//將數字的值存入x
			}
			else//如果輸入的不是數字
			{
				System.out.println("輸入錯誤，請重新輸入");
				continue;//跳過迴圈後面的程式敘述，從頭再執行一次
			}
			
			
			if(x==0)//如果使用者輸入0，代表他想結束遊戲
			{
				System.out.println("感謝您的蒞臨，我們有緣再見");
				
				System.exit(0);//結束程式
			}
			if(x!=1&&x!=2&&x!=3)//如果輸入的為>3的數字，則不符合遊戲需求，需重新輸入
			{
				System.out.println("輸入錯誤，請重新輸入");
				continue;
			}
			
			y=(int)(Math.random()*3)+1;//產生電腦出的拳
			switch(x)//判斷使用者出什麼拳
			{
			case 1:
				System.out.print("您出剪刀\t");
				break;
			case 2:
				System.out.print("您出石頭\t");
				break;
			case 3:
				System.out.print("您出布\t");
				break;
			}
			switch(y)//判斷電腦出什麼拳
			{
			case 1:
				System.out.println("對手出剪刀");
				break;
			case 2:
				System.out.println("對手出石頭");
				break;
			case 3:
				System.out.println("對手出布");
				break;
			}
			
			
			if (x==1&&y==3)//使用者出剪刀，電腦出布，使用者獲勝
			{
				z=1;//傳回值為1，代表使用者獲勝
			}
			else if(x==3&&y==1)//使用者出布，電腦出剪刀，電腦獲勝
			{
				z=2;//傳回值為2，代表電腦獲勝
			}
			else if(x>y)//有2種狀況：使用者出石頭，電腦出剪刀;或是使用者出布，電腦出石頭。都是使用者獲勝
			{
				z=1;//傳回值為1，代表使用者獲勝
			}
			else if(x<y)//有2種狀況：電腦出石頭，使用者出剪刀;或是電腦出布，使用者出石頭。都是電腦獲勝
			{
				z=2;//傳回值為2，代表電腦獲勝
			}
			else if(x==y)//當兩方出相同的拳，平手，再猜一次
			{
				System.out.println("平手!!再來一次");
				continue;//跳過後面的程式，從頭再來一次
			}
			return z;//傳回猜拳的結果
			}
			
		
	}	
	
	
	
}
public class test1 {
	//以國中小常玩的團康遊戲"攻佔城堡"為發想，設計一個由玩家與電腦對決的遊戲
	//優戲開始前玩家和電腦在道路的兩端，遊戲開始後，兩方以等速度往中間移動
	//當兩方相遇時，便進行猜拳，贏的一方，繼續前進，輸的一方回到起點，從新開始
	//當其中一方到達另一方時，到達那方獲勝，遊戲結束，可以選擇要不要再玩一次
	
	public static void main(String[] args) {
		Scanner keyin =new Scanner(System.in);
		Mora m =new Mora();
		
		int c=0;//猜拳結果的回傳值
		String s;//儲存遊戲開始時的輸入
		int[] x;//遊戲中的道路
		
		System.out.println("歡迎來到攻佔城堡!!");
		System.out.println("遊戲即將開始，玩家代表左方陣營，由左方出發;電腦代表右方陣營，從右方出發");
		System.out.println("當玩家到達倒數第二格時，玩家獲勝;當電腦到達第二格時，電腦獲勝");
		System.out.println("本遊戲由密集的數字呈現，有密集恐懼症者，請自行斟酌");
		
		while(true)//當遊戲開始前的輸入錯誤時﹐可重新開始
		{
			int a=0,b=101;//a代表玩家，b代表電腦
			int d=0;//判斷遊戲是否結束，需要重新開始
			System.out.println("按下enter鍵，開始遊戲；輸入0，離開遊戲(遊戲途中隨時可以離開)");
			s=keyin.nextLine();//"enter"鍵為文字型態，鍵盤上的大多數按鍵為文字型態，故先用文字儲存輸入
			if(s.equals(""))//如果按下enter鍵，進入遊戲
			{
				while(true)//遊戲需重複執行，直到一方獲勝或使用者自行結束遊戲
				{
					
					x=new int [102];//用陣列表示道路,預設值0,每次執行程式都要讓道路回到初始化，才能看到人偶的跑動
					x[a]=1;//用1代表跑動的人偶，x[a]為玩家的位址
					x[b]=1;//x[b]為電腦的位址
					for(int i=0;i<102;i++)//輸出道路及人偶現在的位址
					{
						System.out.print(x[i]);
					}
					System.out.println();//換行以辨別下一輪遊戲
					if(b==1)//如果電腦前進到第二格時，電腦獲勝
					{
						System.out.println("You lose!");
						d=1;//判斷遊戲已結束，需重新開始
						break;//跳出這個while迴圈
					}
					else if(a==100)//如果玩家前進到倒數第二格，玩家獲勝
					{
						System.out.println("You win!!");
						d=1;//判斷遊戲已結束，需重新開始
						break;//跳出這個while迴圈
					}
					else if(((b-a)==1)||(b==a))//當兩方相遇時有兩種狀況：兩人在同一位址，或是兩人在相鄰位址
					{
						c=m.mora();//執行猜拳，並用c儲存猜拳結果的回傳值
						if (c==1)//當玩家獲勝
						{
							System.out.println("贏了!!繼續前進");
							a+=1;//玩家前進一步
							b=101;//電腦重新開始
						}
						else if(c==2)//當電腦獲勝
						{
							System.out.println("輸了!!重新開始");
							a=0;//玩家重新開始
							b-=1;//電腦前進一步
						}
						
						

					}
					
					else//遊戲正常執行，雙方各前進一步
					{
						a+=1;//玩家前進一步
						b-=1;//電腦前進一步
					}
					
				}
				
			}
			
			else if(s.equals("0"))//若使用者輸入0，代表使用者沒有要開始遊戲，要直接結束遊戲
			{
				System.out.println("感謝您的蒞臨，我們有緣再見");
				keyin.close();//結束程式前關閉輸入				
				System.exit(0);//結束程式
			}
			else if(d==1)//遊戲已結束，需重新開始
			{
				continue;//再次執行程式
			}
				
			else//使用者輸入不符合遊戲需求，需重新輸入
			{
				System.out.println("輸入錯誤，請再試一次");				
				continue;//再次執行程式
				
			}
		}

		
		
		
		

	}

}
