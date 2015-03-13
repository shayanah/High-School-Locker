
public class CombinationLock {
	
	
	private int currentPosition;
	private int size;
	private int combination1, combination2, combination3 ;
	public CombinationLock()
	{
		currentPosition = 0 ;
		size = 40;
	}
	
	public CombinationLock(int combination1, int combination2, int combination3) {
		this.combination1 = combination1;
		this.combination2 = combination2;
		this.combination3 = combination3;
		resetDial();
		size = 40;
	}

	@Override
	/**
	 * print out the combination for this particular lock
	 * @return
	 */
	public String toString() {
		return "CombinationLock [" + " combination1= " + combination1
				+ ", combination2= " + combination2 + ", combination3= "
				+ combination3 + "]";
	}
	
	/**
	 * reset dial to zero
	 */
	public void resetDial()
	{
		currentPosition = 0 ;
	}
	/**
	 * turn the combination lock to the left for the number of the ticks
	 * @param ticks
	 * @return
	 */
	public int turnLeft(int ticks)
	{
		
		currentPosition = (currentPosition - (ticks % size) + size) % size;
		return currentPosition;
	}
	/**
	 * turn the combination lock to the right for the number of the ticks
	 * @param ticks
	 * @return
	 */
	public int turnRight(int ticks)
	{
		currentPosition = (currentPosition + ticks) % size;
		return currentPosition;
	}
	/**
	 * tries to open the lock with a combination
	 * @param combination1
	 * @param combination2
	 * @param combination3
	 * @return
	 */
	public boolean openLock(int combination1,int combination2, int combination3)
	{
		if(turnRight(combination1) == this.combination1
				&& turnLeft(combination2) == this.combination2 
				&& turnRight(combination3) == this.combination3)
			return true;
		else
			return false;
	}
	
	
	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCombination1() {
		return combination1;
	}

	public void setCombination1(int combination1) {
		this.combination1 = combination1;
	}

	public int getCombination2() {
		return combination2;
	}

	public void setCombination2(int combination2) {
		this.combination2 = combination2;
	}

	public int getCombination3() {
		return combination3;
	}

	public void setCombination3(int combination3) {
		this.combination3 = combination3;
	}

}
