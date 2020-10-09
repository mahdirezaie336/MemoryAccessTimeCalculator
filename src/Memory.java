
public class Memory
{
	private String name;
	private long accessTime;
	private double hitrate;
	private int cost;
	private long size;
	
	public Memory(String name, long accessTime, double hitrate, int cost, long size)
	{
		this.name = name;
		this.accessTime = accessTime;
		this.hitrate = hitrate;
		this.cost = cost;
		this.size = size;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public long getAccessTime()
	{
		return accessTime;
	}

	public void setAccessTime(long accessTime)
	{
		this.accessTime = accessTime;
	}

	public double getHitrate()
	{
		return hitrate;
	}

	public void setHitrate(double hitrate)
	{
		if(hitrate > 1 || hitrate < 0)
			throw new RuntimeException("Invalid hitrate.\nHitrate must be between 0.0 and 1.0.");
		this.hitrate = hitrate;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public long getSize()
	{
		return size;
	}

	public void setSize(long size)
	{
		this.size = size;
	}

}
