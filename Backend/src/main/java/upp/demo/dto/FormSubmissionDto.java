package upp.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FormSubmissionDto implements Serializable {
	private String fieldId;
	private String fieldValue;
}
