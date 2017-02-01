package com.example.beans;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Named;
import javax.validation.ValidationException;

import org.glassfish.jersey.server.validation.ValidationError;

@Named("animal")
@SessionScoped
public class AnimalBean implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String type;
		private int totalNo;
		private boolean checked;
		
		private Date date;
		
		private double weight;
		
		
		
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getTotalNo() {
			return totalNo;
		}
		public void setTotalNo(int totalNo) {
			this.totalNo = totalNo;
		}
		public boolean isChecked() {
			return checked;
		}
		public void setChecked(boolean checked) {
			this.checked = checked;
		}
		
		/*public void validateAge(FaceletContext context,UIComponent component,Object value) throws Exception{
			
			int enterednumber=(Integer)value;
			
			if(enterednumber<0|| enterednumber>100){
				FacesMessage message=new  FacesMessage("Enter nuber must be 0 and 100");
				throw new ValidationException(message);
			}
		}*/
		
		
		
}
