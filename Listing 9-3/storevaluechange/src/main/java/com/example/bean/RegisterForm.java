package com.example.bean;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named("form")
@SessionScoped
public class RegisterForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String streetAddress;

	private String state;
	private String country;

	private static Locale[] countries = { Locale.US, Locale.CANADA };

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Locale[] getCountries() {
		return countries;
	}

	public void setCountries(Locale[] locale) {
		countries = locale;
	}

	public void countryChanged(ValueChangeEvent event) {
		for (Locale loc : countries) {
			if (loc.getCountry().equals(event.getNewValue()))
				FacesContext.getCurrentInstance().getViewRoot().setLocale(loc);

		}
		FacesContext.getCurrentInstance().renderResponse();

	}
}
