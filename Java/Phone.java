package Java;

public class Phone {
	String name;
	int memoryRam;
	
	//constructor
	public Phone(String name)
	{
		this.name = name;
	}
	
	public Phone(String name, int Test)
	{
		this.name = name;
		this.memoryRam = Test;
	}
	
	//creating a method for this class
	public void playMusic(String Music)
	{
		System.out.println("Now playing: " + Music);
	}
	
	private int hdd;
	
	//setter
	public void sethdd(int hddCapacity)
	{
		this.hdd = hddCapacity;
	}
	
	//getter
	
	public int gethdd()
	{
		return this.hdd;
	}
	
}
