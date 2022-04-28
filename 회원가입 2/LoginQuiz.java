package Capsulation;

import java.util.Scanner;

public class LoginQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LoginProgram program = new LoginProgram();
		while (true) {
			char select = program.display();
			
			switch (select) {
			case '1' :
				program.loginVaild();
				if(LoginProgram.loginFlag) {
					break;
				}
				System.out.println("아이디 입력 : ");
				String myid = input.nextLine();
				program.setId(myid);
				System.out.println("비밀번호 입력 : ");
				String mypw = input.nextLine();
				program.setPassword(mypw);
				program.isMemberCheck(program.getId(),program.getPassword());
				break;
				
					case '2' : 
						program.Join();
						break;
					case '3' : 
						program.logout();
						break;
					case '4' : 
						System.exit(0);
						default :
						System.out.println("잘못된 값 입력");
						break;
			}
			}
		}

	}

