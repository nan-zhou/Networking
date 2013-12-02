/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.util.*;
import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class Job as well as methods comparable to the invokeMethods
 * defined for this class. This Class implements the JobBean Interface. The CIM class Job is described as follows:
 * 
 * A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that a
 * Job can be scheduled or queued, and its execution is not limited to a single system.
 */
public class Job extends LogicalElement implements Serializable {

	/**
	 * This constructor creates a JobBeanImpl Class which implements the JobBean Interface, and encapsulates the CIM class Job in a Java Bean. The CIM
	 * class Job is described as follows:
	 * 
	 * A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that
	 * a Job can be scheduled or queued, and its execution is not limited to a single system.
	 */
	protected Job() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property jobStatus.
	 */
	private String	jobStatus;

	/**
	 * This method returns the Job.jobStatus property value. This property is described as follows:
	 * 
	 * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property.
	 * JobStatus provides additional, implementation-specific details.
	 * 
	 * @return String current jobStatus property value
	 * @exception Exception
	 */
	public String getJobStatus() {

		return this.jobStatus;
	} // getJobStatus

	/**
	 * This method sets the Job.jobStatus property value. This property is described as follows:
	 * 
	 * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property.
	 * JobStatus provides additional, implementation-specific details.
	 * 
	 * @param String
	 *            new jobStatus property value
	 * @exception Exception
	 */
	public void setJobStatus(String jobStatus) {

		this.jobStatus = jobStatus;
	} // setJobStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property timeSubmitted.
	 */
	private Date	timeSubmitted;

	/**
	 * This method returns the Job.timeSubmitted property value. This property is described as follows:
	 * 
	 * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and
	 * time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
	 * 
	 * @return Date current timeSubmitted property value
	 * @exception Exception
	 */
	public Date getTimeSubmitted() {

		return this.timeSubmitted;
	} // getTimeSubmitted

	/**
	 * This method sets the Job.timeSubmitted property value. This property is described as follows:
	 * 
	 * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and
	 * time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
	 * 
	 * @param Date
	 *            new timeSubmitted property value
	 * @exception Exception
	 */
	public void setTimeSubmitted(Date timeSubmitted) {

		this.timeSubmitted = timeSubmitted;
	} // setTimeSubmitted

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property scheduledStartTime.
	 */
	@Deprecated
	private Date	scheduledStartTime;

	/**
	 * This method returns the Job.scheduledStartTime property value. This property is described as follows:
	 * 
	 * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the
	 * time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of
	 * the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
	 * 
	 * @return Date current scheduledStartTime property value
	 * @exception Exception
	 */
	@Deprecated
	public Date getScheduledStartTime() {

		return this.scheduledStartTime;
	} // getScheduledStartTime

	/**
	 * This method sets the Job.scheduledStartTime property value. This property is described as follows:
	 * 
	 * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the
	 * time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of
	 * the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
	 * 
	 * @param Date
	 *            new scheduledStartTime property value
	 * @exception Exception
	 */
	@Deprecated
	public void setScheduledStartTime(Date scheduledStartTime) {

		this.scheduledStartTime = scheduledStartTime;
	} // setScheduledStartTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property startTime.
	 */
	private Date	startTime;

	/**
	 * This method returns the Job.startTime property value. This property is described as follows:
	 * 
	 * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time
	 * that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to
	 * capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
	 * 
	 * @return Date current startTime property value
	 * @exception Exception
	 */
	public Date getStartTime() {

		return this.startTime;
	} // getStartTime

	/**
	 * This method sets the Job.startTime property value. This property is described as follows:
	 * 
	 * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time
	 * that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to
	 * capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
	 * 
	 * @param Date
	 *            new startTime property value
	 * @exception Exception
	 */
	public void setStartTime(Date startTime) {

		this.startTime = startTime;
	} // setStartTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property elapsedTime.
	 */
	private Date	elapsedTime;

	/**
	 * This method returns the Job.elapsedTime property value. This property is described as follows:
	 * 
	 * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present
	 * in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last'
	 * run time can be stored in this single-valued property.
	 * 
	 * @return Date current elapsedTime property value
	 * @exception Exception
	 */
	public Date getElapsedTime() {

		return this.elapsedTime;
	} // getElapsedTime

	/**
	 * This method sets the Job.elapsedTime property value. This property is described as follows:
	 * 
	 * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present
	 * in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last'
	 * run time can be stored in this single-valued property.
	 * 
	 * @param Date
	 *            new elapsedTime property value
	 * @exception Exception
	 */
	public void setElapsedTime(Date elapsedTime) {

		this.elapsedTime = elapsedTime;
	} // setElapsedTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property jobRunTimes.
	 */
	private long	jobRunTimes;

