package caf.war.testAflacUITask.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Task2RuleContext")
@SessionScoped
@DTManagedBean(displayName = "Task 2 Rule Context", beanType = BeanType.DEFAULT)
public class Task2RuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}