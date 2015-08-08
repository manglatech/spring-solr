package com.mt.is

import org.springframework.data.domain.Page;

import com.mt.is.spring.solr.model.Product;
import com.mt.is.spring.solr.service.ProductService;

class SearchController {

	def productService
	
    def index() { 
		println "Search Form Called !! "
	}
	
	def search(){
		
		println "Search Called !!"
		def searchTerm = params.searchTerm
				
		Product product = productService.findById(searchTerm)
		
		println "Rending Search Result Page"
		[product:product]
		
	}
}
