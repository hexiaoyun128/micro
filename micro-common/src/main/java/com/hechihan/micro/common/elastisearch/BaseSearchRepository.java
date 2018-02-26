/**
 * @author: cloudy  Date: 2018/2/8 Time: 16:51
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */
package com.hechihan.micro.common.elastisearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;
import java.util.List;

public interface BaseSearchRepository<E, ID extends Serializable>
        extends ElasticsearchRepository<E, ID>, PagingAndSortingRepository<E, ID> {


}