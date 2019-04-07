package com.example.resources;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userId}")
	@ResponseBody
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId) {
		
		return Collections.singletonList(
				new CatalogItem("Transformers", "Test", 4)
		);
	}
}
