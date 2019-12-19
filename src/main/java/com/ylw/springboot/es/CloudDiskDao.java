package com.ylw.springboot.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CloudDiskDao extends ElasticsearchRepository<CloudDiskEntity, String> {

}