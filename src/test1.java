import java.util.Scanner;

class Determine{//�P�_��J�O�_���Ʀr
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
	
	public static  int mora() {//����q������k
		while(true)//����ο�J���~�ɡA�ݦA������A���L�k�T�w�n����X��
		{
			Scanner keyin =new Scanner(System.in);
			Determine d = new Determine();
			int x=0,y=0,z=0;
			String s;
			System.out.println("��J�z�n�X�����G\n1=�ŤM�A2=���Y�A3=���A0=���}�C��");
			s=keyin.nextLine();//�ϥΪ̥i��|��J���~�A���@�w�O��J�Ʀr�A�G���Φr���x�s�A�A�h��O��J���O����
			
			if (d.Determine(s))//�p�G��J���Ʀr
			{
				x=Integer.parseInt(s);//�N�Ʀr���Ȧs�Jx
			}
			else//�p�G��J�����O�Ʀr
			{
				System.out.println("��J���~�A�Э��s��J");
				continue;//���L�j��᭱���{���ԭz�A�q�Y�A����@��
			}
			
			
			if(x==0)//�p�G�ϥΪ̿�J0�A�N��L�Q�����C��
			{
				System.out.println("�P�±z���Y�{�A�ڭ̦��t�A��");
				
				System.exit(0);//�����{��
			}
			if(x!=1&&x!=2&&x!=3)//�p�G��J����>3���Ʀr�A�h���ŦX�C���ݨD�A�ݭ��s��J
			{
				System.out.println("��J���~�A�Э��s��J");
				continue;
			}
			
			y=(int)(Math.random()*3)+1;//���͹q���X����
			switch(x)//�P�_�ϥΪ̥X����
			{
			case 1:
				System.out.print("�z�X�ŤM\t");
				break;
			case 2:
				System.out.print("�z�X���Y\t");
				break;
			case 3:
				System.out.print("�z�X��\t");
				break;
			}
			switch(y)//�P�_�q���X����
			{
			case 1:
				System.out.println("���X�ŤM");
				break;
			case 2:
				System.out.println("���X���Y");
				break;
			case 3:
				System.out.println("���X��");
				break;
			}
			
			
			if (x==1&&y==3)//�ϥΪ̥X�ŤM�A�q���X���A�ϥΪ����
			{
				z=1;//�Ǧ^�Ȭ�1�A�N��ϥΪ����
			}
			else if(x==3&&y==1)//�ϥΪ̥X���A�q���X�ŤM�A�q�����
			{
				z=2;//�Ǧ^�Ȭ�2�A�N��q�����
			}
			else if(x>y)//��2�ت��p�G�ϥΪ̥X���Y�A�q���X�ŤM;�άO�ϥΪ̥X���A�q���X���Y�C���O�ϥΪ����
			{
				z=1;//�Ǧ^�Ȭ�1�A�N��ϥΪ����
			}
			else if(x<y)//��2�ت��p�G�q���X���Y�A�ϥΪ̥X�ŤM;�άO�q���X���A�ϥΪ̥X���Y�C���O�q�����
			{
				z=2;//�Ǧ^�Ȭ�2�A�N��q�����
			}
			else if(x==y)//����X�ۦP�����A����A�A�q�@��
			{
				System.out.println("����!!�A�Ӥ@��");
				continue;//���L�᭱���{���A�q�Y�A�Ӥ@��
			}
			return z;//�Ǧ^�q�������G
			}
			
		
	}	
	
	
	
}
public class test1 {
	//�H�ꤤ�p�`�����αd�C��"�������"���o�Q�A�]�p�@�ӥѪ��a�P�q����M���C��
	//�u���}�l�e���a�M�q���b�D������ݡA�C���}�l��A���H���t�ש���������
	//����۹J�ɡA�K�i��q���AĹ���@��A�~��e�i�A�骺�@��^��_�I�A�q�s�}�l
	//��䤤�@���F�t�@��ɡA��F������ӡA�C�������A�i�H��ܭn���n�A���@��
	
