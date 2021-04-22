package Java5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //yyyy.MM.dd HH:mm:ss로 써서 년.월.일 시:분:초로 출력된다 
		SimpleDateFormat df2 = new SimpleDateFormat("MM월dd일");	//MM월dd일로 표현한다.
		Calendar cal = Calendar.getInstance();	//달력을 호출한다
		DecimalFormat dc = new DecimalFormat("#,#00");
		//백단위로 끊어서 표시하기 위해서
		Date date = new Date(); //날짜와 시간을 표시하기위해서 date객체 생성
		cal.setTime(date);	//날짜를 불러온다
		cal.add(Calendar.DATE, 14);	//14일을 더해준다
		String futuredate = df2.format(cal.getTime()); // 14일 더한 날짜를 변수 futuredate에 저장
		double k02_rate = 0.1;
		//실수형 변수k02_rate에 세율 0.1 저장
		String k02_itemname1 = "퓨어에어비말차단용마스크(최고급형)";
		//문자열 변수 k02_itemname1에 "퓨어에어 비말차단용마스크(최고급형)"저장 
		String k02_itemcode1 = "103165";
		//문자열 변수 k02_itemcode1에 "103165"저장 
		int k02_price1 = 3000;
		//정수형 변수 k02_price1에 3000저장
		int k02_amount1 = 1;
		//정수형 변수 k02_amount1에 1저장 
		
		String k02_itemname2 = "슬라이드식명찰(가로형)(100호)";
		//문자열 변수 k02_itemname2에 "슬라이드식명찰(가로형)(100호)"저장 
		String k02_itemcode2 = "1008152";
		//문자열 변수 k02_itemcode2에 "1008152" 저장 
		int k02_price2 = 1000;
		//정수형 변수k02_price2에 1000저장 
		int k02_amount2 = 1;
		//정수형 변수 k02_amount2에 1 저장 
		
		String k02_itemname3 = "매직흡착인테리어후크(알루미늄타입)";
		//문자열 변수 k02_itemname3에 "매직흡착 인테리어후크(알루미늄타입)"저장 
		String k02_itemcode3 = "1020800";
		//문자열 변수 k02_itemcode3 "1020800"저장 
		int k02_price3 = 1000;
		//정수형 변수 k02_price3에 1000저장 
		int k02_amount3 = 1;
		//정수형 변수 k02_amount3에 1저장 
		int k02_sumprice = (k02_price1 * k02_amount1) +(k02_price2 * k02_amount2) + (k02_price3 * k02_amount3);
		//구매한 총가격을 구하기 위해서 그 값과 해당하는 개수를 곱해서 다른물건들의 총합과 더해준다.
		int k02_beforPrice= (int)(k02_sumprice / (1 + k02_rate));
		//세전가격을 구하기 위해서 총가격을 (1 + k02_rate) + 1로 나눠준다 여기서 +1은 1원단위를 처리하기 위해서 쓰이고 소수점을 버리기 위해서 형변환
		int k02_taxprice = k02_sumprice - k02_beforPrice;
		//부가세를 구하기 위해서 총가격에서 세전가격을 빼준다 
		
		System.out.printf("            \"국민가게, 다이소\"\n");
		//"국민가게, 다이소"출력하고 줄바꿈
		System.out.printf("(주)아성다이소_분당서현점\n");
		//"주)아성다이소_분당서현점"출력하고 줄바꿈 
		System.out.printf("전화:031-702-5016\n");
		//"전화:031-702-5016"출력하고 줄바꿈 
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		//"본사:서울 강남구 남부순환로 2748 (도곡동)"출력하고 줄바꿈 
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		//"대표:박정부,신호섭 213-81-52063"출력하고 줄바꿈 
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		//"매장:경기도 성남시 분당구 분당로53번길 11 (서현\n동)\n"출력하고 줄바꿈
		System.out.printf("=========================================\n");
		//줄바
		System.out.printf("       소비자중심경영(CCM) 인증기업\n");
		//"소비자중심경영(CCM) 인증기업"출력하고 줄바꿈 
		System.out.printf("     ISO 9001 품질경영시스템 인증기업\n");
		//"ISO 9001 품질경영시스템 인증기업"출력하고 줄바꿈 
		System.out.printf("=========================================\n");
		//줄바꿈 
		System.out.printf("      교환/환불 14일(%s)이내,\n", futuredate);
		//"교환/환불 14일(03월12일)이내,"출력하고 줄바꿈 
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		//"(전자)영수증, 결제카드 지참 후 구입매장에서 가능"출력하고 줄바꿈 
		System.out.printf("     포장/가격 택 훼손시 교환/환불 불가\n");
		//"포장/가격 택 훼손시 교환/환불 불가"출력하고 줄바꿈 
		System.out.printf("       체크카드 취소 시 최대 7일 소요\n");
		//"체크카드 취소 시 최대 7일 소요"출력하고 줄바꿈 
		System.out.printf("=========================================\n");
		//줄바꿈
		System.out.printf("[PDS 1058231]      %22s\n",df.format(date));
		//"[PDS 1058231]" 현재날짜 출력하고 줄바꿈 
		System.out.printf("=========================================\n");
		//줄바꿈 
		System.out.printf("%.7s%12s%3s%12s\n",k02_itemname1,dc.format(k02_price1),k02_amount1,dc.format(k02_price1*k02_amount1));
		//물건 첫번째 품목, 갯수,총합을 출력 
		System.out.printf("[%s]\n",k02_itemcode1);
		//물건 첫번째 코드 출력 
		System.out.printf("%.7s%12s%3s%12s\n",k02_itemname2,dc.format(k02_price2),k02_amount2,dc.format(k02_price2*k02_amount2));
		//물건 두번째 품목,갯수,총합을 출력 
		System.out.printf("[%s]\n",k02_itemcode2);
		//물건 두번째 코드 출력 
		System.out.printf("%.7s%12s%3s%12s\n",k02_itemname3,dc.format(k02_price3),k02_amount3,dc.format(k02_price3*k02_amount3));
		//물건 세번째 품목,갯수,총합을 출력 
		System.out.printf("[%s]\n",k02_itemcode3);
		//물건 세번째 코드 출력 
		System.out.printf("         과세합계%24s\n",dc.format(k02_beforPrice));
		//과세합계를 출력 
		System.out.printf("           부가세%24s\n", dc.format(k02_taxprice));
		//부가세금액을 출력 
		System.out.printf("-----------------------------------------\n");
		//줄바꿈 
		System.out.printf("판매합계%33s\n",dc.format(k02_sumprice));
		//판맨합계 금액 출력 
		System.out.printf("=========================================\n");
		//줄바꿈 
		System.out.printf("신용카드%33s\n",dc.format(k02_sumprice));
		//신용카드로 긁은 금액 출력 
		System.out.printf("-----------------------------------------\n");
		//줄바꿈 
		System.out.printf("우리카드                 538720**********\n");
		//"우리카드                538720**********"출력하고 줄바꿈 
		System.out.printf("승인번호 77982843(0)  승인금액 %10s\n",dc.format(k02_sumprice));
		//"승인번호 77982843(0)        승인금액 "출력하고 줄바꿈 
		System.out.printf("=========================================\n");
		//줄바꿈 
		System.out.printf("     %s 분당서현점\n",df.format(date));
		//현재날짜 출력 
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		//"상품 및 기타 문의 : 1522-4400"출력하고 줄바꿈 
		System.out.printf("멤버쉬 및 샵다이소 관련 문의 : 1599-2211\n");
		//"멤버쉬 및 샵다이소 관련 문의 : 1599-2211"출력하고 줄바꿈 
		System.out.printf("          ililililililililililil\n");
		System.out.printf("          ililililililililililil\n");
		System.out.printf("             2112820610158231\n");
		//"2112820610158231"출력하고 줄바꿈 
		System.out.printf("-----------------------------------------\n");
		//줄바꿈 
		System.out.printf("* 다이소 멤버쉽 앱 또는 홈페이지에 접속하셔서  회원가입 후 다양한 혜택을 누려보세요! *");
		//"* 다이소 멤버쉽 앱 또는 홈페이지에 접속하셔서\n  회원가입 후 다양한 혜택을 누려보세요! *"출력 
	}

}