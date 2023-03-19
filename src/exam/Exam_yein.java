package exam;
import java.util.Scanner;
public class Exam_yein {
			
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String []Q = {"캐나다의 수도는?","일본의 수도는?","중국의 수도는?","한국의 수도는?","싱가포르의 수도는?"};
		String[]ex = {	"a.오타와, b.도쿄, c.상하이, d.서울, e.싱가포르",
						"a.오타와, b.도쿄, c.상하이, d.서울, e.싱가포르",
						"a.오타와, b.도쿄, c.상하이, d.서울, e.싱가포르",
						"a.오타와, b.도쿄, c.상하이, d.서울, e.싱가포르",
						"a.오타와, b.도쿄, c.상하이, d.서울, e.싱가포르"};
		
		String []dap = {"a","b","c","d","e"};
		String []user = new String[5];
	
		for(int i=0; i<Q.length; i++){
			System.out.println((i+1)+"번 "+Q[i]);
			System.out.println(ex[i]);
			user[i] = sc.nextLine();	
		}

		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "\t");
		}
		System.out.println();
			int cnt=0;
			for(int i=0; i<Q.length; i++){
				if(dap[i].equals (user[i])){	
					System.out.print("o\t");
					cnt++;
				}else{
					System.out.print("x\t");
				}	
			}
			System.out.println();

			System.out.println();
			System.out.println("*** 시험결과 ***");
			System.out.println("맞은개수 : " + cnt);
			System.out.println("틀린개수 : " + (5-cnt));
			if(cnt>=3){
				System.out.println("합격입니다.");
			}
			else{
				System.out.println("불합격입니다.");
			}
		}
	}

