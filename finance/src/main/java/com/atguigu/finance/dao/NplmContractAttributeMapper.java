package com.atguigu.finance.dao;

import com.atguigu.finance.bean.ContractList;
import com.atguigu.finance.bean.NplmContractAttribute;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Controller
public interface NplmContractAttributeMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(NplmContractAttribute record);


    int insertSelective(NplmContractAttribute record);

    NplmContractAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NplmContractAttribute record);


    int updateByPrimaryKey(NplmContractAttribute record);

    ArrayList<ContractList> ContractList(ContractList contractList);
}