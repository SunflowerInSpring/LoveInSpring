package com.atguigu.finance.controller;



import com.atguigu.finance.bean.*;
import com.atguigu.finance.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FinanceController {


@Autowired
NplmContractAttributeMapper nplmContractAttributeMapper;
@Autowired
NplmRepaymentPlanMapper nplmRepaymentPlanMapper;
@Autowired
NplmRepaymentRecordMapper nplmRepaymentRecordMapper;
@Autowired
NplmRepaymentDetailMapper nplmRepaymentDetailMapper;

@Autowired
NplmBorrowerInfoMapper nplmBorrowerInfoMapper;
    @RequestMapping("ContractList")
    @ResponseBody
    public  ArrayList<ContractList> ContractList(ContractList contractList){

        ArrayList<ContractList> contractLists = nplmContractAttributeMapper.ContractList(contractList);


        return  contractLists;
    }

    @RequestMapping("RepaymentSituation")
    @ResponseBody
    public  ContractList RepaymentSituation(ContractList contractList){
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList<ContractList> contractLists = nplmContractAttributeMapper.ContractList(contractList);

        contractList = contractLists.get(0);
        List<NplmRepaymentPlan> nplmRepaymentPlanList= nplmRepaymentPlanMapper.getByContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentPlanList(nplmRepaymentPlanList);

        //还款记录表
        List<NplmRepaymentRecord> nplmRepaymentRecord= nplmRepaymentRecordMapper.getByRecordContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentRecordList(nplmRepaymentRecord);
        //分配明细
        List<NplmRepaymentDetail> nplmRepaymentDetailList = nplmRepaymentDetailMapper.getDetailByContractNum(contractList.getLoanContractNum());
        contractList.setNplmRepaymentDetailList(nplmRepaymentDetailList);
        NplmBorrowerInfo nplmBorrowerInfo = nplmBorrowerInfoMapper.selectByPrimaryKey(contractList.getId());
        contractList.setNplmBorrowerInfo(nplmBorrowerInfo);
        return  contractList;
    }



}
