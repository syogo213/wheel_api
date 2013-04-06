package com.counters_spell.counter.api.titlelist;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.counters_spell.counter.HomeController;

@Controller
public class TitleListController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/getTitleList", method = RequestMethod.GET)
	@ResponseBody
	public TitleListResponse run(TitleListParameter params, Model model) {
		logger.info("Welcome home! The client locale is {}.", params.getPage_num());
		
		TitleListResponse response = new TitleListResponse();
		TitleListResponseList responseSet = new TitleListResponseList();
		responseSet.setHomeTitle("ホームページタイトル");
		responseSet.setPageTitle("ページタイトル");
		responseSet.setPageUrl("http://example.com");
		responseSet.setProcYmd("20130406031400");
		List<TitleListResponseList> resultSet = new ArrayList<TitleListResponseList>();
		resultSet.add(responseSet);
		resultSet.add(responseSet);
		response.setResultSet(resultSet);
		response.setCode("SA0000");
		
		return response;
	}

}
