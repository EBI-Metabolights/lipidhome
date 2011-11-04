package uk.ac.ebi.lipidhome.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import uk.ac.ebi.lipidhome.core.model.CrossReference;

public class CrossReferenceMapper implements RowMapper {
	
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		CrossReference xRef = new CrossReference();
		xRef.setResource(rs.getString("name"));
		xRef.setUrl(rs.getString("url"));
		return xRef;
	}

}
