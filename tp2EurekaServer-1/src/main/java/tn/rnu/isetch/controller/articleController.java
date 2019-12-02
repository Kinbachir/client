package tn.rnu.isetch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.rnu.isetch.entites.article;
import tn.rnu.isetch.interfaces.articleInterface;
@RestController
public class articleController {
	@Autowired
	articleInterface art;
	
	@GetMapping("/liste")
	public List<article> liste()
	{
		return art.listeArticle();
	}
	@GetMapping("/instance")
	public String instance()
	{
		return art.instance();
	}
}
