package model;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractModel implements Model 
{
	private List<ModelListener> listeners = new ArrayList<ModelListener>(5);
	
	public void notifyChanged(ModelEvent event)
	{
		for(ModelListener ml : listeners) 
		{
			ml.modelChanged(event);
		}
		
	}
	public void addModelListener(ModelListener listenerToAdd)
	{
		listeners.add(listenerToAdd);
	}
	public void removeModelListener(ModelListener listenerToRemove)
	{
		listeners.remove(listenerToRemove);
	}
}
