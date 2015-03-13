

public class Program {
	public static void main(String[] args) {
	
		Locker l1 = new Locker(100, "Micky Mouse", new CombinationLock(28, 17,
				39), 3);
		
		Locker l2 = new Locker(275, "Donald Duck", new CombinationLock(35, 16,
				27), 0);
		
		l1.openLocker();
		l1.putBookInLocker();
		l1.putBookInLocker();
		l1.putBookInLocker();
		l2.removeBookFromLocker();
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
	}

}
