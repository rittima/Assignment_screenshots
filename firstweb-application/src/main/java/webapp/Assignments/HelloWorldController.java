package webapp.Assignments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloWorldController {
    @RequestMapping(value="/helloWorld",method=RequestMethod.GET)
    public String callHelloWorld()
    {
        return "helloWorld";
    }
	
	  @RequestMapping(value="/index",method=RequestMethod.GET) public String
	  sayHello() { return "index"; }
	  
	  @RequestMapping(value="/index",method=RequestMethod.POST) public String
	  hello() { return "helloWorld"; }
	 
}

