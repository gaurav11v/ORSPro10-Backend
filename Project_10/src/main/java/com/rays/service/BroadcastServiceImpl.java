package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BroadcastDAOInt;
import com.rays.dto.BroadcastDTO;

@Service
@Transactional
public class BroadcastServiceImpl extends BaseServiceImpl<BroadcastDTO, BroadcastDAOInt> implements BroadcastServiceInt{

}
