package upp.demo.service;

import lombok.RequiredArgsConstructor;
import upp.demo.dto.FormDto;
import upp.demo.dto.FormSubmissionDto;
import upp.demo.dto.TaskDto;

import java.util.List;

public interface ProcessInstanceService {
	FormDto startProcess(String processName);

	FormDto getFormFields(String taskId);

	String submitForm(String taskId, List<FormSubmissionDto> submissionDto);

	List<TaskDto> findNextTasks(String processId);

	List<TaskDto> getAllTasks(String name);
}
