package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DecryptionDAOInt;
import com.rays.dto.DecryptionDTO;

@Service
@Transactional
public class DecryptionServiceImpl extends BaseServiceImpl<DecryptionDTO, DecryptionDAOInt> implements DecryptionServiceInt{

}
