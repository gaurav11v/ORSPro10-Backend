package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CertificateDTO;

@Repository
public class CertificateDAOImpl extends BaseDAOImpl<CertificateDTO> implements CertificateDAOInt {

	@Override
	protected List<Predicate> getWhereClause(CertificateDTO dto, CriteriaBuilder builder, Root<CertificateDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCertificateNumber())) {

			whereCondition.add(builder.like(qRoot.get("certificateNumber"), dto.getCertificateNumber() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<CertificateDTO> getDTOClass() {

		return CertificateDTO.class;
	}

}
