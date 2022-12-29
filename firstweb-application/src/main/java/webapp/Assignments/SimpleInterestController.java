package webapp.Assignments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class SimpleInterestController {
	@RequestMapping(value="/si")
	public String simpleInterest() {
		return "simpleInterest";		
	}
	
	@RequestMapping(value = "/calculation" , method =RequestMethod.POST)
	public ModelAndView calculation (
			@RequestParam ("principalAmount") int principalAmount,
			@RequestParam ("year") int year,
			@RequestParam("Rate %") int rate
			) {
		ModelAndView mv = new ModelAndView();
		double msg = principalAmount*rate*year/100;
		mv.addObject("message", msg);
		mv.setViewName("simpleInterest");
		return mv;
	}
}
