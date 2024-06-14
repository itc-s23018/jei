//s23018
//ポリモフィズムの課題
//動物の鳴き声を出力させるプログラム


//スーパークラスAnimalの定義
class Animal {
		public void makeSound() {
				System.out.println("動物の音");
		}

		public void test() {
				System.out.println("テスト出力");
		}

}

//継承したサブクラスDogの定義
class Dog extends Animal {
		public void makeSound() {
				System.out.println("ワンワン");
		}
}

//課題２　サブクラスとして新しくCatを作成
class Cat extends Animal {
		public void makeSound() {
				System.out.println("ニャー");
		}
}

public class d48Q2kadai {
		public static void main(String[] args) {
				Animal a = new Dog();
				a.makeSound();	
				a.test(); 

				Animal b = new Cat();  
				b.makeSound();
		}
}












