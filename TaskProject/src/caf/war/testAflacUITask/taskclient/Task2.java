package caf.war.testAflacUITask.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'Task 2' task.
 */ 
@ManagedBean(name = "Task2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class Task2 extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 6789302093673895936L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "CC0A08E6-1822-9E7E-3D1B-12CC30A1419F";

	/**
	 * Default constructor
	 */
	public Task2() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 2820308504127476736L;
		 
			
		public static final String[] INPUTS = new String[] { };
		public static final String[] OUTPUTS = new String[] {};
 
		public TaskData() {
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}