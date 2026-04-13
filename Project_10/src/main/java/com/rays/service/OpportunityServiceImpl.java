package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OpportunityDAOInt;
import com.rays.dto.OpportunityDTO;

@Service
@Transactional
public class OpportunityServiceImpl extends BaseServiceImpl<OpportunityDTO, OpportunityDAOInt> implements OpportunityServiceInt{

}