	/**
	 * This method returns the Job.jobRunTimes property value. This property is described as follows:
	 * 
	 * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a
	 * limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be
	 * processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
	 * 
	 * @return long current jobRunTimes property value
	 * @exception Exception
	 */
	public long getJobRunTimes() {

		return this.jobRunTimes;
	} // getJobRunTimes

	/**
	 * This method sets the Job.jobRunTimes property value. This property is described as follows:
	 * 
	 * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a
	 * limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be
	 * processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
	 * 
	 * @param long new jobRunTimes property value
	 * @exception Exception
	 */
	public void setJobRunTimes(long jobRunTimes) {

		this.jobRunTimes = jobRunTimes;
	} // setJobRunTimes

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property RunMonth.
	 */

	public enum RunMonth {
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER
	}

	private RunMonth	runMonth;

	/**
	 * This method returns the Job.runMonth property value. This property is described as follows:
	 * 
	 * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
	 * 
	 * @return short current runMonth property value
	 * @exception Exception
	 */
	public RunMonth getRunMonth() {

		return this.runMonth;
	} // getRunMonth

	/**
	 * This method sets the Job.runMonth property value. This property is described as follows:
	 * 
	 * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
	 * 
	 * @param short new runMonth property value
	 * @exception Exception
	 */
	public void setRunMonth(RunMonth runMonth) {

		this.runMonth = runMonth;
	} // setRunMonth

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property runDay.
	 */
	private Byte	runDay;

	/**
	 * This method returns the Job.runDay property value. This property is described as follows:
	 * 
	 * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of
	 * DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A
	 * positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates
	 * the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. When RunDayOfWeek is not 0, RunDay is the day-in-month on which
	 * the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is
	 * processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and
	 * RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek
	 * is -Sunday, then this indicates the last Sunday in the RunMonth.
	 * 
	 * @return Byte current runDay property value
	 * @exception Exception
	 */
	public Byte getRunDay() {

		return this.runDay;
	} // getRunDay

	/**
	 * This method sets the Job.runDay property value. This property is described as follows:
	 * 
	 * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of
	 * DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A
	 * positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates
	 * the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. When RunDayOfWeek is not 0, RunDay is the day-in-month on which
	 * the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is
	 * processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and
	 * RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek
	 * is -Sunday, then this indicates the last Sunday in the RunMonth.
	 * 
	 * @param Byte
	 *            new runDay property value
	 * @exception Exception
	 */
	public void setRunDay(Byte runDay) {

		this.runDay = runDay;
	} // setRunDay

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property RunDayOfWeek.
	 */

	public enum RunDayOfWeek {
		SATURDAY,
		FRIDAY,
		THURSDAY,
		WEDNESDAY,
		TUESDAY,
		MONDAY,
		SUNDAY,
		EXACTDAYOFMONTH,
		SUNDAY1,
		MONDAY1,
		TUESDAY1,
		WEDNESDAY1,
		THURSDAY1,
		FRIDAY1,
		SATURDAY1
	}

	private RunDayOfWeek	runDayOfWeek;

	/**
	 * This method returns the Job.runDayOfWeek property value. This property is described as follows:
	 * 
	 * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is
	 * set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the
	 * day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of
	 * week is found on or BEFORE the RunDay.
	 * 
	 * @return Byte current runDayOfWeek property value
	 * @exception Exception
	 */
	public RunDayOfWeek getRunDayOfWeek() {

		return this.runDayOfWeek;
	} // getRunDayOfWeek

	/**
	 * This method sets the Job.runDayOfWeek property value. This property is described as follows:
	 * 
	 * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is
	 * set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the
	 * day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of
	 * week is found on or BEFORE the RunDay.
	 * 
	 * @param Byte
	 *            new runDayOfWeek property value
	 * @exception Exception
	 */
	public void setRunDayOfWeek(RunDayOfWeek runDayOfWeek) {

		this.runDayOfWeek = runDayOfWeek;
	} // setRunDayOfWeek

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property runStartInterval.
	 */
	private Date	runStartInterval;

	/**
	 * This method returns the Job.runStartInterval property value. This property is described as follows:
	 * 
	 * The time interval after midnight when the Job should be processed. For example, 00000000020000.000000:000 indicates that the Job should be run
	 * on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
	 * 
	 * @return Date current runStartInterval property value
	 * @exception Exception
	 */
	public Date getRunStartInterval() {

		return this.runStartInterval;
	} // getRunStartInterval

	/**
	 * This method sets the Job.runStartInterval property value. This property is described as follows:
	 * 
	 * The time interval after midnight when the Job should be processed. For example, 00000000020000.000000:000 indicates that the Job should be run
	 * on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
	 * 
	 * @param Date
	 *            new runStartInterval property value
	 * @exception Exception
	 */
	public void setRunStartInterval(Date runStartInterval) {

		this.runStartInterval = runStartInterval;
	} // setRunStartInterval

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property LocalOrUtcTime.
	 */

