import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요: ");
		String name = input.next();
		
		System.out.print("연락처를 입력하세요: ");
		int phone = input.nextInt(); // 숫자만 입력
		
		String greeting = "Welcome to Shopping Mall!";
		String tagline = "Welcome to Book Market!";
		
		boolean quit = false;
		
		while ( !quit ) {
			System.out.println("********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("********************************************");
			System.out.println("1. 고객 정보 확인하기 \t\t5. 바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상풍 목록 보기 \t6. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기 \t\t7. 장바구니의 항목 삭제하기");
			System.out.println("4. 영수증 표시하기 \t\t8. 종료");
			System.out.println("********************************************");
		
			System.out.print("메뉴 번호 1번부터 8번 중에 선책하세요: ");
			int choice = input.nextInt();
		
			if ( choice < 1 || choice > 8 ) {
				System.out.print("메뉴 번호 1번부터 8번 중에 선택하세요: ");
			}
			else {
				switch ( choice ) {
					case 1:
						System.out.println("1. 현재 고객의 정보");
						System.out.println("이름: " + name + "\n연락처: " + phone);
						break;
					case 2:
						System.out.println("2.장바구니 상품 목록 보기");
						break;
					case 3:
						System.out.println("3. 장바구니가 비우기");
						break;
					case 4:
						System.out.println("4. 영수증 출력하기");
						break;
					case 5:
						System.out.println("5. 장바구니에 새로운 항목 추가하기");
						break;
					case 6:
						System.out.println("6. 장바구니 항목의 수량 줄이기");
						break;
					case 7:
						System.out.println("7. 장바구니에서 삭제할 항목 고르기");
						break;
					case 8:
						System.out.println("8. 종료");
						break;
				}
			}
		}

	}

}
