/*
public class BasicLion {

	int height;
	int weight;
	int age;
	boolean sex;   // true:��, false:��
	
	int running(int x, int y) {		// �޸���
		int result = (age*x)-y;
		return result;
	}
	boolean fight(BasicLion x) {	// �ο��
		boolean result = true;
		if( height > x.height && weight > x.weight ) 
			 result = true;
		else result = false;
		return result;
	}
	boolean hunting() {				// ����ϱ�
		if( age > 20 ) return false;
		else return true;
	}
	String sleeping() {				// ���ڱ�
		return "Going to Sleep!!!";
	}
	void printOut() {
		System.out.println("height="+height);
		System.out.println("weight="+weight);
		System.out.println("age="+age);
		System.out.println("sex="+( sex ? "MAIL" : "FEMAIL"));
	}
	
	public static void main(String[] args) {

		BasicLion a = new BasicLion();
		BasicLion b = new BasicLion();
		
		a.height = 160;
		a.weight = 100;
		a.age = 10;
		a.sex = true;
		
		b.height = 130;
		b.weight = 90;
		b.age = 9;
		b.sex = false;
		
		System.out.println("[A Lion]");
		a.printOut();
		System.out.println("running = "+a.running(5, 20));
		System.out.println("hunting = "+a.hunting());
	
		System.out.println("[B Lion]");
		b.printOut();
		System.out.println("running = "+b.running(6, 30));
		System.out.println("hunting = "+b.hunting());
		
		boolean result = b.fight(a);  // a�� b�� �ο��
		String win = result ? "B Lion WINNER!!" : "A Lion WINNER!!";
		System.out.println("A FIGHT B : "+win);
		
		System.out.println("A Lion : "+a.sleeping());
		System.out.println("B Lion : "+b.sleeping());
		
		a = b = null;
		System.gc();
		
	}

}
*/