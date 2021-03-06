package com.cg.healthcare.service;

import java.util.Set;

import com.cg.healthcare.entities.DiagnosticCenter;
import com.cg.healthcare.entities.DiagnosticTest;

public interface ITestService {

	public DiagnosticTest addTest(DiagnosticTest test);
	public DiagnosticTest updateTest(DiagnosticTest test);
	public DiagnosticTest removeTest(DiagnosticTest test);
	public Set<DiagnosticTest> viewAllTest(DiagnosticTest test);
	public DiagnosticTest addTestInCenter(DiagnosticCenter center);
	
}
