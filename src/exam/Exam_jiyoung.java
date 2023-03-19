package exam;
import java.util.Scanner;
public class Exam_jiyoung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []exam = {"a","b","c","d","a"};
		String []nara = {"캐나다", "한국", "미국", "일본","중국"};
		String []ex = {"a.벤쿠버 b.토론토 c.오타와 d.재스퍼",
			"a.벤쿠버 b.토론토 c.오타와 d.재스퍼","a.벤쿠버 b.토론토 c.오타와 d.재스퍼",
			"a.벤쿠버 b.토론토 c.오타와 d.재스퍼","a.벤쿠버 b.토론토 c.오타와 d.재스퍼",};
		String []user = new String [5];
		

		for (int i = 0; i<exam.length ; i++ ){
			System.out.println((i+1)+"번\t"+nara[i] + "의 수도는 무엇일까요?");
			System.out.println(ex[i]);
			user[i] = sc.next();
		}

		for (int i = 1;i<=5 ;i++ ){
			System.out.print(i + "\t");
		}
			System.out.println() ;
			
		int cnt = 0;
		for (int i = 0 ; i<user.length ;i++ ){ 
			if (exam[i] .equals(user[i]) ){
			
				System.out.print("o\t");
				cnt++;
			}
			else{
				System.out.print("x\t");
			}
			
		}System.out.println();
		
		System.out.println("정답 횟수 : " + cnt);
		System.out.println("오답 횟수 : " + (5-cnt));
		if(cnt>=3){
				System.out.println("합격입니다.");
			}
			else{
				System.out.println("불합격입니다.");
			}
		
		

	}

}
