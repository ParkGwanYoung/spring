
@Controller
public class MemberDaoController {

    @Autowired
    private MemberService service;

    @RequestMapping(value = "/dao/{action}")
    public ModelAndView List(@RequestParam Map<String, Object> paramMap,@PathVariable String action, ModelAndView modelandView){
        
        java.util.List<Object> resultList = new ArrayList<Object>();
        String viewName = "/dao/";
        
       
        if("read".equals(action)){
            viewName = viewName + action;
            resultList = (List<Object>) service.getObject(paramMap);
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;

    }
}