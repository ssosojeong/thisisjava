package sec04.exam01_nestedinterface;

public class Button {
	OnClickListner listener; 
	
	void setOnClickListner(OnClickListner listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListner{
		void onClick();
	}

}
