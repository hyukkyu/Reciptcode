package Java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dc = new DecimalFormat("#,#00");
		//백단위 끊어서 표시하기 위해서 #,#00을 쓴다 
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//년/월/일 시:분:초 이런 형식으로 나타내기 위해서 yyyy//MM//dd HH:mm:ss로 표현한다
		Date date = new Date();
		//현재 날짜,시간을 가져온다
		int k02_iPrice = 33000; //정수형 변수 k02_iPrice에 30000원 저장
		int k02_price = (int)((k02_iPrice)/(1 + 0.1) + 1);
		//세전가격을 구한다. 1원단위돈을 처하기 위해서 +1를 해주고 정수형태로 형변환해서 소수점 없앤다 
		double k02_rate = 0.1;
		//실수형 변수인 k02_rate에 세율 0.1저장
		int k02_tax = k02_iPrice - k02_price;
		//부가세 가격을 구하기 위해서 소비자가격에서 세전가격을 빼준다.
		
		System.out.printf(" 신용승인\n");	//신용승인 출력하고 줄바꿈
		System.out.printf("단말기 : 2N68665898     전표번호 : 041218\n");
		//"단말기 : 2N68665898 전표번호 : 041218" 출력하고 줄바꿈
		System.out.printf("가맹점 : 한양김치찌개\n");
		//"가맹점 : 한양김치찌개 출력하고" 줄바꿈
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번\n길 10 . 1층\n");
		//"주  소 : 경기 성남시 분당구 황새울로351번길 10"출력하고 줄바꿈 "1층"출력하고 줄바
		System.out.printf("대표자 : 유창신\n");
		//"대표자 : 유창신" 출력하고 줄바꿈
		System.out.printf("사업자 : 752-53-00558       TEL : 7055695\n");
		//"사업자 : 752-53-00558  TEL : 7055695"출력하고 줄바꿈
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//-----출력하고 줄바꿈
		System.out.printf("금  액 %31s 원\n", dc.format(k02_price));
		//"금액"의 값을 출력하는데 백단위로 끊어서 표시  
		System.out.printf("부가세 %31s 원\n", dc.format(k02_tax));
		//"부가세"의 값을 출력하는데 백단위로 끊어서 표시 
		System.out.printf("합  계 %31s 원\n",dc.format(k02_iPrice));
		//"합계"의 값을 출력하는데 백단위로 끊어서 표시
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		//줄바꿈
		System.out.printf(" 우리카드\n");
		//"우리카드"출력하고 줄바꿈 
		System.out.printf("카드번호 :  5387-20**-****-4613(S) 일시불\n");
		//"카드번호 : 5387-20**-****-4613(S)   일시불"출력하고 줄바꿈 
		System.out.printf("거래일시 : %s\n", df.format(date));
		//현재날짜와 시간을 지정된 형식대로 출력
		System.out.printf("승인번호 : 70404427\n");
		//"승인번호 : 70404427"출력하고 줄바꿈 
		System.out.printf("거래번호 : 357734873739\n");
		//"거래번호 : 357734873739"출력하고 줄바꿈
		System.out.printf("매입 : 비씨카드사        가맹 : 720068568\n");
		//"매입 : 비씨카드사        가맹 : 720068568"출력하고 줄바꿈
		System.out.printf("알림 : EDC매출표\n");
		//"알림 : EDC매출표" 출력하고 줄바꿈
		System.out.printf("문의 : TEL)1544-4700\n");
		//"문의 : TEL)1544-4700"출력하고 줄바꿈
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//줄바꿈
		System.out.printf("           * 감사합니다 *\n");	//"*감사합니다"출력하고 줄바꿈
		System.out.printf("                       표준V2.08_20200212");	//"표준V2.08_20200212"출력하고 줄바꿈
	}
}
