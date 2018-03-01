/**
 * @author: cloudy  Date: 2018/1/28 Time: 13:23
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.rest;

import com.hechihan.micro.common.biz.BaseBiz;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

import com.hechihan.micro.common.vo.ObjectRestResponse;
import com.hechihan.micro.common.vo.TableResultResponse;
import com.hechihan.micro.common.util.Query;

@RestController
@Slf4j
public class BaseController<Biz extends BaseBiz,Entity> {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;

    @PostMapping(value = "")
    @ResponseBody
    @ApiOperation(value="创建")
    public ObjectRestResponse<Entity> add( @RequestBody Entity entity){
        baseBiz.insertSelective(entity);
        return new ObjectRestResponse<Entity>().rel(true).data(entity);
    }

    @GetMapping(value = "{id}")
    @ResponseBody
    @ApiOperation(value="获取详情")
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        return new ObjectRestResponse<Entity>().rel(true).data(baseBiz.selectById(id));
    }

    @PutMapping(value = "/{id}")
    @ResponseBody
    @ApiOperation(value="修改")
    public ObjectRestResponse<Entity> update(@RequestBody Entity entity){
        baseBiz.updateSelectiveById(entity);
        return new ObjectRestResponse<Entity>().rel(true).data(entity);
    }
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    @ApiOperation(value="删除")
    public ObjectRestResponse<Entity> remove(@PathVariable int id){
        baseBiz.deleteById(id);
        return new ObjectRestResponse<Entity>();
    }

    @GetMapping(value = "/all")
    @ResponseBody
    @ApiOperation(value="获取所有记录")
    public List<Entity> all(){
        return baseBiz.selectListAll();
    }
    @GetMapping(value = "/page")
    @ResponseBody
    @ApiOperation(value="分页", notes="分页参数:页码(page),每页数量(limit)")
    public TableResultResponse<Entity> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }

}
