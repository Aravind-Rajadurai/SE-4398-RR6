package controller;
import model.Model;
import view.View;

public interface Controller 
{
	void setModel(Model targetModel);
	Model getModel();
	void setView(View targetView);
	View getView();
}
