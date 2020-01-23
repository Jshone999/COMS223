package edu.sussex.coms223.lab1;

import java.util.Arrays;

public class ArrayList<E> implements List<E> 
{
	
	private Object[] data = new Object[0];

	public boolean add(E e) 
	{
		if(e == null)
		{
			throw new IllegalArgumentException(" Null Values Not Allowed. ");
		}
		
		data = Arrays.copyOf(data, data.length+1);
		
		data[data.length-1] = e;
		
		return false;
	}

	public boolean remove(E e) 
	{
		int removed = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			if(data[i].equals(e));
			{
				removed++;
			}
		}
		
		if(removed > 0)
		{
			Object[] newData = new Object[data.length-removed];
			
			for(int i = 0, j = 0; i < data.length; i++)
			{
				if(!data[i].equals(e))
				{
					newData [j++] = data[i];
				}
				
				data = newData;
			}
		}
	
		return false;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) 
	{
		{
			return (E) data[index];
		}
	}

	public int size() 
	{
		int size = data.length;
		return size;
	}
	
	public void clear() 
	{
		data = new Object[0];
	}
	
}
