package com.hp.school.management.indexing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.hp.school.management.model.School;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.GetterUtil;

@Component(immediate = true, service = Indexer.class)
public class SchoolIndexer  extends BaseIndexer<School> {
	
	public static final String CLASS_NAME = SchoolIndexer.class.getName();
	
	public SchoolIndexer() {
		setDefaultSelectedFieldNames(
			Field.COMPANY_ID, Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
			Field.GROUP_ID, Field.MODIFIED_DATE);
		setPermissionAware(true);
		setFilterSearch(true);
	}
	
	@Override
	public boolean hasPermission(
	        PermissionChecker permissionChecker, String entryClassName, 
	        long entryClassPK, String actionId) 
	    throws Exception {

	return  super.hasPermission(permissionChecker, entryClassName, entryClassPK, actionId);
	}
	
	
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return	School.class.getName();
	}

	@Override
	protected void doDelete(School object) throws Exception {
		// TODO Auto-generated method stub
		deleteDocument(object.getCompanyId(), object.getSchoolId() );

	}

	@Override
	protected Document doGetDocument(School school) throws Exception {
		
		Document document = getBaseModelDocument(School.class.getName(), school);
		
		// Add column to be indexed
		document.addNumber("schoolId", school.getSchoolId());
		document.addNumber("name", school.getName());
		document.addNumber("city", school.getCity());
		document.addNumber("noOfstudent", school.getNoOfstudent());
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) throws Exception {
		// TODO Auto-generated method stub
		 Summary summary = createSummary(document);
		    summary.setMaxContentLength(200);
		    return summary;
	}

	@Override
	protected void doReindex(School school) throws Exception {
		Document document = getDocument(school);
		indexWriterHelper.updateDocument(
				getSearchEngineId(),1 , document,
				isCommitImmediately());
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		School school= SchoolLocalServiceUtil.getSchool(classPK);
		doReindex(school);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		// here I’ve just reindex single companyIds documents
		long companyId = GetterUtil.getLong(ids[0]);
		reindexEntries(companyId);
	}
	
	
 protected void reindexEntries(long companyId) throws PortalException,
			    SystemException {
			
			final Collection<Document> documents = new ArrayList<Document>();
			
			ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery() {
			
			    @Override
			    protected void addCriteria(DynamicQuery dynamicQuery) {
			    }
			
			    @Override
			    protected void performAction(Object object) throws PortalException {
			            School entry = (School) object;
			            Document document = getDocument(entry);
			
			            documents.add(document);
			    }
			
			};
			
			actionableDynamicQuery.setCompanyId(companyId);
			
			actionableDynamicQuery.performActions();
			
			SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
			            documents);
			}
	
	
	@Reference
	IndexWriterHelper indexWriterHelper;

}
