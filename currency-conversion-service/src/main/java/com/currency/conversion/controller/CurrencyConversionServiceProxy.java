package com.currency.conversion.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currency.conversion.bean.ConversionFactorResponse;

//@FeignClient(name="currency-conversion-factor-service", url="localhost:8000")
//@FeignClient("currency-conversion-factor-service")
@FeignClient("zuul-gateway-server") 
@RibbonClient("currency-conversion-factor-service")
public interface CurrencyConversionServiceProxy {

	
	/* @GetMapping(path = "/conversionfactor/{fromCurrency}/{toCurrency}") public
	 ConversionFactorResponse getCurrencyConversionFactor(@PathVariable String fromCurrency,@PathVariable String toCurrency);
*/

	/**
	 * for zull
	 * @param fromCurrency
	 * @param toCurrency
	 * @return
	 */
	 @GetMapping(path = "/currency-conversion-factor-service/conversionfactor/{fromCurrency}/{toCurrency}")
	  public ConversionFactorResponse getCurrencyConversionFactor(@PathVariable	 String fromCurrency,@PathVariable String toCurrency);
	 

}