	public enum LocalOrUtcTime {
		LOCAL_TIME,
		UTC_TIME
	}

	private LocalOrUtcTime	localOrUtcTime;

	/**
	 * This method returns the Job.localOrUtcTime property value. This property is described as follows:
	 * 
	 * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time
	 * values are synchronized worldwide by using the enumeration value 2, "UTC Time".
	 * 
	 * @return int current localOrUtcTime property value
	 * @exception Exception
	 */
	public LocalOrUtcTime getLocalOrUtcTime() {

		return this.localOrUtcTime;
	} // getLocalOrUtcTime

	/**
	 * This method sets the Job.localOrUtcTime property value. This property is described as follows:
	 * 
	 * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time
	 * values are synchronized worldwide by using the enumeration value 2, "UTC Time".
	 * 
	 * @param int new localOrUtcTime property value
	 * @exception Exception
	 */
	public void setLocalOrUtcTime(LocalOrUtcTime localOrUtcTime) {

		this.localOrUtcTime = localOrUtcTime;
	} // setLocalOrUtcTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property untilTime.
	 */
	private Date	untilTime;

	/**
	 * This method returns the Job.untilTime property value. This property is described as follows:
	 * 
	 * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval
	 * relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
	 * 
	 * @return Date current untilTime property value
	 * @exception Exception
	 */
	public Date getUntilTime() {

		return this.untilTime;
	} // getUntilTime

	/**
	 * This method sets the Job.untilTime property value. This property is described as follows:
	 * 
	 * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval
	 * relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
	 * 
	 * @param Date
	 *            new untilTime property value
	 * @exception Exception
	 */
	public void setUntilTime(Date untilTime) {

		this.untilTime = untilTime;
	} // setUntilTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property notify.
	 */
	private String	notify;

	/**
	 * This method returns the Job.notify property value. This property is described as follows:
	 * 
	 * The User who is to be notified upon the Job completion or failure.
	 * 
	 * @return String current notify property value
	 * @exception Exception
	 */
	public String getNotify() {

		return this.notify;
	} // getNotify

	/**
	 * This method sets the Job.notify property value. This property is described as follows:
	 * 
	 * The User who is to be notified upon the Job completion or failure.
	 * 
	 * @param String
	 *            new notify property value
	 * @exception Exception
	 */
	public void setNotify(String notify) {

		this.notify = notify;
	} // setNotify

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property owner.
	 */
	private String	owner;

	/**
	 * This method returns the Job.owner property value. This property is described as follows:
	 * 
	 * The User that submitted the Job, or the Service or method name that caused the job to be created.
	 * 
	 * @return String current owner property value
	 * @exception Exception
	 */
	public String getOwner() {

		return this.owner;
	} // getOwner

	/**
	 * This method sets the Job.owner property value. This property is described as follows:
	 * 
	 * The User that submitted the Job, or the Service or method name that caused the job to be created.
	 * 
	 * @param String
	 *            new owner property value
	 * @exception Exception
	 */
	public void setOwner(String owner) {

		this.owner = owner;
	} // setOwner

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property priority.
	 */
	private long	priority;

	/**
	 * This method returns the Job.priority property value. This property is described as follows:
	 * 
	 * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also
	 * present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a
	 * job.
	 * 
	 * @return long current priority property value
	 * @exception Exception
	 */
	public long getPriority() {

		return this.priority;
	} // getPriority

	/**
	 * This method sets the Job.priority property value. This property is described as follows:
	 * 
	 * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also
	 * present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a
	 * job.
	 * 
	 * @param long new priority property value
	 * @exception Exception
	 */
	public void setPriority(long priority) {

		this.priority = priority;
	} // setPriority

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property percentComplete.
	 */
	private int	percentComplete;

	/**
	 * This method returns the Job.percentComplete property value. This property is described as follows:
	 * 
	 * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the
	 * JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run
	 * data can be stored in this single-valued property. Note that the value 101 is undefined and will be not be allowed in the next major revision
	 * of the specification.
	 * 
	 * @return int current percentComplete property value
	 * @exception Exception
	 */
	public int getPercentComplete() {

		return this.percentComplete;
	} // getPercentComplete

	/**
	 * This method sets the Job.percentComplete property value. This property is described as follows:
	 * 
	 * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the
	 * JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run
	 * data can be stored in this single-valued property. Note that the value 101 is undefined and will be not be allowed in the next major revision
	 * of the specification.
	 * 
	 * @param int new percentComplete property value
	 * @exception Exception
	 */
	public void setPercentComplete(int percentComplete) {

		this.percentComplete = percentComplete;
	} // setPercentComplete

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property deleteOnCompletion.
	 */
	private boolean	deleteOnCompletion;

