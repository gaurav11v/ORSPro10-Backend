package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CertificateTemplateDAOInt;
import com.rays.dto.CertificateTemplateDTO;

@Service
@Transactional
public class CertificateTemplateServiceImpl extends BaseServiceImpl<CertificateTemplateDTO, CertificateTemplateDAOInt> implements CertificateTemplateServiceInt  {

}
