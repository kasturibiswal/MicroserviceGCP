package com.currency.conversionfactor.bean;

public class ConversionFactorResponse {

	Double conversionFactor;
	String errorMessage;
	
	
	
	public ConversionFactorResponse(Double conversionFactor, String errorMessage) {
		super();
		this.conversionFactor = conversionFactor;
		this.errorMessage = errorMessage;
	}
	public Double getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "ConversionFactorResponse [conversionfactor=" + conversionFactor + ", errorMessage=" + errorMessage
				+ "]";
	}
	
	
	

}