	/**
	 * This method returns the Job.deleteOnCompletion property value. This property is described as follows:
	 * 
	 * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by
	 * its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job
	 * completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
	 * 
	 * @return boolean current deleteOnCompletion property value
	 * @exception Exception
	 */
	public boolean isDeleteOnCompletion() {

		return this.deleteOnCompletion;
	} // getDeleteOnCompletion

	/**
	 * This method sets the Job.deleteOnCompletion property value. This property is described as follows:
	 * 
	 * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by
	 * its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job
	 * completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
	 * 
	 * @param boolean new deleteOnCompletion property value
	 * @exception Exception
	 */
	public void setDeleteOnCompletion(boolean deleteOnCompletion) {

		this.deleteOnCompletion = deleteOnCompletion;
	} // setDeleteOnCompletion

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property errorCode.
	 */
	private int	errorCode;

	/**
	 * This method returns the Job.errorCode property value. This property is described as follows:
	 * 
	 * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the
	 * JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run
	 * error can be stored in this single-valued property.
	 * 
	 * @return int current errorCode property value
	 * @exception Exception
	 */
	public int getErrorCode() {

		return this.errorCode;
	} // getErrorCode

	/**
	 * This method sets the Job.errorCode property value. This property is described as follows:
	 * 
	 * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the
	 * JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run
	 * error can be stored in this single-valued property.
	 * 
	 * @param int new errorCode property value
	 * @exception Exception
	 */
	public void setErrorCode(int errorCode) {

		this.errorCode = errorCode;
	} // setErrorCode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property errorDescription.
	 */
	private String	errorDescription;

	/**
	 * This method returns the Job.errorDescription property value. This property is described as follows:
	 * 
	 * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class.
	 * This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this
	 * single-valued property.
	 * 
	 * @return String current errorDescription property value
	 * @exception Exception
	 */
	public String getErrorDescription() {

		return this.errorDescription;
	} // getErrorDescription

	/**
	 * This method sets the Job.errorDescription property value. This property is described as follows:
	 * 
	 * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class.
	 * This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this
	 * single-valued property.
	 * 
	 * @param String
	 *            new errorDescription property value
	 * @exception Exception
	 */
	public void setErrorDescription(String errorDescription) {

		this.errorDescription = errorDescription;
	} // setErrorDescription

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property RecoveryAction.
	 */

	public enum RecoveryAction {
		UNKNOWN,
		OTHER,
		DO_NOT_CONTINUE,
		CONTINUE_WITH_NEXT_JOB,
		RE_RUN_JOB,
		RUN_RECOVERY_JOB
	}

	private RecoveryAction	recoveryAction;

	/**
	 * This method returns the Job.recoveryAction property value. This property is described as follows:
	 * 
	 * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 0 = "Unknown", meaning it is unknown as to
	 * what recovery action to take 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 2 =
	 * "Do Not Continue", meaning stop the execution of the job and appropriately update its status 3 = "Continue With Next Job", meaning continue
	 * with the next job in the queue 4 = "Re-run Job", indicating that the job should be re-run 5 = "Run Recovery Job", meaning run the Job
	 * associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
	 * 
	 * @return int current recoveryAction property value
	 * @exception Exception
	 */
	public RecoveryAction getRecoveryAction() {

		return this.recoveryAction;
	} // getRecoveryAction

	/**
	 * This method sets the Job.recoveryAction property value. This property is described as follows:
	 * 
	 * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 0 = "Unknown", meaning it is unknown as to
	 * what recovery action to take 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 2 =
	 * "Do Not Continue", meaning stop the execution of the job and appropriately update its status 3 = "Continue With Next Job", meaning continue
	 * with the next job in the queue 4 = "Re-run Job", indicating that the job should be re-run 5 = "Run Recovery Job", meaning run the Job
	 * associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
	 * 
	 * @param int new recoveryAction property value
	 * @exception Exception
	 */
	public void setRecoveryAction(RecoveryAction recoveryAction) {

		this.recoveryAction = recoveryAction;
	} // setRecoveryAction

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherRecoveryAction.
	 */
	private String	otherRecoveryAction;

	/**
	 * This method returns the Job.otherRecoveryAction property value. This property is described as follows:
	 * 
	 * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
	 * 
	 * @return String current otherRecoveryAction property value
	 * @exception Exception
	 */
	public String getOtherRecoveryAction() {

		return this.otherRecoveryAction;
	} // getOtherRecoveryAction

	/**
	 * This method sets the Job.otherRecoveryAction property value. This property is described as follows:
	 * 
	 * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
	 * 
	 * @param String
	 *            new otherRecoveryAction property value
	 * @exception Exception
	 */
	public void setOtherRecoveryAction(String otherRecoveryAction) {

		this.otherRecoveryAction = otherRecoveryAction;
	} // setOtherRecoveryAction

} // Class Job
