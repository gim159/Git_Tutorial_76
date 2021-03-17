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


`	==== ㅇㅁㄴㅇㄹㄴㄻㄻㅇㄴㄴㅇㅇㄴㄹ
	// 회원 삭제 페이지로 이동 -[마스터 브런치 추가]
	@RequestMapping("/user/delete.do")
	public String modify() {
	  logger.info("경로: delete")
	 return "user/ delete";
	}
	
}