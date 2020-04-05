package salon.backend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import salon.backend.service.SalonMgmtService;
import salon.backend.dto.SalonCustDto;


@Controller
@SpringBootApplication(scanBasePackages={"salon.backend.service"})
public class SalonMgmtController {
	private SalonMgmtService salonMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(SalonMgmtController.class, args);
	}
	
	@RequestMapping(value={"/salon/backend/salonMgmtMain"})
	public String salonMgmtMain(HttpServletRequest request, ModelMap model) throws Exception {
		SalonCustDto salonCustDto = new SalonCustDto();
		
		salonCustDto.setCustNm("202003000002");
		
		salonCustDto = salonMgmtService.selectCustBasicInfo(salonCustDto);
		
		System.out.println("#####salonCustDto: " + salonCustDto);
		
		return "index";
	}
}