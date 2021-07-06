package sec05.exam3_button_event;

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
