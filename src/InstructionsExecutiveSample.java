
public class InstructionsExecutiveSample {

	public static void main(String[] args) {
		String name = "田中";
		int age = 20;
		
		//画面に出力する命令
		System.out.println("自己紹介をします");
		System.out.printf("私の名前は%sです。年齢は%dです。\n", name, age);

		
		
		
		System.out.println("--------");
		
		
		
		//最大値を返す表示
		int i = Math.max(10, 20);
		System.out.println("最大値：" +i);
		
		
		
		System.out.println("--------");
		
		
		
		//名前を入力を案内
		System.out.println("名前を入力してください");
		name = new java.util.Scanner(System.in).nextLine();
		
		//年齢の入力を案内
		System.out.println("年齢を入力してください");
		age = new java.util.Scanner(System.in).nextInt();
		
		//画面に出力（複数引数）
		System.out.printf("私の名前は%sです。年齢は%dです。\n", name, age);
		
		
		
		System.out.println("--------");
		
		
		
		//さいころの数字をランダムに出力
		int x = new java.util.Random().nextInt(6);
		//さいころの目に合わせるため1を足す
		x++;
		//画面に出力
		System.out.println("さいころの出た目：" + x);
		
	}

}
