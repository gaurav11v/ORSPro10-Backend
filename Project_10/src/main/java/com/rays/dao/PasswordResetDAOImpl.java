package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PasswordResetDTO;

@Repository
public class PasswordResetDAOImpl extends BaseDAOImpl<PasswordResetDTO> implements PasswordResetDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PasswordResetDTO dto, CriteriaBuilder builder,Root<PasswordResetDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUserName())) {

			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<PasswordResetDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PasswordResetDTO.class;
	}

}
