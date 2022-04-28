import java.util.Scanner;
//Ctrl + shift+o // import 를 지울 수 있다.
public class variable {
	

public static void main(String[] args) {
	
	/* 주석 :프로그램 코드로 인식하지 않는 문장
	 *  //한줄 주석은 슬러쉬 2개를 넣어주면 됨(단축키:ctrl+shift+c)
     범위주석 : 단축키:ctrl+shift+/(해제:\)
     프로그래밍 : 컴퓨터에게 일을 시키기 위해 일하는 과정을 만드는것
     재료:데이터와 조작
     
     데이터
     
     1.기본형
     -숫자
     -문자
     -논리
     
     2.참조형(데이터가 위치한 주소를 저장)
     -배열(형태가 같은 여러개의 데이터를 묶는것)
     -클래스(형태가 다른 여러개의 데이터와 기능을 묶는것) - 하나의 복잡한 데이터
     
     3.데이터의 종류와 이름 
     -기본형 타입
     -정수:byte(1),short(2),*int(4/20억),long
     -실수:float(4/7자리),*double(8/15자리)
     -문자:char(2)
     -논리:boolean(1) True or False
     
     참조형 타입
   	 -문자열:String(4)
   	 
   	 명명 규칙
   	 -영문자 대소문자, 한글, 숫자 ,특수 문자('-','$')를 사용할수 있다.
   	 -숫자로 시작할 수 없다.
   	 -예약어는 사용할 수 없다.
   	 -낙타식 표기법을 사용한다. 새로운 단어의 첫글자를 대문자로 표시하는게 낙타시 표기
   	 -[클래스명의 첫글자는 대문자 표기]
   	 
   	 4.변수 선언(값을 저장할 공간을 만듬
  */ 	 
   	 byte a;
   	 int x;
   	 short q;
   	 long y;
   	 float z;
   	 double w;
   	 char abc;
   	 boolean boolean$;
   	 String name123;//이름은 중복되지 않게 지어준다
   	 
   	 //초기화(변수에 처음으로 값을 지정하는것)
   	 //*(대입연산자):오른쪽 값을 왼쪽의 변수에 저장한다.
   	 x=10;//타입에 맞는 값을 저장해야한다.
   	 y=20L;//접미사 L을붙여야 Long타입이됨
   	 z=3.14f;//접미사 f를 붙이면서 float가 됨
   	 abc = '가'; // 따옴표 안에 한글자
   	 boolean$ =true; //true /false
   	 name123="가나다asd123";//쌍따옴표로 문자열을 표현.
   	 
   	 //q 위에서 선언한 9개의 변수를 모두 초기화
   	  a=9;
   	  q=3;
   	  w=10.4;
   	  
   	  //일반적으로 선언과 초기화를 한문장
   	  //int a =10;
   	  a=20;
   	  
   	  //형변환(데이터의 타입을 다른타입으로 변경)
   	//  int_int = 10;
   	 // long_long= 20L;
   	  
   	//  _int=(int)_long;
   	 // _long=_int; //표현범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 없음
     //
  //  _int=(int)(_int+long);//서로 다른 타입은 연산 할 수 없다
	   
   	  //Q.변수 3개를 선언해 다른 타입의 데이터로 초기화 하시오
   	  int k =3;
   	  float p = 34.15f;
   	  long j = 123653235L;
   	  
   	  long abcd = (long)3.14;
   	  
   	  char ta = (char)6.3;
   	  
   	  char ch='a';
   	  short dd=(short)ch;
   	  
   	  System.out.print("출력");
   	  System.out.println("출력 후 줄바꿈");
   	  System.out.printf("출력후 포맷 지정");
   	  
   	  //실행 단축키 : Ctrl + F11
   	  //탈출 문자 : (Escape 문자)
   	  System.out.println("탭은/t4칸에 맞춰 띄워줍니다.");
   	  System.out.println("줄바꿈을\n해줍니다.");
   	  System.out.println("\"쌍따옴표를 넣어줍니다.\"");
   	  System.out.println("\\역슬래시를 넣어줍니다.");
   	  
   	  //위에서 만든 9개의 변수를 출력
   	  System.out.println(a);
   	  System.out.println(x);
   	  System.out.println(q);
   	  System.out.println(y);
   	  System.out.println(z);
   	  System.out.println(w);
   	  System.out.println(abc);
   	  System.out.println(boolean$);
   	  System.out.println(name123);
   	  
   	  //입력
   	  Scanner sc =new Scanner(System.in);
   	  
   	  System.out.println("아무 문자열이나 입력하시요<");
   	  String str = sc.nextLine();
   	  System.out.println(str);
   	  
   	  System.out.println("int 입력>");
   	  int nextInt=sc.nextInt();
   	  System.out.println(nextInt);//nextInt는 오류가 있어서 안쓰는걸 권장
   
   	  Scanner sc1 =new Scanner(System.in);
   	  System.out.println("문자열 입력>");
   	  String nextLine=sc1.nextLine();
   	  System.out.println(nextLine);
   	  
   	  System.out.println("입력 끝");
   	  
   //	  System.out.println("int 입력>");
   	//  int number = Integer.parseInt(sc.nextLine());
   //  System.out.println();
   	  
   	  //Q 자신의 이름을 저장할 변수를 선언하고 Scanner을 사용해 이름을 저장
   	  
   	  System.out.println("이름을 입력해주세요");
   	  String myName = sc.nextLine();
   	  //System.out.println(myname);
   	  
   	  //Q 자신의 나이 저장할 변수를 선언하고 Scanner을 사용해 이름을 저장
   	  System.out.println("나이를 입력해주세요.");
   	  int myAge = Integer.parseInt(sc.nextLine());
   	  double db = Double.parseDouble(sc.nextLine());
   	  
   	 // System.out.println(myName+myAge);
   	  System.out.println("이름 :" +myName+"나이 :"+myAge);
}
	

}
