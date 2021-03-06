package com.cg.healthcare.dao.copy;

import com.cg.healthcare.entities.DiagnosticCenter;

public interface DiagnosticCenterRepository{
	public DiagnosticCenter getDiagnosticCenterByUsername(String diagnosticCenterUsername);
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter center);
	public DiagnosticCenter removeDiagnosticCenter(int centerid);
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter center);
}
