package com.cg.healthcare.dao.copy;

import com.cg.healthcare.entities.DiagnosticCenter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DiagnosticCenterRepositoryImpl implements DiagnosticCenterRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public DiagnosticCenterRepositoryImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterByUsername(String diagnosticCenterUsername) {
		DiagnosticCenter center = new DiagnosticCenter();
		entityManager.find(DiagnosticCenter.class, diagnosticCenterUsername);
		center.setId(center.getId());
		center.setName(center.getName());
		center.setAddress(center.getAddress());
		center.setName(center.getName());
		center.setName(center.getName());
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter removeDiagnosticCenter(int centerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return null;
	}

}
