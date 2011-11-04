package uk.ac.ebi.lipidhome.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import uk.ac.ebi.lipidhome.core.model.FAScanSpecie;

public class FAScanSpecieMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		FAScanSpecie fass = new FAScanSpecie();
		fass.setItemId(rs.getLong("FA_scan_species_id"));
		fass.setName(rs.getString("name"));
		fass.setModel(rs.getString("model"));
		fass.setFormula(rs.getString("formula"));
		fass.setMass(rs.getDouble("mass"));
		fass.setIdentified(rs.getBoolean("identified"));
		return fass;
	}

}