	public static void main(String[] args) {
		Scanner keyin =new Scanner(System.in);
		Mora m =new Mora();
		
		int c=0;//�q�����G���^�ǭ�
		String s;//�x�s�C���}�l�ɪ���J
		int[] x;//�C�������D��
		
		System.out.println("�w��Ө�������!!");
		System.out.println("�C���Y�N�}�l�A���a�N����}��A�ѥ���X�o;�q���N��k��}��A�q�k��X�o");
		System.out.println("���a��F�˼ƲĤG��ɡA���a���;��q����F�ĤG��ɡA�q�����");
		System.out.println("���C���ѱK�����Ʀr�e�{�A���K�����߯g�̡A�Цۦ�r�u");
		
		while(true)//��C���}�l�e����J���~�ɡM�i���s�}�l
		{
			int a=0,b=101;//a�N���a�Ab�N��q��
			int d=0;//�P�_�C���O�_�����A�ݭn���s�}�l
			System.out.println("���Uenter��A�}�l�C���F��J0�A���}�C��(�C���~���H�ɥi�H���})");
			s=keyin.nextLine();//"enter"�䬰��r���A�A��L�W���j�h�ƫ��䬰��r���A�A�G���Τ�r�x�s��J
			if(s.equals(""))//�p�G���Uenter��A�i�J�C��
			{
				while(true)//�C���ݭ��ư���A����@����өΨϥΪ̦ۦ浲���C��
				{
					
					x=new int [102];//�ΰ}�C��ܹD��,�w�]��0,�C������{�����n���D���^���l�ơA�~��ݨ�H�����]��
					x[a]=1;//��1�N��]�ʪ��H���Ax[a]�����a����}
					x[b]=1;//x[b]���q������}
					for(int i=0;i<102;i++)//��X�D���ΤH���{�b����}
					{
						System.out.print(x[i]);
					}
					System.out.println();//����H��O�U�@���C��
					if(b==1)//�p�G�q���e�i��ĤG��ɡA�q�����
					{
						System.out.println("You lose!");
						d=1;//�P�_�C���w�����A�ݭ��s�}�l
						break;//���X�o��while�j��
					}
					else if(a==100)//�p�G���a�e�i��˼ƲĤG��A���a���
					{
						System.out.println("You win!!");
						d=1;//�P�_�C���w�����A�ݭ��s�}�l
						break;//���X�o��while�j��
					}
					else if(((b-a)==1)||(b==a))//����۹J�ɦ���ت��p�G��H�b�P�@��}�A�άO��H�b�۾F��}
					{
						c=m.mora();//����q���A�å�c�x�s�q�����G���^�ǭ�
						if (c==1)//���a���
						{
							System.out.println("Ĺ�F!!�~��e�i");
							a+=1;//���a�e�i�@�B
							b=101;//�q�����s�}�l
						}
						else if(c==2)//��q�����
						{
							System.out.println("��F!!���s�}�l");
							a=0;//���a���s�}�l
							b-=1;//�q���e�i�@�B
						}
						
						

					}
					
					else//�C�����`����A����U�e�i�@�B
					{
						a+=1;//���a�e�i�@�B
						b-=1;//�q���e�i�@�B
					}
					
				}
				
			}
			
			else if(s.equals("0"))//�Y�ϥΪ̿�J0�A�N��ϥΪ̨S���n�}�l�C���A�n���������C��
			{
				System.out.println("�P�±z���Y�{�A�ڭ̦��t�A��");
				keyin.close();//�����{���e������J				
				System.exit(0);//�����{��
			}
			else if(d==1)//�C���w�����A�ݭ��s�}�l
			{
				continue;//�A������{��
			}
				
			else//�ϥΪ̿�J���ŦX�C���ݨD�A�ݭ��s��J
			{
				System.out.println("��J���~�A�ЦA�դ@��");				
				continue;//�A������{��
				
			}
		}

		
		
		
		

	}

}
