
public class ListItem implements Comparable<ListItem>
{
	private String memories;
	private double accessTime;
	private long totalSize;
	private int totalCost;
	
	public ListItem(String memories, double accessTime, long totalSize, int totalCost)
	{
		super();
		this.memories = memories;
		this.accessTime = accessTime;
		this.totalSize = totalSize;
		this.totalCost = totalCost;
	}

	public double getAccessTime()
	{
		return accessTime;
	}



	public long getTotalSize()
	{
		return totalSize;
	}



	public int getTotalCost()
	{
		return totalCost;
	}
	
	@Override
	public int compareTo(ListItem item)
	{
		if(item.getAccessTime() > this.getAccessTime())
			return -1;
		if(item.getAccessTime() == this.getAccessTime())
			return 0;
		return 1;
	}

	@Override
	public String toString()
	{
		return memories +"\tAccess Time: " + accessTime
							+ "\t| Total size: " + totalSize
							+ "\t| Total cost: " + totalCost;
	}

}
