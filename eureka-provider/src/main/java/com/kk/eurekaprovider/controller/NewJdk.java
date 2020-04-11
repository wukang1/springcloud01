package com.kk.eurekaprovider.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kk.eurekaprovider.model.StoreCategoryBrandRela;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/4/11
 * Time: 13:46
 * jdk 1.8特性
 */
public class NewJdk {

    public static void main(String[] args) {
        JSONObject jsonObject = JSONObject.parseObject("{\"name\":\"42313123\",\"list\":[{\"brandId\":\"13112\",\"categoryId\":\"13132\"},{\"brandId\":\"13112\",\"categoryId\":\"13132\"}]}");
        List<StoreCategoryBrandRela> storeCategoryBrandRelas =
                JSONArray.parseArray(jsonObject.getString("list"),StoreCategoryBrandRela.class);
        List<StoreCategoryBrandRela> storeCategoryBrandRelas1= storeCategoryBrandRelas.stream().collect(
                collectingAndThen(
                        toCollection(() -> new TreeSet<>(Comparator.comparing(o->o.getCategoryId()+ "," + o.getBrandId()))), ArrayList::new
                )
        );
        for (StoreCategoryBrandRela storeCategoryBrandRela : storeCategoryBrandRelas1) {
            System.out.println(storeCategoryBrandRela);
        }
    }
}
