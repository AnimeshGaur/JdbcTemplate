package vo;

public class AcademicCourse {
	
	private String courseId;
	private String ownCourseId;
	private String courseTitle;
	private String patyway;
	private String level;
	private String slcCourseCode;
	private String laraCode;
	private String departmentId;
	private String courseAimId;
	private String courseLocation;
	private String studyLocation;
	private String qualTypeId;
	private String subjectId;
	private String sbjpcnt;
	private String provisionTypeId;
	private String mandatoryUnits;
	private String optionalUnits;
	private String studySkillUnits;
	private String regBodyId;
	private String awardingBosyId;
	private String ttcId;
	private String minDuration;
	private String maxDuration;
	private String stuLoad;
	private String netFee;
	private String grossFee;
	private String selfFinance;
	private String isActive;
	private String createdDate;
	private String createdBy;
	private String status;
	
	
	public AcademicCourse(String courseId, String ownCourseId,
			String courseTitle, String patyway, String level,
			String slcCourseCode, String laraCode, String departmentId,
			String courseAimId, String courseLocation, String studyLocation,
			String qualTypeId, String subjectId, String sbjpcnt,
			String provisionTypeId, String mandatoryUnits,
			String optionalUnits, String studySkillUnits, String regBodyId,
			String awardingBosyId, String ttcId, String minDuration,
			String maxDuration, String stuLoad, String netFee, String grossFee,
			String selfFinance, String isActive, String createdDate,
			String createdBy, String status) {
		super();
		this.courseId = courseId;
		this.ownCourseId = ownCourseId;
		this.courseTitle = courseTitle;
		this.patyway = patyway;
		this.level = level;
		this.slcCourseCode = slcCourseCode;
		this.laraCode = laraCode;
		this.departmentId = departmentId;
		this.courseAimId = courseAimId;
		this.courseLocation = courseLocation;
		this.studyLocation = studyLocation;
		this.qualTypeId = qualTypeId;
		this.subjectId = subjectId;
		this.sbjpcnt = sbjpcnt;
		this.provisionTypeId = provisionTypeId;
		this.mandatoryUnits = mandatoryUnits;
		this.optionalUnits = optionalUnits;
		this.studySkillUnits = studySkillUnits;
		this.regBodyId = regBodyId;
		this.awardingBosyId = awardingBosyId;
		this.ttcId = ttcId;
		this.minDuration = minDuration;
		this.maxDuration = maxDuration;
		this.stuLoad = stuLoad;
		this.netFee = netFee;
		this.grossFee = grossFee;
		this.selfFinance = selfFinance;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.status = status;
	}
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the ownCourseId
	 */
	public String getOwnCourseId() {
		return ownCourseId;
	}
	/**
	 * @param ownCourseId the ownCourseId to set
	 */
	public void setOwnCourseId(String ownCourseId) {
		this.ownCourseId = ownCourseId;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	/**
	 * @return the patyway
	 */
	public String getPatyway() {
		return patyway;
	}
	/**
	 * @param patyway the patyway to set
	 */
	public void setPatyway(String patyway) {
		this.patyway = patyway;
	}
	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @return the slcCourseCode
	 */
	public String getSlcCourseCode() {
		return slcCourseCode;
	}
	/**
	 * @param slcCourseCode the slcCourseCode to set
	 */
	public void setSlcCourseCode(String slcCourseCode) {
		this.slcCourseCode = slcCourseCode;
	}
	/**
	 * @return the laraCode
	 */
	public String getLaraCode() {
		return laraCode;
	}
	/**
	 * @param laraCode the laraCode to set
	 */
	public void setLaraCode(String laraCode) {
		this.laraCode = laraCode;
	}
	/**
	 * @return the departmentId
	 */
	public String getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the courseAimId
	 */
	public String getCourseAimId() {
		return courseAimId;
	}
	/**
	 * @param courseAimId the courseAimId to set
	 */
	public void setCourseAimId(String courseAimId) {
		this.courseAimId = courseAimId;
	}
	/**
	 * @return the courseLocation
	 */
	public String getCourseLocation() {
		return courseLocation;
	}
	/**
	 * @param courseLocation the courseLocation to set
	 */
	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}
	/**
	 * @return the studyLocation
	 */
	public String getStudyLocation() {
		return studyLocation;
	}
	/**
	 * @param studyLocation the studyLocation to set
	 */
	public void setStudyLocation(String studyLocation) {
		this.studyLocation = studyLocation;
	}
	/**
	 * @return the qualTypeId
	 */
	public String getQualTypeId() {
		return qualTypeId;
	}
	/**
	 * @param qualTypeId the qualTypeId to set
	 */
	public void setQualTypeId(String qualTypeId) {
		this.qualTypeId = qualTypeId;
	}
	/**
	 * @return the subjectId
	 */
	public String getSubjectId() {
		return subjectId;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * @return the sbjpcnt
	 */
	public String getSbjpcnt() {
		return sbjpcnt;
	}
	/**
	 * @param sbjpcnt the sbjpcnt to set
	 */
	public void setSbjpcnt(String sbjpcnt) {
		this.sbjpcnt = sbjpcnt;
	}
	/**
	 * @return the provisionTypeId
	 */
	public String getProvisionTypeId() {
		return provisionTypeId;
	}
	/**
	 * @param provisionTypeId the provisionTypeId to set
	 */
	public void setProvisionTypeId(String provisionTypeId) {
		this.provisionTypeId = provisionTypeId;
	}
	/**
	 * @return the mandatoryUnits
	 */
	public String getMandatoryUnits() {
		return mandatoryUnits;
	}
	/**
	 * @param mandatoryUnits the mandatoryUnits to set
	 */
	public void setMandatoryUnits(String mandatoryUnits) {
		this.mandatoryUnits = mandatoryUnits;
	}
	/**
	 * @return the optionalUnits
	 */
	public String getOptionalUnits() {
		return optionalUnits;
	}
	/**
	 * @param optionalUnits the optionalUnits to set
	 */
	public void setOptionalUnits(String optionalUnits) {
		this.optionalUnits = optionalUnits;
	}
	/**
	 * @return the studySkillUnits
	 */
	public String getStudySkillUnits() {
		return studySkillUnits;
	}
	/**
	 * @param studySkillUnits the studySkillUnits to set
	 */
	public void setStudySkillUnits(String studySkillUnits) {
		this.studySkillUnits = studySkillUnits;
	}
	/**
	 * @return the regBodyId
	 */
	public String getRegBodyId() {
		return regBodyId;
	}
	/**
	 * @param regBodyId the regBodyId to set
	 */
	public void setRegBodyId(String regBodyId) {
		this.regBodyId = regBodyId;
	}
	/**
	 * @return the awardingBosyId
	 */
	public String getAwardingBosyId() {
		return awardingBosyId;
	}
	/**
	 * @param awardingBosyId the awardingBosyId to set
	 */
	public void setAwardingBosyId(String awardingBosyId) {
		this.awardingBosyId = awardingBosyId;
	}
	/**
	 * @return the ttcId
	 */
	public String getTtcId() {
		return ttcId;
	}
	/**
	 * @param ttcId the ttcId to set
	 */
	public void setTtcId(String ttcId) {
		this.ttcId = ttcId;
	}
	/**
	 * @return the minDuration
	 */
	public String getMinDuration() {
		return minDuration;
	}
	/**
	 * @param minDuration the minDuration to set
	 */
	public void setMinDuration(String minDuration) {
		this.minDuration = minDuration;
	}
	/**
	 * @return the maxDuration
	 */
	public String getMaxDuration() {
		return maxDuration;
	}
	/**
	 * @param maxDuration the maxDuration to set
	 */
	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
	/**
	 * @return the stuLoad
	 */
	public String getStuLoad() {
		return stuLoad;
	}
	/**
	 * @param stuLoad the stuLoad to set
	 */
	public void setStuLoad(String stuLoad) {
		this.stuLoad = stuLoad;
	}
	/**
	 * @return the netFee
	 */
	public String getNetFee() {
		return netFee;
	}
	/**
	 * @param netFee the netFee to set
	 */
	public void setNetFee(String netFee) {
		this.netFee = netFee;
	}
	/**
	 * @return the grossFee
	 */
	public String getGrossFee() {
		return grossFee;
	}
	/**
	 * @param grossFee the grossFee to set
	 */
	public void setGrossFee(String grossFee) {
		this.grossFee = grossFee;
	}
	/**
	 * @return the selfFinance
	 */
	public String getSelfFinance() {
		return selfFinance;
	}
	/**
	 * @param selfFinance the selfFinance to set
	 */
	public void setSelfFinance(String selfFinance) {
		this.selfFinance = selfFinance;
	}
	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
