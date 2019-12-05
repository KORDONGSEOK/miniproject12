package kr.or.ksmart.ksmart_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.ksmart_mybatis.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired 
	private GoodsService goodsService;
	
	@GetMapping("/goodsList")
	public String GetgoodsList(Model model) {
		model.addAttribute("goodsList", goodsService.getGoodsList());
		return "/goods/goodsList";
		
	}
	
}
