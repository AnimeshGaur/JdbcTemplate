
	package dao;

	import javax.servlet.http.HttpServletRequest;
	import javax.sql.DataSource;

/*

	 */
	public interface ProductDaoInterface
	{
		
		/**
		 * Sets the data source.
		 *
		 * @param dataSource the new data source
		 */
		public void setDataSource(DataSource dataSource);

		/**
		 * Insert audit log.
		 *
		 * @param category the category
		 * @param request the request
		 * @param description the description
		 */
		public void insertAuditLog(String category, HttpServletRequest request, String description);

		/**
		 * Insert email.
		 *
		 * @param fromEmailAdd the from email add
		 * @param toEmailAdd the to email add
		 * @param subject the subject
		 * @param bodyText the body text
		 * @return true, if successful
		 */
		public boolean insertEmail(String fromEmailAdd, String[] toEmailAdd, String subject, String bodyText);
	}

	
	


