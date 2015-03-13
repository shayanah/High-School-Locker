
import java.util.Scanner;

public class Locker {
	
	private CombinationLock lock;
	private int bookNumber;
	
	private int lockerNumber;
	private String studentName;
	
	/**
	 * Create a locker with its parameters
	 * @param lockerNumber
	 * @param studentName
	 * @param lock
	 * @param bookNumber
	 */
	public Locker(int lockerNumber, String studentName, CombinationLock lock, int bookNumber)
	{
		this.lockerNumber = lockerNumber;
		this.studentName = studentName;
		this.lock = lock;
		this.bookNumber = bookNumber;
	}
	/**
	 * initiate a locker class with zero book into it
	 */
	public Locker()
	{
		bookNumber = 0 ;
		lock = new CombinationLock();
	}
	public void putBookInLocker()
	{
		bookNumber++;
	}
	/**
	 * remove one book from the locker
	 * @return
	 */
	public boolean removeBookFromLocker()
	{
		if(bookNumber != 0 )
		{
			bookNumber--;
			System.out.println("The book removed successfully.");
			return true;
		}
		else
		{
			System.out.println("There is currently no book in the locker.");
			return false;
		}
			
			
	}
	/**
	 * check if locker opened with the combination that student input
	 */
	public void openLocker()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the first combination: ");
		int c1 = in.nextInt();
		System.out.print("Please input the second combination: ");
		int c2 = in.nextInt();
		System.out.print("Please input the third combination: ");
		int c3 = in.nextInt();
		
		boolean result = lock.openLock(c1, c2, c3);
		if(result)
			System.out.println("atempt was successfull.");
		else
			System.out.println("atempt denied.");
	
	}
	
	@Override
	/** 
	 * print out attributes
	 */
	public String toString() {
		String s;
		s = "Locker Number: " ;
		s += lockerNumber + "\n";
		
		s += "Student Name: ";
		s += studentName + "\n" ;
		
		s += "Combination Lock: ";
		s += lock + "\n";
		
		s += "Number of books: ";
		s += bookNumber + "\n";
		
		return s;
	}

	

	public CombinationLock getLock() {
		return lock;
	}

	public void setLock(CombinationLock lock) {
		this.lock = lock;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getLockerNumber() {
		return lockerNumber;
	}

	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}	
