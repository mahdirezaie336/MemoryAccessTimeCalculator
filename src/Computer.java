import java.util.ArrayList;

public class Computer
{
	private ArrayList<Memory> memories;
	
	public Computer()
	{
		memories = new ArrayList<Memory>();
	}
	
	public double calculateAverageAccessTime(int index)
	{
		if(memories.size() <= index)
			throw new RuntimeException("Wrong memory index.");
		
		Memory mem = memories.get(index);
		if(index == memories.size() - 1)
			return mem.getAccessTime();
		
		double hitrate = mem.getHitrate();
		long accessTime = mem.getAccessTime();
		return accessTime + (1.0 - hitrate)*calculateAverageAccessTime(index+1);
	}
	
	public long calculateTotalSize()
	{
		long total = 0;
		for(Memory mem : memories)
			total += mem.getSize();
		return total;
	}
	
	public int calculateTotalCost()
	{
		int total = 0;
		for(Memory mem : memories)
			total += mem.getCost();
		return total;
	}
	
	public Computer addMemory(Memory mem)
	{
		memories.add(mem);
		return this;
	}

	public static void main(String[] args)
	{
		Computer c = new Computer();
		Memory A = new Memory("A", 1, 0.2, 100, 10);
		Memory B = new Memory("B", 5, 0.25, 70, 20);
		Memory C = new Memory("C", 20, 0.4, 45, 70);
		Memory D = new Memory("D", 100, 0.7, 33, 500);
		Memory E = new Memory("E", 1000000, 0.95, 5, 4*1024);
		
		Memory m1 = new Memory("M1", 5, 0.6, 0, 0);
		Memory mn = new Memory("Mn", 10, 0.65, 0, 0);
		Memory m2 = new Memory("M2", 70, 0.7, 0, 0);
		Memory m3 = new Memory("M3", 500, 0.9, 0, 0);
		Memory main = new Memory("Main", 10000000, 1, 0, 0);
		
		c.addMemory(m1)
		 .addMemory(mn)
		 .addMemory(m2)
		 .addMemory(m3)
		 .addMemory(main);
		
		System.out.println(c.calculateAverageAccessTime(0)
							+ " | Total size: " + c.calculateTotalSize()
							+ " | Total cost: " + c.calculateTotalCost());
	}

}
