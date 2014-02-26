// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.akaza.openclinica.domain.AbstractMutableDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * MeasurementUnit generated by hbm2java
 */
@Entity
@Table(name = "measurement_unit",uniqueConstraints = {
		@UniqueConstraint(columnNames = "oc_oid"),
		@UniqueConstraint(columnNames = "name") })
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class MeasurementUnit  extends AbstractMutableDomainObject {

	private int id;
	private Integer version;
	private String ocOid;
	private String name;
	private String description;

	public MeasurementUnit() {
	}

	public MeasurementUnit(int id, String ocOid, String name) {
		this.id = id;
		this.ocOid = ocOid;
		this.name = name;
	}

	public MeasurementUnit(int id, String ocOid, String name, String description) {
		this.id = id;
		this.ocOid = ocOid;
		this.name = name;
		this.description = description;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "oc_oid", unique = true, nullable = false, length = 40)
	public String getOcOid() {
		return this.ocOid;
	}

	public void setOcOid(String ocOid) {
		this.ocOid = ocOid;
	}

	@Column(name = "name", unique = true, nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
