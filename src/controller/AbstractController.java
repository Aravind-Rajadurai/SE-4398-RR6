package controller;
import model.Model;
import view.View;

public abstract class AbstractController implements Controller
{
	private View view;
	private Model model;
	
	public void setModel(Model targetModel)
	{
		this.model = targetModel;
	}
	
	public Model getModel()
	{
		return model;
	}
	
	public View getView()
	{
		return view;
	}
	
	public void setView(View targetView)
	{
		this.view = targetView;
	}
}
