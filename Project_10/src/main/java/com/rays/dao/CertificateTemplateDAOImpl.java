package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CertificateTemplateDTO;

@Repository
public class CertificateTemplateDAOImpl extends BaseDAOImpl<CertificateTemplateDTO> implements CertificateTemplateDAOInt{

	@Override
	protected List<Predicate> getWhereClause(CertificateTemplateDTO dto, CriteriaBuilder builder,
			Root<CertificateTemplateDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTemplateName())) {

			whereCondition.add(builder.like(qRoot.get("templateName"), dto.getTemplateName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<CertificateTemplateDTO> getDTOClass() {
		return CertificateTemplateDTO.class;
	}

}
