package com.rays.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CertificateDAOInt;
import com.rays.dto.CertificateDTO;

@Service
@Transactional
public class CertificateServiceImpl extends BaseServiceImpl<CertificateDTO, CertificateDAOInt> implements CertificateServiceInt {

}
