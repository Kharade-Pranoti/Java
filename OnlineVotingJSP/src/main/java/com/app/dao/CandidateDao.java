package com.app.dao;

import java.util.List;
import com.app.core.Candidate;
import java.sql.*;
import java.util.Map;

public interface CandidateDao {
	
	// add a method to get all candidate list
	List<Candidate> displayCandidate() throws SQLException;
	
	// add a method to increment votes
	String incrementVotes(int candidateId) throws SQLException;
	
	// add a method to get top 2 candidates
	List<Candidate> topCandidates() throws SQLException;
	
	// add a method to get party wise votes
	Map<String, Candidate> partyWiseVotes() throws SQLException;
	
}
