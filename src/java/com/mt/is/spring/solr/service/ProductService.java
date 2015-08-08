package com.mt.is.spring.solr.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;

import com.mt.is.spring.solr.model.Product;



public interface ProductService {

	int DEFAULT_PAGE_SIZE = 3;

	Page<Product> findByName(String searchTerm, Pageable pageable);

	Product findById(String id);

	FacetPage<Product> autocompleteNameFragment(String fragment, Pageable pageable);

}
