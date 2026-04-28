package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AgreementDTO;

@Repository
public class AgreementDAOImpl extends BaseDAOImpl<AgreementDTO> implements AgreementDAOInt {

	@Override
	protected List<Predicate> getWhereClause(AgreementDTO dto, CriteriaBuilder builder, Root<AgreementDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPartyName())) {

			whereCondition.add(builder.like(qRoot.get("partyName"), dto.getPartyName() + "%"));
		}
		
		if (isNotNull(dto.getSignedDate())) {

			whereCondition.add(builder.equal(qRoot.get("signedDate"), dto.getSignedDate()));
		}
		
		if (!isEmptyString(dto.getTerms())) {

			whereCondition.add(builder.like(qRoot.get("terms"), dto.getTerms() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<AgreementDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return AgreementDTO.class;
	}

}
