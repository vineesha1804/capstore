package com.cg.capstore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore.beans.FeedbackProductBean;


@Controller
public class JSPController {
	
	
	
	@RequestMapping(value = "/generatecoupons")
	public String generateCoupons() {
		return "generatecoupons";
	}
	
	
	
	
	
	
	

    //returns only that particular feedback which is added
	@RequestMapping(value = "/addanfeedback")
	public String addAnFeedback() {
		return "addanfeedback";
	}
	
	
	
	@RequestMapping(value = "/uploadimage")
	public String uploadImage() {
		return "uploadimage";
	}
	
	
	
	@RequestMapping(value="/addtocart")
	public String addToCart() {
		
		return "addtocart";
	}

	
	@RequestMapping(value="/removeFromCartPage")
	public String removeFromCart() {
		
		return "removefromcart";
	}
	
	
	@RequestMapping(value="/displayCart")
	public String displayCartPage() {
		
		return "displaycart";
	}
	
	
	@RequestMapping(value="/zoomandslideimages")
	public String zoomAndSlideImagesPage() {
		
		return "zoomandslideimages";
	}
	
	
}
