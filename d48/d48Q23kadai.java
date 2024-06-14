//s23018
//contineの上にSystem~を書くように修正したら、エラーにならず、ちゃんと実行された
class d48Q23kadai {
		public static void main(String[] args){
				int i = 1;
				for (;;) {
						i = i + 3;
						if (i < 10) {
								System.out.println(i);
								continue;
				} else {
						break;
		
				}
				}
		}
}
