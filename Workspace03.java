package com.naver.erp;

public class Workspace03 {

	public static void main(String[] args) {

		
//1번 문제(x)
		
//	int a = 10, c = 0;
//	long b = 30;
//	c = a + b;
//	System.out.println(c);
	
	
//정답 : 자료형의 우선순위의 불일치 long이 더 큰데 int로 들어가려고 하니까. 형변환이 안된다.
	
//2번 문제(x)
	
//	int a=1, b=5, c=3;
//	c = ++a + b++;
//	//c +=;
//	System.out.println(c);
	
//정답 : 주석처리 계산하면 안됨.
		
// 3번문제 (o)

//	int a = 3;
//	         
//	if( a-- > 4 )
//		
//		a++;
//	
//	if( ++a > 7 )
//		
//		++a;
//	    
//	else
//		
//		a = ++a + a++;
//	        
//	System.out.println(a);
	
//정답 : 8 출력
	        
		
		
		
		
		
	
	
//4번 문제(o-x)
	
//	int a = 2;
//	        
//	switch (a) {
//	        
//	case 1 : a++;
//	case 2 : a++; break;
//	case 3 : a++;
//	
//	}
//	System.out.println(a);
	
//정답 : 
//1.switch 구문의 데이터자료형은 double float은 안된다.
//2.switch 의 (변수)가 실행구문의 case 데이터가 같을 때 case 실행.
	
//case1은 switch의 변수값과 데이터가 같지 않으므로 : 이후의 실행구문 실행x
//case2는 2와 같으므로 : 이후의 실행구문 실행. 
//breakrk 나오면서 switch구문 밖으로 빠져 나오면서 a의 값은 3이된다.
	
//4-1번 응용 문제
//	a = 2;
//        
//	switch (a) {
//            
//	case 1 : a++;
//	case 2 : a++; 
//	case 3 : a++; break;
//             
//}
//System.out.println(a);
	
//정답 : 4가 된다
// case2가 맞아도 break가 없다면 그다음으로 밀고 들어가는데
// case3은 데이터와 변수가 맞지않지만 3은 건너뛰고 밀고 들어간다.
// : 이후의 실행구문 실행하고 break  
	
	
	
// 5번 문제(x)
	
//	int b=1, c=0;
//	for(int a=2; a<5; a++) {
//		
//		if(c++>b) {b=a+c;}
//		
//	}
//	
//	System.out.println(a+b+c);
		
		
	//정답 : Systemprintln의 값중 a는for 문 안에 있기 때문에
	//	a를 for문 밖에서 실행할 수 없다.

		
// 6번 문제(x)
		
//		int a = 0, b = 5;
//					  
//		jump : for( ; ; a++) {
//				
//				for ( ; ; --b ) {
//					
//					if (a>b) break jump;
//						
//				}
//	
//		}
//	   System.out.println(a+b);
	   
// 정답 -1
// 1.
// for문 안에 조건식이 없기때문에 무조건 들어간다.
// for문안의 if 문이 트루가 아니여도 for문의 증강식 조건식이 없기때문에 무한루프이다.
// if 문이 트루가 되면 무한루프 종료. 
	   
// 2.
// for문에서 break를 걸면 for문 밖으로 나가는
// break 뒤에 jump;가 나오면 jump:가 걸려있는 for문 밖으로 빠나가게된다.
	   
		
		
		
		
//문제 7. (x)
	   
//	   int a = 1, b = 5;
//	         
//	   jump : for( ; ; ) {
//		   
//		   a++;
//		 
//		   for( ; ; ) {if (a > --b) break jump;}                   
//		   
//	   }
//	   System.out.println(a + b);
	   
//정답 : 3
//틀린 이유 : for문의 실행구문 안의 구문이 false 일지라도 for문 밖으로 나가지 않는다.
//for 문 밖으로 나가려면 for문의 조건식에 맞지 않아야 빠져나가거나.
//break가 나와야 for 문을 빠져나간다.
		
//8번 문제 (o)
		
//		int a = 0 , b = 5;
//		       
//		outer : for(a=0; a<5; a++) {
//			        
//			inner : for(b=0; b<5; b++) {
//				      
//				if(a==1&&b==0) { break outer; }
//				if(a==2&&b==1) { continue inner; }
//							
//			}
//			
//		}
//		System.out.println(a+b);
		
//정답 : 1
		
		
		
//9번 문제 (o)
//	int a = 0;
//	
//	while( a=1 ) {
//		
//		if(a==3)
//			break;
//		a++;
//		
//	}
//	System.out.println(a);
		
//정답 : 컴파일 에러
//while문 조건식이 true 나 false 여야 한다.
//정답 : a==1이여야 한다.
// 주의 할 점 if 문 실행구문이 한줄이면 {}생략 가능하여 a++은if문 실행구문이 아니라 while 실행문에 소속이다.
	  
		
		
		
		
		
//10번 문제(o)
	
//		int a = 1, b = 0;
//		do {
//			
//			if  (a++ > --b) continue;
//			
//		}while (a<5);
//		System.out.println(a+b);
		
//정답 1출력
//continue는 그다음 실행구문을 실행하지않고 반복문안으로 조건식으로 넘어간다.

		
	int max_starCnt = 5;
	
	for(int i = 1 ; i <= max_starCnt ; i = i+2) {
		     
		for(int j=1 ; j <= (max_starCnt-i)/2 ; j++) {
			    
			System.out.print(" ");
			
		}
		
		for(int j=1 ; j <=i ; j++) {
			    
			System.out.print("*");
		}
		
		System.out.print("\n");
		
	}
		
// 과정 찾아가면 정답은 아래와 같이 나온다.
//		공백 한번 찍음./공백 한번 찍음/별찍음/줄바꿈.
//		공백 한번 찍음./별찍음/별찍음/별찍음/줄바꿈.
//		한번찍음/찍 / 찍 / 찍 / 찍/ 줄바꿈,
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
