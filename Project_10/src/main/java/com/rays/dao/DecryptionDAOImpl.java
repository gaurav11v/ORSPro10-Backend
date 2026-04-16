package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DecryptionDTO;

@Repository
public class DecryptionDAOImpl extends BaseDAOImpl<DecryptionDTO> implements DecryptionDAOInt{

	@Override
	protected List<Predicate> getWhereClause(DecryptionDTO dto, CriteriaBuilder builder, Root<DecryptionDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDecryptionCode())) {

			whereCondition.add(builder.like(qRoot.get("decryptionCode"), dto.getDecryptionCode() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<DecryptionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return DecryptionDTO.class;
	}

}
