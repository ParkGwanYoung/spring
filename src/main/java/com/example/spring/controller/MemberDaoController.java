
import java.util.HashMap;
import java.util.Map;


@Controller
public class MemberDaoController {

    @Autowired
    private MemberService service;

    @RequestMapping(value = "/dao/{action}")
    public ModelAndView Map(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){
        
        Map<String,Object> resultMap = new HashMap<String,Object>();
        String viewName = "/dao/";
        
       
        if("read".equals(action)){
            viewName = viewName + action;
            resultMap = (Map<String, Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;

    }
}