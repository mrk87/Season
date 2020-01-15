import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner stdIn = new Scanner(System.in);

		int retry;

		do {
			System.out.println("계절을 표시합니다. \n 몇 월입니까? :");
			int month = stdIn.nextInt();

			if (month >= 3 && month <= 5)
				System.out.println("이것은 봄입니다");
			else if (month >= 6 && month <= 8)
				System.out.println("이것은 여름입니다");
			else if (month >= 9 && month <= 11)
				System.out.println("이것은 가을입니다");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("이것은 겨울입니다");

			System.out.println("다시 한번? 1...Yes/0...No :");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
