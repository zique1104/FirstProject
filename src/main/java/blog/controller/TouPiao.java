package blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import blog.dto.output.TouPiaoDTO;
import blog.service.imp.TouPiaoService;


@Controller
@RequestMapping("toupiao")
public class TouPiao {
	
	@Autowired
	private TouPiaoService service;
	

	@RequestMapping(value="diaocha",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView TouPiaoController(TouPiaoDTO dto) {
		ModelAndView model = new ModelAndView();
		Integer addTouPiao = service.addTouPiao(dto);
		if(addTouPiao>0) {
			model.addObject("success", "成功");
		}else {
			model.addObject("success", "失败");
		}
		 model.setViewName("toupiao");
		 return model;
	}
}
