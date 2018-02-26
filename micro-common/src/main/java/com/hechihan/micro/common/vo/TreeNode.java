/**
 * @author: cloudy  Date: 2018/1/28 Time: 14:05
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.vo;

import lombok.Data;

import java.util.List;
import java.util.ArrayList;

@Data
public class TreeNode {
    protected int id;
    protected int parentId;
    List<TreeNode> children = new ArrayList<TreeNode>();

    public void add(TreeNode node){
        children.add(node);
    }
}
