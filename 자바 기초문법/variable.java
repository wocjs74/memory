import java.util.Scanner;
//Ctrl + shift+o // import �� ���� �� �ִ�.
public class variable {
	

public static void main(String[] args) {
	
	/* �ּ� :���α׷� �ڵ�� �ν����� �ʴ� ����
	 *  //���� �ּ��� ������ 2���� �־��ָ� ��(����Ű:ctrl+shift+c)
     �����ּ� : ����Ű:ctrl+shift+/(����:\)
     ���α׷��� : ��ǻ�Ϳ��� ���� ��Ű�� ���� ���ϴ� ������ ����°�
     ���:�����Ϳ� ����
     
     ������
     
     1.�⺻��
     -����
     -����
     -��
     
     2.������(�����Ͱ� ��ġ�� �ּҸ� ����)
     -�迭(���°� ���� �������� �����͸� ���°�)
     -Ŭ����(���°� �ٸ� �������� �����Ϳ� ����� ���°�) - �ϳ��� ������ ������
     
     3.�������� ������ �̸� 
     -�⺻�� Ÿ��
     -����:byte(1),short(2),*int(4/20��),long
     -�Ǽ�:float(4/7�ڸ�),*double(8/15�ڸ�)
     -����:char(2)
     -��:boolean(1) True or False
     
     ������ Ÿ��
   	 -���ڿ�:String(4)
   	 
   	 ��� ��Ģ
   	 -������ ��ҹ���, �ѱ�, ���� ,Ư�� ����('-','$')�� ����Ҽ� �ִ�.
   	 -���ڷ� ������ �� ����.
   	 -������ ����� �� ����.
   	 -��Ÿ�� ǥ����� ����Ѵ�. ���ο� �ܾ��� ù���ڸ� �빮�ڷ� ǥ���ϴ°� ��Ÿ�� ǥ��
   	 -[Ŭ�������� ù���ڴ� �빮�� ǥ��]
   	 
   	 4.���� ����(���� ������ ������ ����
  */ 	 
   	 byte a;
   	 int x;
   	 short q;
   	 long y;
   	 float z;
   	 double w;
   	 char abc;
   	 boolean boolean$;
   	 String name123;//�̸��� �ߺ����� �ʰ� �����ش�
   	 
   	 //�ʱ�ȭ(������ ó������ ���� �����ϴ°�)
   	 //*(���Կ�����):������ ���� ������ ������ �����Ѵ�.
   	 x=10;//Ÿ�Կ� �´� ���� �����ؾ��Ѵ�.
   	 y=20L;//���̻� L���ٿ��� LongŸ���̵�
   	 z=3.14f;//���̻� f�� ���̸鼭 float�� ��
   	 abc = '��'; // ����ǥ �ȿ� �ѱ���
   	 boolean$ =true; //true /false
   	 name123="������asd123";//�ֵ���ǥ�� ���ڿ��� ǥ��.
   	 
   	 //q ������ ������ 9���� ������ ��� �ʱ�ȭ
   	  a=9;
   	  q=3;
   	  w=10.4;
   	  
   	  //�Ϲ������� ����� �ʱ�ȭ�� �ѹ���
   	  //int a =10;
   	  a=20;
   	  
   	  //����ȯ(�������� Ÿ���� �ٸ�Ÿ������ ����)
   	//  int_int = 10;
   	 // long_long= 20L;
   	  
   	//  _int=(int)_long;
   	 // _long=_int; //ǥ�������� ���� Ÿ�Կ��� ū Ÿ������ ����ȯ�� ������ �� ����
     //
  //  _int=(int)(_int+long);//���� �ٸ� Ÿ���� ���� �� �� ����
	   
   	  //Q.���� 3���� ������ �ٸ� Ÿ���� �����ͷ� �ʱ�ȭ �Ͻÿ�
   	  int k =3;
   	  float p = 34.15f;
   	  long j = 123653235L;
   	  
   	  long abcd = (long)3.14;
   	  
   	  char ta = (char)6.3;
   	  
   	  char ch='a';
   	  short dd=(short)ch;
   	  
   	  System.out.print("���");
   	  System.out.println("��� �� �ٹٲ�");
   	  System.out.printf("����� ���� ����");
   	  
   	  //���� ����Ű : Ctrl + F11
   	  //Ż�� ���� : (Escape ����)
   	  System.out.println("����/t4ĭ�� ���� ����ݴϴ�.");
   	  System.out.println("�ٹٲ���\n���ݴϴ�.");
   	  System.out.println("\"�ֵ���ǥ�� �־��ݴϴ�.\"");
   	  System.out.println("\\�������ø� �־��ݴϴ�.");
   	  
   	  //������ ���� 9���� ������ ���
   	  System.out.println(a);
   	  System.out.println(x);
   	  System.out.println(q);
   	  System.out.println(y);
   	  System.out.println(z);
   	  System.out.println(w);
   	  System.out.println(abc);
   	  System.out.println(boolean$);
   	  System.out.println(name123);
   	  
   	  //�Է�
   	  Scanner sc =new Scanner(System.in);
   	  
   	  System.out.println("�ƹ� ���ڿ��̳� �Է��Ͻÿ�<");
   	  String str = sc.nextLine();
   	  System.out.println(str);
   	  
   	  System.out.println("int �Է�>");
   	  int nextInt=sc.nextInt();
   	  System.out.println(nextInt);//nextInt�� ������ �־ �Ⱦ��°� ����
   
   	  Scanner sc1 =new Scanner(System.in);
   	  System.out.println("���ڿ� �Է�>");
   	  String nextLine=sc1.nextLine();
   	  System.out.println(nextLine);
   	  
   	  System.out.println("�Է� ��");
   	  
   //	  System.out.println("int �Է�>");
   	//  int number = Integer.parseInt(sc.nextLine());
   //  System.out.println();
   	  
   	  //Q �ڽ��� �̸��� ������ ������ �����ϰ� Scanner�� ����� �̸��� ����
   	  
   	  System.out.println("�̸��� �Է����ּ���");
   	  String myName = sc.nextLine();
   	  //System.out.println(myname);
   	  
   	  //Q �ڽ��� ���� ������ ������ �����ϰ� Scanner�� ����� �̸��� ����
   	  System.out.println("���̸� �Է����ּ���.");
   	  int myAge = Integer.parseInt(sc.nextLine());
   	  double db = Double.parseDouble(sc.nextLine());
   	  
   	 // System.out.println(myName+myAge);
   	  System.out.println("�̸� :" +myName+"���� :"+myAge);
}
	

}
