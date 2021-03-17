@Controller
public class UserController {
	// 로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
	  logger.info("경로:login")
	 return "user/login";
	}

	@RequestMapping("/user/insert.do")
	public String insert() {
	  logger.info("경로: insert")
	 return "user/insert";
	}

	@RequestMapping("/user/updata.do")
	public String updata() {
	  logger.info("경로:updata")
	 return "user/updata";
	}
	
	// 회원 수정 페이지로 이동
	@RequestMapping("/user/modify.do")
	public String modify() {
	  logger.info("경로: modify")
	 return "user/ modifys";
	}
	
	// 회원 삭제 페이지로 이동
	@RequestMapping("/user/delete.do")
	public String modify() {
	  logger.info("경로: delete")
	 return "user/ delete";
	}

	// 브란치 회사는 무엇을 하는가>
	아르마 딜로

	
}