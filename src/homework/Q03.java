package homework;

public class Q03 {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println((byte)(b + i));
		
		// -29 가 왜 뜨는지 설명하라.

		// 127 + 100 = 227
		// int 227 은 2진수로 00000000 00000000 00000000 11100011
		// byte 형 변환했으므로 1byte 만 잘라낸다. 
		// 11100011
		// 맨 첫자리(부호비트)가 1 이므로 음수다.
		// 음수는 1의 보수 구해서 + 1 하면 값을 알 수 있다.
		// 11100011
		// 00011100 ------- 1의 보수
		// 00011101 ------- 1의 보수 + 1
		// 0 0 0 1 1 1 0 1
		//      16+8+4  +1 = 29
		// 그래서 -29
	}
}
