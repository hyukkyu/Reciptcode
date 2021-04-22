package Java5;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P6 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 지정된 형식대로 날짜와시간을 출력하기 위해서 df객체 생성
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 지정된 형식대로 날짜와시간을 출력하기 위해서 df2객체 생성
		SimpleDateFormat df3 = new SimpleDateFormat("yyyyMMdd");
		// 지정된 형식대로 날짜와시간을 출력하기 위해서 df3객체 생성
		Date date = new Date();
		// date객체 생성
		DecimalFormat f = new DecimalFormat("#,#00");
		// 백단위로 표시하기 위해서 f객체 생성
		String[] k02_itemname = { "콘칩은할인중", "바나나우유는노란색", "건포도는검은색이고맛있다", "오렌지주스는행사안함", "초코에몽은어린이사면할인", "칸쵸행사없음",
				"오예스는행사할인중", "쿨피스는하하나더", "참이슬소주는적당히", "칙촉은사면두개더", "콘프라이트는행사할인중", "오레오는행사없음", "홈런볼은홈런쳐야지", "스윙칩은바삭바삭",
				"감자칩은성장중", "고래밥은어린이용할인", "맛동산하나더 사면 하나더", "짱구는행사없음", "오징어땅콩은우빈이 줄게", "뽀도는병관이가 제일 좋아해", "사브레는진선이가 싫어함",
				"새우깡은중년킴의 최애", "마가렛트는행사중", "코카콜라는행사없", "몽쉘은나의최애과자", "제크는몇개일까", "죠리퐁은우유랑 같이", "포스틱은빠따랑비슷해", "양파링은부셔야제맛",
				"사과는하루에몇개" };
		

		// 각각의 물건의 이름들을 배열에 저장
		int[] k02_price = { 1000, 2500, 3300, 25000, 1000, 1100, 3200, 9000, 1800, 2400, 3800, 2400, 1800, 1900, 2100,
				1700, 2100, 1500, 1900, 1900, 2300, 1400, 3200, 1300, 3400, 2300, 1400, 2300, 1200, 1100 };
		// 각각의 물건의 가격들을 배열에 저장
		int[] k02_num = { 2, 4, 1, 1, 10, 3, 3, 7, 14, 3, 1, 6, 8, 5, 11, 9, 3, 3, 5, 4, 9, 2, 5, 5, 1, 1, 3, 6, 3, 9 };
		// 각각의 물건의 개수들을 배열에 저장
		boolean[] k02_taxfree = { false, true, false, true, false, false, false, true, false, false, false, true, false,
				true, false, false, false, true, false, true, false, true, false, true, false, false, true, false, false,
				false };
		// 과세물품이면 true, 아니면 false
		double k02_rate = 0.1;
		// 세율 0.1를 실수형 변수k02_rate에 저장
		int k02_taxfree_total = 0; // 면세물건의 총가격을 구하기 위해서 변수 생성
		int k02_tax_total = 0; // 과세물건의 총가격을 구하기 위해서 변수 생성
		int k02_beforetaxprice = 0;
		for (int k02_i = 0; k02_i < k02_taxfree.length; k02_i++) { // 반복문 실행 총 30번실행
			if (k02_taxfree[k02_i] == true) { // 면세물건이면
				k02_taxfree_total += k02_price[k02_i] * k02_num[k02_i];

				// 면세물건의 총합을 구한다
			} else if (k02_taxfree[k02_i] == false){ // 면세물건이 아니면
				k02_tax_total += k02_price[k02_i] * k02_num[k02_i];

				// 과세물건의 총가격을 구한다
			}
		}
		k02_beforetaxprice = (int) ((k02_tax_total) / (1 + k02_rate));
		// 세전가격을 구하기 위해서 소비자가격을 (1+0.1)로 나눠준다.
		// 형변환
		int k02_tax = k02_tax_total - k02_beforetaxprice;
		// 부가세를 구하기 위해서 소비자가격에서 세전가격을 뺀다
		System.out.printf("            이마트 죽전점 (051)888-1234\n");
		// "이마트 죽전점 (051)888-1234"출력하고 줄바꿈
		System.out.printf("            206-86-50913 강희석\n");
		// "206-86-50913 강희석"출력하고 줄바꿈
		System.out.printf("            용인 수지구 포은대로 552\n");
		// "용인 수지구 포은대로 552"출력하고 줄바꿈
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		// "영수증 미지참시 교환/환불 불가"출력하고 줄바꿈
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		// "정상상품에 한함, 30일 이내(신선 7일)"출력하고 줄바꿈
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		// "교환/환불 구매점에서 가능(결제카드 지참)"출력하고 줄바꿈
		System.out.printf("\n"); // 줄바꿈
		System.out.printf("[구 매]%s    POS:0011-9861\n", df.format(date));
		// 구매날짜를 출력
		System.out.printf("----------------------------------------\n");
		// 줄바꿈
		System.out.printf(" 상 품 명         단 가  수량      금 액\n");
		// 상품명,단가,수량,금액 출력하고 줄바꿈
		System.out.printf("----------------------------------------\n");
		// 줄바꿈
		int k02_total_price = 0; // 총가격을 담기 위해서 변수 생성
		for (int k02_i = 0; k02_i < k02_price.length; k02_i++) { // 총 30번 실행
			if (k02_itemname[k02_i].length() >= 6) {	//각 원소들의 길이가 6보다 크면
				k02_itemname[k02_i] = k02_itemname[k02_i].substring(0, 5);	//5글자로 나타낸다.
			}
			int num = 10 - k02_itemname[k02_i].getBytes("EUC-KR").length;	//한글은 2바이트 5글자면 10바이트 영어나 특수문자는 1바이트여서 10에서 각원소들의 바이트를 빼서 num에 저장
			for (int k02_j = 0; k02_j < num; k02_j++) {	//num의 길이만큼 for문 실행
				k02_itemname[k02_i] = k02_itemname[k02_i] + " ";	//나머지를 빈칸으로 메꿔서 10바이트로 맞춘다
			}
			
			k02_total_price += k02_price[k02_i] * k02_num[k02_i]; // 해당물건들의 가격과 갯수들을 곱해서 가격을 구한다
			if (k02_taxfree[k02_i] == true) {	//면세물건이면 
				System.out.printf("*%s%12s%4d%13s\n", k02_itemname[k02_i], f.format(k02_price[k02_i]), k02_num[k02_i],	//*를 붙인다
						f.format(k02_price[k02_i] * k02_num[k02_i]));
			} else {//아니면 빈공백
				System.out.printf(" %s%12s%4d%13s\n", k02_itemname[k02_i], f.format(k02_price[k02_i]), k02_num[k02_i],
						f.format(k02_price[k02_i] * k02_num[k02_i]));
			}

			// 물건들의이름과 가격,갯수, 해당물건의 가격을 출력
			if ((k02_i + 1) % 5 == 0) { // 다섯개로 끊기 위해서
				System.out.printf("----------------------------------------\n");
			}
		}
		int k02_count = 0; // 산 물건들의 총갯수를 담기 위한 변수생
		for (int k02_i = 0; k02_i < k02_num.length; k02_i++) { // 총 30번 반복
			k02_count += k02_num[k02_i]; // 산 물건들의 총갯수
		}
		System.out.printf("            총 품목 수량 %15d\n", k02_count);
		System.out.printf("         (*)면 세  물 품%16s\n", f.format(k02_taxfree_total));
		System.out.printf("            과 세  물 품%16s\n", f.format(k02_beforetaxprice));
		System.out.printf("            부   가   세%16s\n", f.format(k02_tax));
		System.out.printf("            합        계%16s\n", f.format(k02_taxfree_total + k02_tax_total));
		System.out.printf("결 제 대 상 금 액%23s\n", f.format(k02_taxfree_total + k02_tax_total));
		System.out.printf("----------------------------------------\n");
		System.out.printf("0012 KEB 하나       541707**0484/3586058\n");
		System.out.printf("카드결제(IC)            일시불 / %s\n",
				f.format(k02_taxfree_total + k02_tax_total + k02_tax));
		System.out.printf("----------------------------------------\n");
		System.out.printf("          [신세계포인트 적립]\n");
		System.out.printf("권*규 고객님의 포인트 현황입니다.\n");
		System.out.printf("금화발생포인트      9350**9995       164\n");
		System.out.printf("누계(가용)포인트        5,637(    5,473)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("    구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호 :                      34저****\n");
		System.out.printf("입차시간 : %29s\n", df2.format(date));
		System.out.printf("----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                    1150\n");
		System.out.printf("     ililililililililililililililili\n");
		System.out.printf("     ililililililililililililililili\n");
		System.out.printf("      %s/00119861/00164980/31", df3.format(date));

	}

}
