package tn.rnu.isetch.interfaces;
import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tn.rnu.isetch.entites.*;
@FeignClient(name="spring-cloud-eureka-client")
@RibbonClient(name="spring-cloud-eureka-client")
public interface articleInterface {
	@GetMapping("/articles")
	public List<article> listeArticle();
	@GetMapping("/instance")
	public String instance();
	/*
	public article getById(Integer id);
	public void delete(Integer id);
	public void update (article a,Integer id);*/
}
